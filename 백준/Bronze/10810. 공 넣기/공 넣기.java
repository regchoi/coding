import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int[] arr = new int[a];
        
        int x, y, z = 0;
        for (int i = 0; i < b; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            for (int j = x - 1; j < y; j++) {
                arr[j] = z;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
}