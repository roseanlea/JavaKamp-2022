
public class Main {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,5,7,9,0};
		int findNum = 5;
		
		boolean isThere = false;
		
		for (int find : nums) {
			if (find == findNum) {
				isThere = true;
				break;
			}
		}
		
		if (isThere){
			System.out.println("Sayý mevcuttur.");
		}else {
			System.out.println("Sayý mevcut deðildir.");
		}
	}

}
