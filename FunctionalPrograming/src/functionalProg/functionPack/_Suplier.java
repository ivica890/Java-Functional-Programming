package functionalProg.functionPack;

import java.util.List;
import java.util.function.Supplier;

public class _Suplier {
    // Ne prima nikakvi vrednosti no ni vrakja nesto
    public static void main(String[] args) {
        System.out.println(getConnectionUrl());
        System.out.println(getConnectionUrlLabmda.get());
        System.out.println(stringSupplier.get());
    }

    //Suplier so lambda
    static Supplier<List<String>> getConnectionUrlLabmda = () ->
            List.of("jdbc://localhost:5432/users",
                    "jdbc://localhost:5433/users");

    //Suplier peski
    static Supplier<String> stringSupplier = new Supplier<String>() {
        @Override
        public String get() {
            return "jdbc://localhost:5432/users";
        }
    };

    static Supplier<String> stringSupplier1 = () -> "Zdravo";

    static Supplier<String> stringSupplier2 = new Supplier<String>() {
        @Override
        public String get() {
            return "Zdravo";
        }
    };

    static String print(){
        return "Zdravo";
    }
    static String getConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
}
