import java.util.Scanner;
public class FindMaxInSeq {
    public static int max() {
        Scanner userInput = new Scanner (System.in);
        int c=Integer.MIN_VALUE;
        while (true) {
            int a = userInput.nextInt();
            if (a == 0) {
                break;
            }
            if (c < a) {
                c = a;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        System.out.println(max());
    }
}
