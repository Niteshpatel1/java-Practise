package oops;
import java.util.Scanner;
public class practice {

}

class run{
	Scanner sc= new Scanner(System.in);
	
	int num =sc.nextInt() ;
	int num1= sc.nextInt();
	
	void diff() {
		System.out.println(num1-num);
		
	}
	
}
class num{
	
	public static void main(String[] args) {
		
	    run r = new run();
		r.diff();
		System.out.println(r.num1+ r.num);
	}
}
