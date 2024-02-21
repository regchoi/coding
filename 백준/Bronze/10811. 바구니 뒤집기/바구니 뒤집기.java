import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b = 0;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        int[] arr = new int[a + 1];
        for (int i = 1; i < a + 1; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < b; i++) {
            int x , y = 0;
            x = sc.nextInt();
            y = sc.nextInt();
            int tmp = 0;

            while (true) {
                if (x > y) {
                    break;
                } else {
                    tmp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = tmp;
                    x++;
                    y--;
                }
            }

        }

        for (int i = 1; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
}