
public class Main {

	public static void main(String[] args) {
		String grade = "D";
		
		switch(grade) {
		case "A":
			System.out.println("Perfect : Passed");
			break;
		case "B":
			System.out.println("Too Good : Passed");
			break;
		case "C":
			System.out.println("Good : Passed");
			break;
		case "D":
			System.out.println("Good enough to pass : Passed");
			break;
		case "F":
			System.out.println("Failed : Not Pass");
			break;
		default:
			System.out.println("You entered invalid grade");

		}

	}
}
