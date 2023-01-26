package assignment_21stJanString;

public class Q19_Substring {
	public static String findSubString(String str) {
		int startIndex = str.indexOf("is");
		int endIndex = str.indexOf("of");
		return str.substring(startIndex + 2, endIndex);
	}

	public static void main(String[] args) {
		String s1 = "Avinash is a cricket player and he is a captain of the team";
		String result = findSubString(s1);
		System.out.println(result);
	}
}
