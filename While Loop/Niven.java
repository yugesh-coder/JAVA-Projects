import java.util.Scanner;
public class Niven {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int digit,sum=0,cnum=num;

        while(num!=0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }

        if(cnum%sum==0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not a Niven Number");
        }
        obj.close();
    }
}
