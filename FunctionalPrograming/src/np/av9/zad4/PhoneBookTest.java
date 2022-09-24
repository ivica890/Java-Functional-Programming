package np.av9.zad4;

import java.util.*;

class DuplicatePhoneException extends Exception {
    public DuplicatePhoneException(String phone) {
        super(String.format("Duplicate numbers : %s", phone));
    }
}

class Contact implements Comparable<Contact> {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public int compareTo(Contact o) {
        int res = this.name.compareTo(o.name);
        if (res == 0) {
            return this.phone.compareTo(o.phone);
        } else {
            return res;
        }

    }

    @Override
    public String toString() {
        return String.format("%s %s",name,phone);
    }
}

class PhoneBook {
    Set<String> allPhoneNumbers;
    Map<String, Set<Contact>> contactsBySubstring;

    PhoneBook() {
        allPhoneNumbers = new HashSet<>();
        contactsBySubstring = new HashMap<>();
    }

    private List<String> getSubstring(String phone) {
        List<String> result = new ArrayList<>();
        for (int len = 3; len <= phone.length(); len++) {
            for (int i = 0; i <= phone.length() - len; i++) {
                result.add(phone.substring(i, len));
            }
        }
        return result;
    }

    public void addContact(String name, String phone) throws DuplicatePhoneException {
        if (allPhoneNumbers.contains(phone)) {
            throw new DuplicatePhoneException(phone);
        } else {
            allPhoneNumbers.add(phone);
            Contact c = new Contact(name, phone);
            List<String> subnumbers = getSubstring(phone);
            for (String subnumber : subnumbers) {
                contactsBySubstring.putIfAbsent(subnumber, new TreeSet<>());
                contactsBySubstring.get(subnumber).add(c);
            }
        }
    }

    public void contactsByNumber(String number) {
        contactsBySubstring.get(number)
                .forEach(c -> System.out.println(c));
    }

    public void contactsByName(String part) {
    }
}

public class PhoneBookTest {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; ++i) {
            String line = scanner.nextLine();
            String[] parts = line.split(":");
            try {
                phoneBook.addContact(parts[0], parts[1]);
            } catch (DuplicatePhoneException e) {
                System.out.println(e.getMessage());
            }
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            String[] parts = line.split(":");
            if (parts[0].equals("NUM")) {
                phoneBook.contactsByNumber(parts[1]);
            } else {
                phoneBook.contactsByName(parts[1]);
            }
        }
    }

}

// Вашиот код овде

