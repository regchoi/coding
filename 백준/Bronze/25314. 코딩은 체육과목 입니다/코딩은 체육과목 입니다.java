import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        b = a / 4;

        for (int i = 0; i < b; i++) {
            System.out.printf("long ");
        }
        System.out.printf("int");

    }

}