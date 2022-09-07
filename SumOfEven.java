import java.util.Scanner;
class SumOfEven {

	public static void main(String[] args) {
		
		int n;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = in.nextInt();

		while(n > 0) {
			
			int a = n % 10;
			if(a % 2 == 0)
				sum += a;
			n = n / 10;
		}
		System.out.println("Sum of Even Digit is : " + sum);		
	}
}