
public class Main {

	public static void main(String[] args) {
		int num = 220;
		int num1 = 284;
		
		int total = 0;
		int total1 = 0;
		
		for (int i = 1 ; i < num ; i++) {
			if (num % i == 0) {
				total = total + i;
			}
		}
		
		for (int i = 1 ; i < num1 ; i++) {
			if (num1 % i == 0) {
				total1 = total1 + i;
			}
		}
		
		if (num == total1 && num1 == total) {
			System.out.println("Girilen iki sayý arkadaþtýr.");
		}else {
			System.out.println("Girilen iki sayý arkdaþ deðildir.");
		}
	}

}
