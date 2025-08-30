import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int num=obj.nextInt();
        int count=0;
        while(num!=0){
            for(int i=1;i<=num/2;i++){
                if(num%i==0) {
                    count++;
                }
            }
        }
        if(count==1){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    }
}
