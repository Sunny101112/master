package optional.opt;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalPresentExample {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("Hello Optional");

        System.out.println(stringOptional.isPresent());

        stringOptional.ifPresent((s -> System.out.println("value is : " + s)));
        
        //stringOptional.ifPresent(System.out::println);
    }
}
