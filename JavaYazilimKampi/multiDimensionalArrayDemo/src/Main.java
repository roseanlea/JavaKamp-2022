
public class Main {

	public static void main(String[] args) {

		String[][] cityNames = new String[3][3];
		cityNames[0][0] = "Ýstanbul";
		cityNames[0][1] = "Bursa";
		cityNames[0][2] = "Bilecik";
		cityNames[1][0] = "Ankara";
		cityNames[1][1] = "Konya";
		cityNames[1][2] = "Kayseri";
		cityNames[2][0] = "Diyarbakýr";
		cityNames[2][1] = "Þanlýurfa";
		cityNames[2][2] = "Gaziantep";

		for (int i = 0; i <= 2; i++) {
			System.out.println("-----------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(cityNames[i][j]);
			}
		}
	}

}
