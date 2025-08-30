import java.util.Scanner;
public class F_L_Swap {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int divisor=(int)Math.pow(10,(int)Math.log10(num));

        int fdigit=num/divisor;
        int ldigit=num%10;
        num=(((num%divisor)/10)*10)+fdigit;
        num=(ldigit*divisor)+num;
        System.out.println(num);
        obj.close();
    }
    
}
