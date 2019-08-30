
public class PalindromeNormal {
	
	public static void main(String[] args) {
		String original="askjfslkjfskl";
		char[] ch= original.toCharArray();
		String reverse="";
		for(int i=0;i<ch.length;i++)
		{
			reverse= reverse+ch[i];
		}
		System.out.println("Our original string "+ original);
		System.out.println("After reversing "+ reverse);

	}

}
