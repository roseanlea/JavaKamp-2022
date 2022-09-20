
public class Main {

	public static void main(String[] args) {
		
		String ogrenci = "Zeynep";
		String ogrenci1 = "Seda";
		String ogrenci2 = "Furkan";
		String ogrenci3 = "Vefa";
		
		System.out.println(ogrenci);
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("-----------------------");
		
		
		String[] students = new String[4];
		students[0] = "Zeynep";
		students[1] = "Seda";
		students[2] = "Furkan";
		students[3] = "Vefa";
		
		for (int i = 0 ; i<students.length ; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("-----------------------");
		
		
		for (String student : students) {
			System.out.println(student);
		}

	}

}
