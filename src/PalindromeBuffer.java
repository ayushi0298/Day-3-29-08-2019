
public class PalindromeBuffer {
	public void checkPallindrome(String first,String second)
	 {
		 if(first.equals(second))
		 {
			 System.out.println("String : "+first+" is Pallindrome");
		 }
		 else
		 {
			 System.out.println("String : "+second+" is not Pallindrome");
		 }
	 }

	public static void main(String[] args) {
		String s1=new String("adil");
		String s2=new String("naman");
		StringBuffer sb=new StringBuffer("naman");
		StringBuffer sb1=new StringBuffer(s1);
		PalindromeBuffer pb= new PalindromeBuffer();
		pb.checkPallindrome(s1,sb1.reverse().toString());	
		pb.checkPallindrome(s2,sb.reverse().toString());

	}

}
