package np.av8.zad4;

import java.util.Comparator;

public class TitleAndPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int res = o1.title.compareTo(o2.title);

        if (res == 0) {
            return Float.compare(o1.price, o2.price);
        } else {
            return res;
        }
    }

}
