
public class Main {

	public static void main(String[] args) {
		
		String message = "Bugün hava çok güzel";
		System.out.println(message);
		
		//Mesajin uzunlugu.
		System.out.println(message.length());
		//4.indeksteki karakter.
		System.out.println(message.charAt(4));
		//Girilen kelimeyi, karakteri ekleme.
		System.out.println(message.concat(" Yaþasýn!"));
		
		//Mesajin ne ile basladigini dogrulama.
		System.out.println(message.startsWith("B"));
		//Mesajin ne ile bittigini dogrulama.
		System.out.println(message.endsWith("."));
		
		
		char[] characters = new char[5];
		//Cumle icindeki karakteri istenilen indeksten baslayarak istenilen kadarki bolumunu degiskene atiyoruz.
		message.getChars(0, 5, characters, 0);
		
		System.out.println(characters);
		//Mesajdan istenilen kismin indeksini isteme.
		System.out.println(message.indexOf("av"));
		//Girilen karakterin mesajdaki son indeksini verme.
		System.out.println(message.lastIndexOf("u"));
		
		
		
		
		
	}

}
