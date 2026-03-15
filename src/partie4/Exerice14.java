package partie4;

public class Exerice14 {
	public static void main(String[] args) {
		String palindrome="javaavaj";
		String notPalindrom="java";
		String otherNotPalindrom="brahim";
		String otherPalindrom="braarb";
		System.out.println(isPalindrom(palindrome));
		System.out.println(isPalindrom(notPalindrom));
		System.out.println(isPalindrom(otherNotPalindrom));
		System.out.println(isPalindrom(otherPalindrom));

	}
	
	public static boolean isPalindrom(String str) {
		char[] arr=str.toCharArray();
		
		for(int i=0,j=str.length()-1;i<j;i++,j--) {
			if(arr[i]!=arr[j]) {
				return false;
			}
		}
		return true;
	}
}
