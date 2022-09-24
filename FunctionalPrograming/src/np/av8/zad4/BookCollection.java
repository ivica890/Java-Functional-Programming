package np.av8.zad4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookCollection {
    List<Book> books;
    BookCollection (){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getCheapestN(int n) {
        return  books.stream()
                .sorted(new PriceComparator())
                .limit(n)
                .collect(Collectors.toList());
    }

    public void printByCategory(String category) {
        books.stream()
                .filter(book -> book.category.equalsIgnoreCase(category))
                .sorted(new TitleAndPriceComparator())
                .forEach(book -> System.out.println(book));
    }
}
