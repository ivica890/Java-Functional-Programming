package np.av8.zad4;

public class Book {
    String title;
    String category;
    float price;

    public Book(String title, String category, float price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) %.2f", title, category, price);
    }
// treba da koristam Comparator zaradi to so nemozam da sporedam poke od 1 rabota so Comperable interface
//    @Override
//    public int compareTo(Book o) {
//        int res = this.title.compareTo(o.title);
//        if(res == 0)
//            return Float.compare(this.price,o.price);
//        return res;
//    }
}
