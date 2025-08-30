import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        obj.close();
    }
}
