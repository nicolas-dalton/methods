package utils;

import java.util.ArrayList;
import java.util.Set;

public interface IntegerUtils_Dalton 
{

	//pre-condition: nothing
	//post-condition: (rv = true) if and only if k % 2 = 0, otherwise (rv = false)
	//part of post-condition (STRAIGHTFORWARD): isEven(2) = true
	//part of post-condition (EXTREME): isEven(0)= true
	//part of post-condition (BIZZARE/EXOTIC): isEven(-2) =true;
	public static boolean isEven(int k)
	{
		boolean isEvenBoolean=(k%2==0);
		return isEvenBoolean;
	}
	//pre-condition: nothing
	//post-condition: (rv = true) if and only if k % 2 != 0, otherwise (rv = false)
	//part of post-condition (STRAIGHTFORWARD): isOdd(6)= false;
	//part of post-condition (EXTREME): isOdd(0)= false;
	//part of post-condition (BIZZARE/EXOTIC): isOdd(-7)= true;
	public static boolean isOdd(int k)
	{
		boolean isOddBoolean=(k%2!=0);
		return isOddBoolean;
	}
	//pre-condition: nothing
	//post-condition: rv equals true if and onlyif k >=2 && cannot be divided by any other numbers besides 
		//1 and itself. if k<2, then rv= false
	//part of post-condition (STRAIGHTFORWARD): isPrime(3)= true;
	//part of post-condition (EXTREME): isPrime(1)= false;
	//part of post-condition (BIZZARE/EXOTIC): isPrime(0)= false;
	public static boolean isPrime(int k)
	{
		boolean isPrimeBoolean= true;
		if(k<=1)
		{
			isPrimeBoolean= false;
		}
		for(int i=2; i<k;i++)
		{
			if(k%i==0)
			{
				isPrimeBoolean=false;
			}
		}
		return isPrimeBoolean;
	}

	//pre-condition: (m != 0 && n != 0) 
	//post-condition: rv = biggest integer that will divide into both m and n 
		//if m = 0, then rv= n, if n = 0 then rv = m.
	//part of post-condition (STRAIGHTFORWARD): greatestCommonFactor(8,12) = 4;
	//part of post-condition (EXTREME): greatestCommonFactor(3,3) = 3;
	//part of post-condition (BIZZARE/EXOTIC): greatestCommonFactor(0,20) = 20;
	public static int greatestCommonFactor(int m, int n)
	{
		ArrayList<Integer> array_m = new ArrayList<Integer>();
		ArrayList<Integer> array_n = new ArrayList<Integer>();
		if(m==0)
		{
			return n;

		}
		if(n==0)
		{
			return m;
		}
		if(m<0)
		{
			m= m*-1;
		}
		if(n<0)
		{
			n= n*-1;
		}


		for(int i=1; i<m+1; i++)
		{
			if(m%i==0)
			{
				array_m.add(i);
			}
		}
		for(int i=1; i<n+1; i++)
		{
			if(n%i==0)
			{
				array_n.add(i);
			}
		}


		array_m.retainAll(array_n);

		int greatestCommonFactorValue= array_m.get(0);
		for(int i=0; i< array_m.size(); i++)
		{
			if(array_m.get(i)>greatestCommonFactorValue)
			{
				greatestCommonFactorValue= array_m.get(i);
			}
		}
		return greatestCommonFactorValue;

	}

	//pre-condition: (k < maximum) && (k ! = 0)
	//post-condition: rv = maximum if and only if maximum % k = 0, 
		//otherwise rv equals to the closet multiple to maximum 
	//part of post-condition (STRAIGHTFORWARD): getGreatestConstrainedMultiple(3,50)= 16
	//part of post-condition (EXTREME): getGreatestConstrainedMultiple(10, 1199) = 1190
	//part of post-condition (BIZZARE/EXOTIC):getGreatestConstrainedMultiple(0,20  ) = 0
	public static int getGreatestConstrainedMultiple(int k, int maximum)
	{
		double doubleValue=0.0;
		int convertsDoubleValueToWholeInteger=0;
		if(k==0)
		{
			return 0;
		}
		if(maximum%k==0)
		{
			return maximum;
		} 
		else
		{
			doubleValue= maximum/k;
			convertsDoubleValueToWholeInteger=(int)(doubleValue);
		}
		int greatestConstrainedMultipleValue= k*convertsDoubleValueToWholeInteger;
		return greatestConstrainedMultipleValue;
	}

	//pre-condition: integerSet!= {null} || integerSet != {}
	//post-condition: returns the biggest integer in intArray, 
		// if (intArray.size()==1), then (rv = intArray[0]),  
		// otherwise there exists an element, i, in intArray such that intArray[i] > intArray[0], 
		// which means rv = intArray[i]
	//part of post-condition (STRAIGHTFORWARD): getMaximum({1,2,3,4,5,680,709,113,800}= 800
	//part of post-condition (EXTREME): getMaximum({17}) = 17
	//part of post-condition (BIZZARE/EXOTIC): getMaximum({1,1,1,1,1,1}) = 1
	public static int getMaximum(Set<Integer> integerSet)
	{
		ArrayList<Integer> integerList = new ArrayList<Integer>(integerSet);
		int maxValue= integerList.get(0);
		for(int i=0; i< integerList.size(); i++)
		{
			if(integerList.get(i)>maxValue)
			{
				maxValue= integerList.get(i);
			}
		}
		return maxValue;
	}

