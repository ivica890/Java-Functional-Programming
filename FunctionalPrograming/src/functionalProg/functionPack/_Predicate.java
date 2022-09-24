package functionalProg.functionPack;

import java.util.function.Predicate;

public class _Predicate {
    //Prima nekakva vrednost i proverva dali e true ili false isto kako boolean funkcija
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("075392303"));
        System.out.println(isPhoneNumberValid("085392303"));

        isPhoneNumberValidLambdaPredicate.test("075392303");
        getIsPhoneNumberValidPredicate.test("085392303");
        System.out.println(getIsPhoneNumberValidPredicate.and(containsNumber3).test("075392303"));
    }

    //Predicate so lambda
    static Predicate<String> isPhoneNumberValidLambdaPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 9;

    //Predicate peski
    static Predicate<String> getIsPhoneNumberValidPredicate = new Predicate<String>() {
        @Override
        public boolean test(String phoneNumber) {
            if (phoneNumber.startsWith("07") && phoneNumber.length() == 9)
                return true;
            return false;
        }
    };

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 9;
    }
}
