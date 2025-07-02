package Java_Programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;
public class TCS
{
	public static void main(String[] args)
	{
		
		List<Integer> numbers=Arrays.asList(789,68,554,877);
		
		String largestNumber=findBiggestNumber(numbers);
		
		System.out.println(largestNumber);
		
	}
	
	public static String findBiggestNumber(List<Integer> nums)
	{
		Collections.sort(nums,(a,b)->(String.valueOf(b)+a).compareTo(String.valueOf(a)+b));
		
		return nums.stream().map(Object::toString).collect(Collectors.joining(""));
		
		
	}

}
