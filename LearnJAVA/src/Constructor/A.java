package Constructor;

public class A extends ConstructorOverLoading {
	
	public A() {
		super("Call one arg cnst", 19);
		System.out.println("class A cnstructor");
	}
	public A(int b) {
		super();
		System.out.println("2nd  cnstructor");
	}
	public static void main(String[] args) {
		
		A obj2=new A();
		A obj3=new A(20);
		
	
	}
}
