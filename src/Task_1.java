import java.util.Scanner;

public class Task_1 {

	public static int NumOfBrackets(int n){
		int i, sum;
		
		if (n <= 1)
			return 1;
		sum = 0;
		for (i = 0; i < n; i++) {
			sum += NumOfBrackets(i)*NumOfBrackets((n-1) - i);
		}
		return sum;
	}	
	
	
	public static void main(String[] args) {
		int n;
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("¬ведите число N: ");
			n = scan.nextInt();
			int num = NumOfBrackets(n);
			System.out.println("„исло правильных скобочных выражений: " + num);
		}catch(Exception e){
			System.out.println("Error!");
		}		
	}
}
