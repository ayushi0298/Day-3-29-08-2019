
public class CountOccurence {
	private static int countOccurence;
	

	public static void main(String[] args) {
		String s= "this is java and java is object oriented and java is powerful. I love java language";

		int number= s.indexOf("java");
		while(number!=-1)
		{
			System.out.println(number);
			number= s.indexOf("java",number+1);
			countOccurence++;
		}
		System.out.println("Java occured "+ countOccurence +" times ");
	}

}
