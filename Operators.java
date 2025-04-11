public class Operators{
	public static void main(String [] args){;
		//Assignment Operators(=) public class operators
		
		int num1=13;
		int num2=5;
		
		//Arithmetic operators(+,-,/,*,%)
		int sum=num1 + num2;
		int product=num1 * num2;
		int difference=num1 - num2; 
		double quotient=(double) num1/num2;
		int modulus=num1 % num2;
		
		//Relational operators(<,>,>=,<=,==,!=)
		boolean isLessThan = num1<num2;
		boolean isGreaterThan = num1>num2;
		boolean isLessThanOrEqualTo = num1<=num2;
		boolean isGreaterThanOrEqualTo = num1>=num2;
		boolean isEqualTo = num1==num2;
		boolean isNotEqualTo = num1!=num2;
		
		
		//Logical operators(&&,||,!)
		boolean isAndOperator = num1>num2 && num1>=2;
		boolean isOrOperator = num1==num2 || num1>=2;
		boolean isNotOperator = !(num1 == num2 || num1>=num2);
		
		//Compound operators - combining arithmetic operators with assignment operators
			num1 = num1 + num2;
		System.out.printf("The sum of the numbers is %d%n",sum);
		System.out.printf("The product of the numbers is %d%n",product);
		System.out.printf("The difference between %d and %d is %d%n",num1,num2,difference);
		System.out.printf("The quotient of %d and %d is %f%n",num1, num2, quotient);
		System.out.printf("The modulus of the numbers is %d%n",modulus);
		
		System.out.println("========================================================");
		
		System.out.printf("Is %d < %d? %b%n",num1,num2,isLessThan);
		System.out.printf("Is %d > %d? %b%n",num1,num2,isGreaterThan);
		System.out.printf("Is %d >= %d? %b%n",num1,num2,isGreaterThanOrEqualTo);
		System.out.printf("Is %d <= %d? %b%n",num1,num2,isLessThanOrEqualTo);
		System.out.printf("Is %d == %d? %b%n",num1,num2,isEqualTo);
		System.out.printf("Is %d != %d? %b%n",num1,num2,isNotEqualTo);
		
		System.out.println("========================================================");
		
		System.out.printf("Is %d > %d && %d >= %d: %b%n",num1, num2, num1, num2, isAndOperator);
		System.out.printf("Is %d > %d || %d >= %d: %b%n",num1, num2, num1, num2, isOrOperator);
		System.out.printf("Is !(%d > %d && %d >= %d): %b%n",num1, num2, num1, num2, isNotOperator);
		
	}
}	