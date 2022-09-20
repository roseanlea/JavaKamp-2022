
public class Main {

	public static void main(String[] args) {
		int num = 13;
		int num1 = 1;
		int num2 = 32;
		int max = num;

		if(max < num1) {
			max = num1;
		}
		
		if(max < num2) {
			max = num2;
		}
		
		System.out.println("Largest Number : " + max);
	}

}
