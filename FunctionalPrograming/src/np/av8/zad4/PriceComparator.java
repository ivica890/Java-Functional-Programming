package np.av8.zad4;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int res = Float.compare(o1.price, o2.price);
        if (res == 0) {
            return o1.title.compareTo(o2.title);
        } else {
            return res;
        }
    }
}
