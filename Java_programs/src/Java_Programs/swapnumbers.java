package Java_Programs;

public class swapnumbers {

	public static void main(String[] args) 
	{
		int x=5,y=6;
		System.out.println("Before swap xvalue" +x+ "\n Yvalue" +y);
		
		x=x+y;//x=5+6=11
		y=x-y;//y=11-6=5 
		x=x-y;//11-5=6
		System.out.println("After swap xvalue" +x+ "\n Yvalue" +y);
		
		

	}

}
