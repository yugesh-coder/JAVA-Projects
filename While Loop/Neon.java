import java.util.Scanner;
class Neon{
	public static void main(String[]args){
		Scanner obj=new Scanner (System.in);
		int num=obj.nextInt();
		int cnum=num;
		cnum=(int)Math.pow(cnum,2);
		int sum=0,digit;
		while(cnum!=0){
			digit=cnum%10;
			sum=sum+digit;
			cnum=cnum/10;
		}
		if(sum==num){
			System.out.println("Neon");
		}
		else{
            System.out.println("Not Neon");
		}
	}
}