import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long a, b = 0;
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();

        for (int i = 0; i < b; i++) {
            long x, y = 0;
            x = sc.nextLong();
            y = sc.nextLong();
            a -= x * y;
        }
        if (a != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
        

    }

}