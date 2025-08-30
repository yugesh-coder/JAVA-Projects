import java.util.Scanner;
class Collatz{
	
	static void seqNum (int num)
    {
		System.out.println(num);
		while(num!=1){
			if(num%2==0){
				num=num/2;
			}
			else{
				num=(3*num)+1;
			}
			System.out.println(num);
		}
	}
	
	public static void main(String[]args){
	Scanner obj=new Scanner(System.in);
	int num=obj.nextInt();
	
	seqNum(num);
	
	}
}