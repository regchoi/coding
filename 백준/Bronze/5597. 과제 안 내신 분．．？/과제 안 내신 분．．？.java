import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[31];
        for (int i = 1; i < 29; i++) {
            a = sc.nextInt();
            arr[a] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }

    }
}