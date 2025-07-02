package hands_on;

import java.util.HashSet;

public class Digit_Sum 
{
    public static void main(String args[])
    {
      int arr1[]= {1,2,3,4,5};
      int arr2[]= {2,4,6,8,10};
      
  
      HashSet<Integer> map =new HashSet<Integer>();
      
      
      for(int i:arr1)
      
    	  map.add(i);
      for(int j:arr2)
      {
    	  if(map.contains(j))
    	  System.out.print(j);//playwrite & karate &DS Hashmap, String,arrays & Collections
      }
      
      }
      
      
    }
    
  
  