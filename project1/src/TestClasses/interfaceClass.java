package TestClasses;

interface interfaceClass1 {
	
	
	public void method1();

}
class derivation implements interfaceClass1
{
	public void method1(){
	System.out.println("Hellow1");	
	}
	public void method2(){
	System.out.println("hellow2");
	}
}
public class interfaceClass{
	public static void main(String args[]){
		interfaceClass1 c1=new derivation();
		c1.method1();
		((derivation) c1).method2();
	}
	
}