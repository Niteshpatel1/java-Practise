package datapackage;

public class armstrong {
	public static void main(String[] args) {
		
		for(int j =100; j<=10000; j++) {
			
			int num = j;
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
			System.out.println(num);
			
				
	   }
	}

  }
}
