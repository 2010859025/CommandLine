import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(args).map(String::toLowerCase).forEach(System.out::println);
    }
}
