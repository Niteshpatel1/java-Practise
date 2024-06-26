package oops;

public  class sum {

public static int sumofarry(int[]arr) {
	int sum = 0;
	for (int i=0; i<arr.length; i++) {
		sum= sum+arr[i];
		
	}
	return sum;
	   
   }

 public static int maxofarry(int[]arr)
 {
	 int max = arr[0];
	 for(int i = 0 ; i<arr.length; i++)
	 {
		 if(max < arr[i]) 
		 {
			 max= arr[i];
		 }
	 }
	 return max;
 }

 public static int[] evenindex(int[]arr){
	 int []value= new int[arr.length];
	 for(int i = 0 ; i<arr.length; i++) {
		 if(i%2==0) {
			 for(int j=0; j<arr.length; j++) {
				 value[j]= arr[i]; 
			 }
			
		 }
	 }
	  
	 return value;
 }
 
 
 public static void main(String[] args) {
	
		int[]arr = {1,23,43,34,56};

		System.out.println(maxofarry(arr));
		System.out.println(sumofarry(arr));
		
	 
}
}
