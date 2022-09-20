
public class Main {

	public static void main(String[] args) {
		int num = 3;

		if (num < 0) {
			System.out.println("0'dan büyük pozitif sayý giriniz.");
		} 
		else if(num == 1) {
			System.out.println("Asal sayý deðildir.");
		}
		else {
			boolean isPrime = true;

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				System.out.println("Asal sayýdýr.");
			} 
			else {
				System.out.println("Asal sayý deðildir.");
			}
		}

	}

}