	//pre-conditon: intArray!= [null] || intArray.length != 0
	//post-condition: returns the smallest integer in intArray, 
		//if (intArray.size()==1), then (rv = intArray[0]),  
		// otherwise there exists an element, i, in intArray such that intArray[i] < intArray[0], 
		// which means rv = intArray[i]
	// there exists an element, i, such that intArray[i] < intArray[0].
	//part of post-condition (STRAIGHTFORWARD): getMinimum([2,4,5,6,7]) = 2
	//part of post-condition (EXTREME): getMinimum([17]) = 17
	//part of post-condition (BIZZARE/EXOTIC): getMinimum([1,1,4,1,1,1]) = 1
	public static int getMinimum(int[] intArray)
	{
		int minValue=intArray[0];
		for(int i=0; i<intArray.length;i++)
		{
			if(intArray[i]<minValue)
			{
				minValue=intArray[i];
			}
		}
		return minValue;
	}

	//pre-conditon: intArray!=null
	//post-condition: rv is true if and only if all the elements in intArray are in ordered, meaning
		// that every element in intArray will be greater than intArray[0].
		//(if intArray.length==0, then rv is true)
	//part of post-condition (STRAIGHTFORWARD): isSorted([1,4,6,8,9,10]) =  true
	//part of post-condition (EXTREME): isSorted([11]) =  true
	//part of post-condition (BIZZARE/EXOTIC): isSorted([-1,-1,-1,-1,-1)] = true
	public static boolean isSorted(int[] intArray)
	{
		boolean isSortedBoolean= true;
		if(intArray.length==0)
		{
			return isSortedBoolean;
		}
		int intArray0= intArray[0];
		for(int i=0; i<intArray.length; i++)
		{
			if(intArray[i]<intArray0)
			{
				isSortedBoolean= false;
				break;
			}
		}
		return isSortedBoolean;
	}
	//pre-conditon: intArray != [null] 
	//post-condition: rv equals the smallest index of intArray that equals to target value
		// if there are duplicates in intArray, that are equal to target value, then rv = the 
		//the index of the first element in intArray that equals to target value
		//if there does not exist an element in intArray, that equals target, then rv = -1)
	//part of post-condition (STRAIGHTFORWARD): getSmallestIndexOfMatch([1,4,6,8,9,10], 4) = 1
	//part of post-condition (EXTREME):getSmallestIndexOfMatch([0,4,-5,11,9,,7], 20)= -1
	//part of post-condition (BIZZARE/EXOTIC): getSmallestIndexOfMatch([-1,-1,-1,-1,-1], -1)=0;
	public static int getSmallestIndexOfMatch(int[] intArray, int target)
	{
		int smallestIndexValue=-1;
		if(intArray.length==0)
		{
			return smallestIndexValue;
		}
		for(int i=0; i<intArray.length;i++)
		{
			if(target== intArray[i])
			{
				smallestIndexValue=i;
				break;
			}
		}
		return smallestIndexValue;
	}
	//pre-condition: nothing
	//post-condition: rv equals to the reverse order of digits in k 
	//part of post-condition (STRAIGHTFORWARD): reverse(24) = 42
	//part of post-condition (EXTREME): reverse(1788991)= 1998871
	//part of post-condition (BIZZARE/EXOTIC): reverse(-89)= -98
	public static int reverse(int k)
	{
		int reversedInteger=0;
		String reversedString="";
		if(k>0)
		{
			String convertIntgerToString= String.valueOf(k);
			for(int i=convertIntgerToString.length()-1;i>=0; i--)
			{
				char ch= convertIntgerToString.charAt(i);
				reversedString+=ch;
			}
			reversedInteger= Integer.valueOf(reversedString);
		}
		else
		{
			k=(k*-2)/2;
			reversedString+="-";
			String convertIntgerToString= String.valueOf(k);
			for(int i=convertIntgerToString.length()-1;i>=0; i--)
			{
				char ch= convertIntgerToString.charAt(i);
				reversedString+=ch;
			}
			reversedInteger= Integer.valueOf(reversedString);
		}
		return reversedInteger;
	}
	//pre-conditon: k >= 0
	//post-condtion: rv equals the sum of all the digits in k, if k is 1 digit, then rv = k, 
	//(sum of digits in k < 9), so if (sum of digits in k) > 9,
	// then rv = ( sum - 9 * (# of single nines in k) ).
	//part of post-condition (STRAIGHTFORWARD): sumthing(25)= 7 
	//part of post-condition (EXTREME):sumthing(134234) = 8
	//part of post-condition (BIZZARE/EXOTIC): sumthing(0) = 0
	public static int sumthing(long k)
	{
		int sumValue=0;
		String convertLongintoString = String.valueOf(k);
		char[] chList = new char[convertLongintoString.length()];
		for(int i=0; i<chList.length;i++)
		{
			chList[i]= convertLongintoString.charAt(i);
			String convertCharacterIntoString=String.valueOf(chList[i]);
			sumValue+= Integer.valueOf(convertCharacterIntoString);
			if(sumValue>9)
			{
				sumValue-=9;
			}
		}
		return sumValue;
	}

}


