package functions;
import java.util.Scanner;
public class funtion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  number");
		int num = sc.nextInt();
		int t = num;
		int digit= 0;
		
		while(t>0) {
			digit++;
			t = t/10;	
		}
		int t2= num;
		int sum = 0;
		
		while (t2>0) {
			int rem = t2%10;
			int multi= 1;
			for(int i =1;i<= digit;i++) {
				multi= multi*rem;
				
			}
			sum+=multi;
			t2/=10;
		}
		if(num==sum) {
		System.out.println("number is armstrong number");
		}
		else {
			System.out.println("number is not a armstrong number");
		}
	}

}
