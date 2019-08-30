
public class CountVarious {
	private static int smallAlpha;
	private static int largeAlpha;
	private static int digits;
	private static int symbols;
	private static int spaces;
	
	public static void main(String[] args) {
		String s="hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		char[] count= s.toCharArray();
		for(int i=0; i<count.length;i++)
		{
			if(Character.isLetter(count[i])) {
				int ascii= (int) count[i];
				if(ascii>96 && ascii<123) {
					smallAlpha++;
				}
				else {
					largeAlpha++;
				}
			}
			else if(Character.isDigit(count[i])) {
				digits++;
			}
			else if(Character.isSpaceChar(count[i])) {
				symbols++;
			}
			else {
				spaces++;
			}
		}
		System.out.println("Number of small alphabates: "+smallAlpha+"Number of large alphabates: "+largeAlpha+"Number of digits: "+digits+"Number of symbols: "+symbols+"Number of spaces: "+spaces);
	}

}
