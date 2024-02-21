import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,c = 0;
        int answer = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        int[] b = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        
        c = sc.nextInt();
        for (int i = 0; i < b.length; i++) {
            if (b[i] == c) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}
