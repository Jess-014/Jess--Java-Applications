import java.util.scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		System.out.println("The Multiplication Table Of " + num ");
		int i = 1;
		while(i <= 12){
			System.out.print(num + " x " + i + " = " + num * i);
			i++;
		}
	}
}
