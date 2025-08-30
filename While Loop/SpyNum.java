import java.util.Scanner;
public class SpyNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int digit, product = 1, sum = 0;
        while (num != 0) {
            digit = num % 10;
            product = product * digit;
            sum = sum + digit;
            num = num / 10;
        }
        if (product == sum) {
            System.out.println("Spy Num");
        } else {
            System.out.println("Not a Spy Num");
        }
        obj.close();
    }
}
