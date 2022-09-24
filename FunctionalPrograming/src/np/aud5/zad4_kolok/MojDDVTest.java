package np.aud5.zad4_kolok;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

enum TaxType {
    A, B, V
}

class AmountNotAllowedException extends Exception{
    public AmountNotAllowedException(int amount) {
        super(String.format("Reciept with amount %d is not allowed to be scanned", amount));
    }
}

class Item {
    private int price;
    private TaxType tax;



    public Item(int price, TaxType tax) {
        this.price = price;
        this.tax = tax;
    }

    public Item(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TaxType getTax() {
        return tax;
    }

    public void setTax(TaxType tax) {
        this.tax = tax;
    }

    public double getCalculatedTax(){
        if(tax.equals(TaxType.A)) return 0.18 *price;
        else if(tax.equals(TaxType.B)) return 0.05 *price;
        else return 0;
    }
}

class Receipt implements Comparable<Receipt> {
    private long id;
    private List<Item> items;

    public Receipt(long id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public Receipt(long id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    public static Receipt create (String line) throws AmountNotAllowedException {
       String [] parts = line.split("\\s+");
       long id = Long.parseLong(parts[0]);
       List<Item> items = new ArrayList<>();

        Arrays.stream(parts)
                .skip(1)
                .forEach(i -> {
                    if (Character.isDigit(i.charAt(0))){
                        items.add(new Item(Integer.parseInt(i)));
                    }else {
                        items.get(items.size() - 1).setTax(TaxType.valueOf(i));
                    }
                });

        if(totalAmount(items) > 30000){
            throw new AmountNotAllowedException(totalAmount(items));
        }
        return new Receipt(id,items);
    }

    public static int totalAmount(List<Item> items){
        return items.stream()
                .mapToInt(Item::getPrice).sum();
    }

    public int totalAmount(){
        return items.stream()
                .mapToInt(Item::getPrice).sum();
    }

    public double taxReturns(){
        return items.stream()
                .mapToDouble(Item::getCalculatedTax).sum();
    }


    @Override
    public int compareTo(Receipt other) {
        return Comparator.comparing(Receipt::taxReturns)
                .thenComparing(Receipt::totalAmount)
                .compare(this,other);
    }

    @Override
    public String toString() {
        return id + " " +totalAmount() + " " + taxReturns();
    }
}

class MojDDV {

    private List<Receipt> receipts;

    public MojDDV() {
        this.receipts = new ArrayList<>();
    }

    public void readRecords(InputStream in) {
        receipts = new BufferedReader(new InputStreamReader(in))
                .lines()
                .map(line -> {
                    try {
                        return Receipt.create(line);
                    } catch (AmountNotAllowedException e) {
                        System.out.println(e.getMessage());
                        return null;
                    }
                }).collect(Collectors.toList());

        receipts = receipts.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    public void printSorted(PrintStream out) {
        PrintWriter printWriter = new PrintWriter(out);

        receipts.stream()
                        .forEach(i -> out.print(i.toString()));

        printWriter.flush();
    }

    public void printStatistics(PrintStream out) {
        PrintWriter printWriter = new PrintWriter(out);

        DoubleSummaryStatistics summaryStatistics = receipts.stream()
                .mapToDouble(Receipt::taxReturns).summaryStatistics();

        printWriter.println(String.format("min: %.2f, max: %.2f count: %.2f average: %.2f",
                summaryStatistics.getMin(),
                summaryStatistics.getMax(),
                summaryStatistics.getCount(),
                summaryStatistics.getAverage()));

        printWriter.flush();
    }
}

public class MojDDVTest {
    public static void main(String[] args) {
        MojDDV mojDDV = new MojDDV();

        System.out.println("===Reading records from input stream");
        mojDDV.readRecords(System.in);

        System.out.println("===Printing sorted records by tax===");
        mojDDV.printSorted(System.out);

        System.out.println("===Printing summary statistics for tax returns to output stream===");
        mojDDV.printStatistics(System.out);
    }
}
