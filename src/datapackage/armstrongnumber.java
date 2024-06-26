package datapackage;
import java.util.Scanner;
public class armstrongnumber {
	public static void main(String[] args) {
		
	
	Scanner c = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = c.nextInt();
	
	int t1 = num;
	int digit = 0;
	 while(t1>0) {
		 digit ++;
		 t1/=10;
	  }
	 
	 int t2 = num;
	 int sum =0;
	
	 while(t2>0) {
		 int rem = t2%10;
		 int multi = 1;
		 for (int i=1; i<=digit;i++) {
			 multi= rem * multi;
			 	 
		 }
		 sum = sum+ multi ;
		 t2/=10;
		 
		  }
	 if (num==sum) {
		 System.out.println("Number is a armstrong number");
		 
	 }
	 else 
		 System.out.println("number is not an armstrong number");
	 
	}

}
