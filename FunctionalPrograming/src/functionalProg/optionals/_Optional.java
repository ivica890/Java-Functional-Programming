package functionalProg.optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {

     Optional.ofNullable("john@gmail.com")
                     .ifPresent(value -> System.out.println("Sending email "+ value));




    }
}
