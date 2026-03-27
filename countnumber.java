import java.util.Scanner;

public class addnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num > 0) {
            int digit = num % 10;   // get last digit

            if (digit == 3) {
                count++;
            }

            num = num / 10;   // remove last digit
        }

        System.out.println("Number of times 2 appears: " + count);
    }
}
