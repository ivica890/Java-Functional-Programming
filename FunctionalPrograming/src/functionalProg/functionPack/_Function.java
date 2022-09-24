package functionalProg.functionPack;

import java.util.function.BiFunction;
import java.util.function.Function;


public class _Function {

    public static void main(String[] args) {
        System.out.println("Function");
        System.out.println();

        //Function
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementFunctionLambda.apply(1);
        int increment3 = incrementFunction.apply(1);
        System.out.println(increment2);
        System.out.println(increment3);

        int multiply = multipleBy10.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> incrementAndMultiple = incrementFunctionLambda.andThen(multipleBy10);
        System.out.println(incrementAndMultiple.apply(4));

        //BiFunction
        System.out.println();
        System.out.println("BiFunction");


        int biFunctionTest = biFunctionLambda.apply(4, 100);
        System.out.println(biFunctionTest);

    }

    // Prima eden argument i vrsi nekakva akcija na toj argument
// i dava vrednost posle akcijata vrz toj argument koj go primi
// praj zamena na obicnite funkcii --- funkcionalno programiranje
    //Function so lambdaExpr
    static Function<Integer, Integer> incrementFunctionLambda = number -> number + 1;
    //Function peski
    static Function<Integer, Integer> incrementFunction = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer integer) {
            return integer + 1;
        }
    };

    static Function<Integer, Integer> multipleBy10 = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }

    //Isto kako function no prima 2 argumenti i ima eden output
    //BiFunction
    //BiFunctionLambda
    static BiFunction<Integer, Integer, Integer> biFunctionLambda =
            (number1, number2) -> (number1 + 1) * number2;
    //BiFunction peski
    static BiFunction<Integer, Integer, Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {
        @Override
        public Integer apply(Integer integer, Integer integer2) {
            return (integer + 1) * integer2;
        }
    };

    static int incrementByOneAndMultiply(int num, int numMult) {
        return (num + 1) * numMult;
    }


}
