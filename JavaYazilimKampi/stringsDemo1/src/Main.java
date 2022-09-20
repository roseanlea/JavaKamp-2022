
public class Main {

	public static void main(String[] args) {
		String message = " Bugün hava çok güzel ";
		System.out.println(message);
		
		//Karakter degisimi.
		System.out.println(message.replace(' ', '-'));
		//Girilen indeksten itibaren karakterleri alma.
		System.out.println(message.substring(4));
		//Girilen indeksler arasý karakter alma.
		System.out.println(message.substring(4,8));
		//Mesaj icindeki kelimeleri ayirip Array tipinde yazdirma.
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		//Mesajin tum harflerini kucultme.
		System.out.println(message.toLowerCase());
		//Mesajin tum harflerini buyultme.
		System.out.println(message.toUpperCase());
		//Mesain basindaki ve sonundaki bosluklarý silme.
		System.out.println(message.trim());
		
	}

}
