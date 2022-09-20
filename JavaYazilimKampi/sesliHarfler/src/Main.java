
public class Main {

	public static void main(String[] args) {

		char letter = 'E';

		switch (letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalýn sesli harf: A, I, O, U");
			break;
		default:
			System.out.println("Ýnce sesli harf: E, Ý, Ö, Ü");
		}
	}

}
