

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value =4;  // No restrictions for instances variables

    public static void main(String[] args) {

         //local variable

        Consumer<Integer> c1 = (i) -> {
            value++;
            System.out.println(value+i);
        };

        //value =6;

        c1.accept(4);

    }
}

// Advantages of effectively final
//1- Easy to perform concurrency operations
//2- Promotes functional programming and demotes imperative style programming