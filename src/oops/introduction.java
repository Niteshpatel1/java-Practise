package oops;


public class introduction {
	

}


class xyz{
	int i= 12;
	void show(){
		System.out.println(i);
		
	}
	
}

class abc{
	int s=8;
	
	void str() {
		System.out.println(s);
	}
	
	
}


class qwe{
	
	public static void main(String[] args) {
		
	
	xyz x = new xyz();
	abc a = new abc();
	System.out.println(x.i + a.s);
	
	}	
}
