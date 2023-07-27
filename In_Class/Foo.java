package In_Class;

public class Foo{
	private static int noOfInvocation;
	
	public int getInvocation(){
		return noOfInvocation;
	}

	public void my_func(){
		noOfInvocation++;
	}
		
	public static void main(String[] args){
		Foo f1 = new Foo();
		f1.my_func();
		f1.my_func();
		
		System.out.println(f1.getInvocation()); // first print statement
		
		Foo f2 = new Foo();
		f2.my_func();
		
		System.out.println(f2.getInvocation()); // second print statement
			
	}
}

