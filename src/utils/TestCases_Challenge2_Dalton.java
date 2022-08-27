package utils;
import java.util.HashSet;
import java.util.Set;

import utils.IntegerUtils_Dalton;

public class TestCases_Challenge2_Dalton 
{
	private static void test_isEven()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.isEven()    ");
		int input= 4;
		boolean expectedRV= true;
		boolean actualRV= IntegerUtils_Dalton.isEven(input);
		String failureMessage= "Expected IntegerUtils_Dalton.isEven(" + input+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isEven("+input+") = "+ actualRV+", as expected" );
		input=5;
		expectedRV= false;
		actualRV= IntegerUtils_Dalton.isEven(input);
		failureMessage= "Expected IntegerUtils_Dalton.isEven(" + input+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isEven("+input+") = "+ actualRV+", as expected" );
		input=16;
		expectedRV= true;
		actualRV= IntegerUtils_Dalton.isEven(input);
		failureMessage= "Expected IntegerUtils_Dalton.isEven(" + input+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isEven("+input+") = "+ actualRV+", as expected" );
		input=0;
		expectedRV=true;
		actualRV= IntegerUtils_Dalton.isEven(input);
		failureMessage= "Expected IntegerUtils_Dalton.isEven(" + input+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isEven("+input+") = "+ actualRV+", as expected" );
		input=-12;
		actualRV= IntegerUtils_Dalton.isEven(input);
		failureMessage= "Expected IntegerUtils_Dalton.isEven(" + input+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isEven("+input+") = "+ actualRV+", as expected" );
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.isEven()\n");
	}
	private static void test_isOdd()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.isOdd()    ");
		int input=7;
		boolean expectedRV= true;
		boolean actualRV= IntegerUtils_Dalton.isOdd(input);
		String failureMessage= "Expected IntegerUtils_Dalton.isOdd(" + input+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isOdd("+input+") = "+ actualRV+", as expected" );
		input=1002;
		expectedRV= false;
		actualRV= IntegerUtils_Dalton.isOdd(input);
		failureMessage= "Expected IntegerUtils_Dalton.isOdd(" + input+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isOdd("+input+") = "+ actualRV+", as expected" );
		input=0;
		expectedRV= false;
		actualRV= IntegerUtils_Dalton.isOdd(input);
		failureMessage= "Expected IntegerUtils_Dalton.isOdd(" + input+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isOdd("+input+") = "+ actualRV+", as expected" );
		input=-13;
		expectedRV= true;
		actualRV= IntegerUtils_Dalton.isOdd(input);
		failureMessage= "Expected IntegerUtils_Dalton.isOdd(" + input+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isOdd("+input+") = "+ actualRV+", as expected" );
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.isOdd()\n");

	}
	private static void test_isPrime()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.isPrime()    ");
		int input = 2;
		boolean expectedRV= true;
		boolean actualRV= IntegerUtils_Dalton.isPrime(input);
		String failureMessage= "Expected IntegerUtils_Dalton.isPrime(" + input+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isPrime("+input+") = "+ actualRV+", as expected" );
		input= 97;
		expectedRV= true;
		actualRV= IntegerUtils_Dalton.isPrime(input);
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isPrime("+input+") = "+ actualRV+", as expected" );
		input= 10079;
		expectedRV= true;
		actualRV= IntegerUtils_Dalton.isPrime(input);
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isPrime("+input+") = "+ actualRV+", as expected" );
		input= 1987913;
		expectedRV= false;
		actualRV= IntegerUtils_Dalton.isPrime(input);
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isPrime("+input+") = "+ actualRV+", as expected" );
		input= 1;
		expectedRV= false;
		actualRV= IntegerUtils_Dalton.isPrime(input);
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isPrime("+input+") = "+ actualRV+", as expected" );
		input= -2;
		expectedRV= false;
		actualRV= IntegerUtils_Dalton.isPrime(input);
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isPrime("+input+") = "+ actualRV+", as expected" );
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.isPrime()\n");
	}
	private static void test_greatestCommonFactor()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.greatestCommonFactor()    ");
		int m = 8;
		int n = 12;
		int expectedRV= 4;
		int actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		String failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		m = 2;
		n = 3;
		expectedRV = 1;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		m = 15;
		n = 50;
		expectedRV = 5;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		m = 36;
		n = 48;
		expectedRV = 12;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		m = 24;
		n = 60;
		expectedRV = 12;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		m = 88;
		n = 108;
		expectedRV = 4;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		m = 1;
		n = 2;
		expectedRV = 1;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		m = 0;
		n = 25;
		expectedRV = 25;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		m = 24;
		n = 0;
		expectedRV = 24;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		m = -2;
		n = -4;
		expectedRV = 2;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		m = -5;
		n = 10;
		expectedRV = 5;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		m = 88;
		n = -108;
		expectedRV = 4;
		actualRV= IntegerUtils_Dalton.greatestCommonFactor(m,n);
		failureMessage= "Expected IntegerUtils_Dalton.greatestCommonFactor(" + m+","+n+")"+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.greatestCommonFactor("+m+","+n+") = "+ actualRV+", as expected");
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.greatestCommonFactor()\n");
		
	}
	private static void test_getGreatestConstrainedMultiple()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.getGreatestConstrainedMultiple()    ");
		int k= 3;
		int maximum= 50;
		int expectedRV= 48;
		int actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		String failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= 2;
		maximum= 100;
		expectedRV= 100;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= 3;
		maximum= 19;
		expectedRV= 18;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= 10;
		maximum= 789;
		expectedRV= 780;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= 0;
		maximum= 20;
		expectedRV= 0;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= -10;
		maximum= -50;
		expectedRV= -50;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= 10;
		maximum= -80;
		expectedRV= -80;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= -25;
		maximum= 50;
		expectedRV= 50;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= -7;
		maximum= -50;
		expectedRV= -49;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= -4;
		maximum= 25;
		expectedRV= 24;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= 6;
		maximum= -33;
		expectedRV= -30;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		k= 0;
		maximum= 10;
		expectedRV= 0;
		actualRV= IntegerUtils_Dalton.getGreatestConstrainedMultiple(k,maximum);
		failureMessage= "Expected IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+")"
				+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getGreatestConstrainedMultiple(" + k+","+maximum+") = "+ actualRV+", as expected");
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.getGreatestConstrainedMultiple()\n");
	}
	private static void test_getMaximum()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.getMaximum()    ");
		Set<Integer> aSet1 = new HashSet<Integer>();
		aSet1.add( 1); aSet1.add( 2); aSet1.add( 3);
		int expectedRV= 3;
		int actualRV= IntegerUtils_Dalton.getMaximum(aSet1);
		String failureMessage= "Expected IntegerUtils_Dalton.getMaximum("+aSet1+")" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getMaximum("+ aSet1 +") = "+ actualRV+", as expected");
		Set<Integer> aSet2 = new HashSet<Integer>();
		aSet2.add( 30); aSet2.add( -33); aSet2.add( 43); aSet2.add( 13); aSet2.add( 94); aSet2.add( 20); aSet2.add( 22);
		expectedRV= 94;
		actualRV= IntegerUtils_Dalton.getMaximum(aSet2);
		failureMessage= "Expected IntegerUtils_Dalton.getMaximum("+aSet2+")" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getMaximum("+ aSet2 +") = "+ actualRV+", as expected");
		Set<Integer> aSet3 = new HashSet<Integer>();
		aSet3.add( 29);
		expectedRV= 29;
		actualRV= IntegerUtils_Dalton.getMaximum(aSet3);
		failureMessage= "Expected IntegerUtils_Dalton.getMaximum("+aSet3+")" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getMaximum("+ aSet3 +") = "+ actualRV+", as expected");
		aSet3.add( 40);
		expectedRV= 40;
		actualRV= IntegerUtils_Dalton.getMaximum(aSet3);
		failureMessage= "Expected IntegerUtils_Dalton.getMaximum("+aSet3+")" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getMaximum("+ aSet3 +") = "+ actualRV+", as expected");
		Set<Integer> aSet4 = new HashSet<Integer>();
		aSet4.add( 1800);
		expectedRV= 1800;
		actualRV= IntegerUtils_Dalton.getMaximum(aSet4);
		failureMessage= "Expected IntegerUtils_Dalton.getMaximum("+aSet4+")" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getMaximum("+ aSet4 +") = "+ actualRV+", as expected");
		Set<Integer> aSet5 = new HashSet<Integer>();
		aSet5.add( -1800); aSet5.add( -780); aSet5.add( -991); aSet5.add( -9); aSet5.add( -17);
		expectedRV= -9;
		actualRV= IntegerUtils_Dalton.getMaximum(aSet5);
		failureMessage= "Expected IntegerUtils_Dalton.getMaximum("+aSet5+")" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getMaximum("+ aSet5 +") = "+ actualRV+", as expected");
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.getMaximum()\n");
	}
	private static void test_getMinimum()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.getMinimum()    ");
		int [] list1 = {122,22,333,43,100,200,300,400,-1, 35,-35};
		int [] list2 = {2};
		int [] list3 = {5,5,5,5,5,5,5};
		int [] list4= {2,3,66,77,100,109,900,1,800};
		int expectedRV= -35;
		int actualRV= IntegerUtils_Dalton.getMinimum(list1);
		String failureMessage= "Expected IntegerUtils_Dalton.getMinimum("+list1+")" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getMinimum("+ list1 +") = "+ actualRV+", as expected");
		expectedRV= 2;
		actualRV= IntegerUtils_Dalton.getMinimum(list2);
		failureMessage= "Expected IntegerUtils_Dalton.getMinimum("+list2+")" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getMinimum("+ list2 +") = "+ actualRV+", as expected");
		expectedRV= 5;
		actualRV= IntegerUtils_Dalton.getMinimum(list3);
		failureMessage= "Expected IntegerUtils_Dalton.getMinimum("+list3+")" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getMinimum("+ list3 +") = "+ actualRV+", as expected");
		expectedRV= 1;
		actualRV= IntegerUtils_Dalton.getMinimum(list4);
		failureMessage= "Expected IntegerUtils_Dalton.getMinimum("+list4+")" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getMinimum("+ list4 +") = "+ actualRV+", as expected");
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.getMinimum()\n");
	}
	private static void test_isSorted()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.isSorted()    ");
		int [] list1 = {122,22,333,43,100,200,300,400,-1, 35,-35};
		boolean expectedRV=false;
		boolean actualRV= IntegerUtils_Dalton.isSorted(list1);
		String failureMessage= "Expected IntegerUtils_Dalton.isSorted({122,22,333,43,100,200,300,400,-1, 35,-35})" 
		+ " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isSorted({122,22,333,43,100,200,300,400,-1, 35,-35}) = "+ actualRV+", as expected");
		int[] list2= {1,5,6,17,88,91};
		expectedRV=true;
		actualRV= IntegerUtils_Dalton.isSorted(list2);
		failureMessage= "Expected IntegerUtils_Dalton.isSorted({1,5,6,17,88,91})" + 
		" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isSorted({1,5,6,17,88,91}) = "+ actualRV+", as expected");
		int[] list3= {65};
		expectedRV=true;
		actualRV= IntegerUtils_Dalton.isSorted(list3);
		failureMessage= "Expected IntegerUtils_Dalton.isSorted({65})" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isSorted({65}) = " + actualRV+", as expected");
		int[] list4= {};
		expectedRV=true;
		actualRV= IntegerUtils_Dalton.isSorted(list4);
		failureMessage= "Expected IntegerUtils_Dalton.isSorted({})" + " to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.isSorted({}) = " + actualRV+", as expected");
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.isSorted()\n");
	}
	private static void test_getSmallestIndexOfMatch()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.getSmallestIndexOfMatch()    ");
		int [] list1 = {122,22,333,43,100,200,300,400,-1, 35,-35};
		int target=22;
		int expectedRV= 1;
		int actualRV= IntegerUtils_Dalton.getSmallestIndexOfMatch(list1,target);
		String failureMessage= "Expected IntegerUtils_Dalton.getSmallestIndexOfMatch({122,22,333,43,100,200,300,400,-1, 35,-35},"+target+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getSmallestIndexOfMatch({122,22,333,43,100,200,300,400,-1, 35,-35},"+target+")"+ " = "
				+ actualRV+", as expected");
		int[] list2= {65};
		target=65;
		expectedRV= 0;
		actualRV= IntegerUtils_Dalton.getSmallestIndexOfMatch(list2,target);
		failureMessage= "Expected IntegerUtils_Dalton.getSmallestIndexOfMatch({65},"+target+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getSmallestIndexOfMatch({65},"+target+")"+ " = "
				+ actualRV+", as expected");
		int[] list3= {1,1,1,1,1,1,1};
		target=1;
		expectedRV=0;
		actualRV= IntegerUtils_Dalton.getSmallestIndexOfMatch(list3,target);
		failureMessage= "Expected IntegerUtils_Dalton.getSmallestIndexOfMatch({1,1,1,1,1,1,1},"+target+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getSmallestIndexOfMatch({1,1,1,1,1,1,1},"+target+")"+ " = "
				+ actualRV+", as expected");
		int[] list4= {6,7,8,9};
		target = 60;
		expectedRV=-1;
		actualRV= IntegerUtils_Dalton.getSmallestIndexOfMatch(list4,target);
		failureMessage= "Expected IntegerUtils_Dalton.getSmallestIndexOfMatch({6,7,8,9},"+target+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.getSmallestIndexOfMatch({6,7,8,9},"+target+")"+ " = "
				+ actualRV+", as expected");
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.getSmallestIndexOfMatch()\n");
	}
	private static void test_reverse()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.reverse()    ");
		int k=7;
		int expectedRV=7;
		int actualRV= IntegerUtils_Dalton.reverse(k);
		String failureMessage= "Expected IntegerUtils_Dalton.reverse("+k+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.reverse("+k+")"+ " = "
				+ actualRV+", as expected");
		k=93;
		expectedRV=39;
		actualRV= IntegerUtils_Dalton.reverse(k);
		failureMessage= "Expected IntegerUtils_Dalton.reverse("+k+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.reverse("+k+")"+ " = "
				+ actualRV+", as expected");
		k=1234479;
		expectedRV=9744321;
		actualRV= IntegerUtils_Dalton.reverse(k);
		failureMessage= "Expected IntegerUtils_Dalton.reverse("+k+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.reverse("+k+")"+ " = "
				+ actualRV+", as expected");
		k=1234479;
		expectedRV=9744321;
		actualRV= IntegerUtils_Dalton.reverse(k);
		failureMessage= "Expected IntegerUtils_Dalton.reverse("+k+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.reverse("+k+")"+ " = "
				+ actualRV+", as expected");
		k=1111111111;
		expectedRV=1111111111;
		actualRV= IntegerUtils_Dalton.reverse(k);
		failureMessage= "Expected IntegerUtils_Dalton.reverse("+k+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.reverse("+k+")"+ " = "
				+ actualRV+", as expected");
		k=-9;
		expectedRV=-9;
		actualRV= IntegerUtils_Dalton.reverse(k);
		failureMessage= "Expected IntegerUtils_Dalton.reverse("+k+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.reverse("+k+")"+ " = "
				+ actualRV+", as expected");
		k=-34;
		expectedRV=-43;
		actualRV= IntegerUtils_Dalton.reverse(k);
		failureMessage= "Expected IntegerUtils_Dalton.reverse("+k+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.reverse("+k+")"+ " = "
				+ actualRV+", as expected");
		k=-833321;
		expectedRV=-123338;
		actualRV= IntegerUtils_Dalton.reverse(k);
		failureMessage= "Expected IntegerUtils_Dalton.reverse("+k+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.reverse("+k+")"+ " = "
				+ actualRV+", as expected");
		int input= 00005;
		expectedRV=5;
		actualRV= IntegerUtils_Dalton.reverse(input);
		failureMessage= "Expected IntegerUtils_Dalton.reverse("+input+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.reverse("+input+")"+ " = "
				+ actualRV+", as expected");
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.reverse()\n");
	}
	private static void test_sumthing()
	{
		System.out.println("    Now testing IntegerUtils_Dalton.sumthing()    ");
		int input= 4;
		int expectedRV=4;
		int actualRV= IntegerUtils_Dalton.sumthing(input);
		String failureMessage= "Expected IntegerUtils_Dalton.sumthing("+input+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.sumthing("+input+")"+ " = "
				+ actualRV+", as expected");
		input=0;
		expectedRV=0;
		actualRV= IntegerUtils_Dalton.sumthing(input);
		failureMessage= "Expected IntegerUtils_Dalton.sumthing("+input+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.sumthing("+input+")"+ " = "
				+ actualRV+", as expected");
		input=48;
		expectedRV=3;
		actualRV= IntegerUtils_Dalton.sumthing(input);
		failureMessage= "Expected IntegerUtils_Dalton.sumthing("+input+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.sumthing("+input+")"+ " = "
				+ actualRV+", as expected");
		input=29;
		expectedRV=2;
		actualRV= IntegerUtils_Dalton.sumthing(input);
		failureMessage= "Expected IntegerUtils_Dalton.sumthing("+input+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.sumthing("+input+")"+ " = "
				+ actualRV+", as expected");
		input=13498;
		expectedRV=7;
		actualRV= IntegerUtils_Dalton.sumthing(input);
		failureMessage= "Expected IntegerUtils_Dalton.sumthing("+input+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.sumthing("+input+")"+ " = "
				+ actualRV+", as expected");
		input=22221;
		expectedRV=9;
		actualRV= IntegerUtils_Dalton.sumthing(input);
		failureMessage= "Expected IntegerUtils_Dalton.sumthing("+input+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.sumthing("+input+")"+ " = "
				+ actualRV+", as expected");
		input=3331;
		expectedRV=1;
		actualRV= IntegerUtils_Dalton.sumthing(input);
		failureMessage= "Expected IntegerUtils_Dalton.sumthing("+input+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.sumthing("+input+")"+ " = "
				+ actualRV+", as expected");
		input=9999;
		expectedRV=9;
		actualRV= IntegerUtils_Dalton.sumthing(input);
		failureMessage= "Expected IntegerUtils_Dalton.sumthing("+input+")" + 
				" to be "+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("IntegerUtils_Dalton.sumthing("+input+")"+ " = "
				+ actualRV+", as expected");
		System.out.println("SUCCESS-- completed IntegerUtils_Dalton.sumthing()\n");
	}
	public static void main(String[]args)
	{
		//assert false;
		test_isEven();
		test_isOdd();
		test_isPrime();
		test_greatestCommonFactor();
		test_getGreatestConstrainedMultiple();
		test_getMaximum();
		test_getMinimum();
		test_isSorted();
		test_getSmallestIndexOfMatch();
		test_reverse();
		test_sumthing();
	}
}
