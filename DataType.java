public class DataType{
	public static void main(String[] args){
		
		//Integers type(byte,short,int,long)
		byte age = 50;
		System.out.printf("Your age is %d%n",age);
		
		short quantity = 32000;
		System.out.printf("I bought %d bags for my business%n",quantity); 
		
		int populationInNigeria = 10000000;
		System.out.printf("The Total Population in Nigeria is %d%n",populationInNigeria);
		
		long worldPopulation = 8000000000L;
		System.out.printf("The Total World Population is %d%n",worldPopulation);
		
		//Float-point type(float,double)
		float myBalance = 12345763.8946F;
		System.out.printf("Your account balance is %.2f%n",myBalance);
		
		double cbnReserve = 55238.96530;
		System.out.printf("The CBN reserve is %.3f%n",cbnReserve);
		
		//Boolean type(boolean)
		boolean isJavaFun = true;
		System.out.printf("Is JAVA a fun language? %b%n",isJavaFun);
		
		//Character type(char)
		char alpha = '@';
		System.out.printf("My email address is just.jess0414%cgmail.com%n",alpha);
	}
}