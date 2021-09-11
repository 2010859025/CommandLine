import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(args).map(String::toLowerCase).forEach(System.out::println);

        System.out.println("Test");

        System.out.println("Nächster Commit");

        System.out.println("Zweiter Commit");
    }
}
