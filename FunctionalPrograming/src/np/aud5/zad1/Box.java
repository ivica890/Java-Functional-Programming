package np.aud5.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Box<E extends Drawable> {

    private List<E> elements;
    public static Random random = new Random();

    public Box() {
        elements = new ArrayList<>();
    }

    public void add(E element){
        elements.add(element);
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public E draw(){
        if(isEmpty()) return null;
        int index = random.nextInt(elements.size());
        E elem = elements.get(index);
        elements.remove(elem);
        return elem;
    }

}
