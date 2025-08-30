import java.util.Scanner;
class Amstrong {
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        int num=obj.nextInt();

        int digit, sum=0;
        int cnum=num;

        while(num!=0){
            digit=num%10;
            sum=sum+(int)Math.pow(digit,3);
            num=num/10;
        }
        if(sum==cnum){
            System.out.println("Amstrong number");
        }
        else{
            System.out.println("Not a amstrong number");
        }
        obj.close();
    }
}

