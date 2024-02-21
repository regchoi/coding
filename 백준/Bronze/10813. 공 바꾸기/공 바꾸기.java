import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int x, y, tmp = 0;
        for (int i = 0; i < b; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            tmp = arr[x - 1];
            arr[x - 1] = arr[y - 1];
            arr[y - 1] = tmp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
}
