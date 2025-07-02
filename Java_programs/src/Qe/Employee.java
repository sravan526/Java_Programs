package Qe;


public class Employee
{

	public static void main(String[] args)
	{
     int n=100;
     int n1[]=new int[10];
     int count=0; 
     for(int i=0;i<=n;i++)
     {
    	 if(isPrime(i))
    	 {
    		 n1[i]=i;
    		 
    		System.out.println(i+" ");
    		count =count+i;
    	 }
     }
     
     System.out.println("all prime numbers count from 1-100 "+count);

		
		

	}
	
	static boolean isPrime(int n)
	{
		if(n==1||n==0) 
			return false;
		for(int i=2;i<n;i++)
		{
			
			if(n%i==0) return false;
		}
		return true;		
		
	}

}


