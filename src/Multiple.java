import java.util.stream.Stream;

public class Multiple {
    public static void main(String[] args) {

        Stream.iterate(0, i -> i + 1)
                .filter(number -> number < 1000)
                .filter(number -> ((number % 3 == 0) || (number % 5 == 0)))
                .limit(1000)
          //      .sum(number)
                .forEach(System.out::println);
    }
}
