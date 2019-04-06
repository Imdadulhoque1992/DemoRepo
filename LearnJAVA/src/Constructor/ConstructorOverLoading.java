package Constructor;

public class ConstructorOverLoading {
	String str;
	int i;
	public ConstructorOverLoading(){
		System.out.println(" default Constructor");
	}
	
public	ConstructorOverLoading(String str, int i) {
	this.str=str;
	this.i=i;
	System.out.println("one arg Constructor"+" "+i);
}
public static void main(String[] args) {
	ConstructorOverLoading obj=new ConstructorOverLoading();
	ConstructorOverLoading obj1=new ConstructorOverLoading("Call one arg Constructor", 19);
}
}
