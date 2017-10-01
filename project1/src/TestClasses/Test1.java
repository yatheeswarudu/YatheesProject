package TestClasses;

public class Test1 {
static int j;
	public static void main(String args[])
	{

	main1();
	System.out.println("inside the methods"+args[0]);
	main1(10,29);
	main1(10);
	main1(10,20,30,30);
		
	}

	public static void main1(int... is){
		
		for(int y:is){
		System.out.println(y);
		}
	}	
	
}
