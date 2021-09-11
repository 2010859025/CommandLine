import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(args).map(String::toLowerCase).forEach(System.out::println);

        System.out.println("Test");

        System.out.println("Nächster Commit");

        System.out.println("Zweiter Commit");
        System.out.println("Zweiter Commit");
        System.out.println("Zweiter Commit");

        int num = 0;

    }

    public static void myTestMethod(int a) {
        System.out.println("My test method");

        System.out.println(a);
    }


}
