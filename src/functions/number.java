package functions;

public class number {
	
}
class prime{
	
   String how(int a)
   {
	  if ( a%2!=0 && a%3!= 0)
	  {
	  return "Prime number";
	  }
	  else 
	  {
		  return "not a prime number";
	  }
   }
}
   
class str
   {
	public static void main(String[] args) {
		prime p = new prime();
		p.how(2);
		System.out.println(p.how(1));
		
	}
	  
	   
   }

