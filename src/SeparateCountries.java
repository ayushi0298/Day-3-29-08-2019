
public class SeparateCountries {

	public static void main(String[] args) {
		String countries ="India,Australia,England,Spain,Canada";
		char[] ch=countries.toCharArray();
		int tmp=0;
		for(int i=0;i<ch.length;i++)
		{
			if(countries.charAt(i)==',')
			{
				System.out.println(countries.substring(tmp, i));
				tmp=i+1;
			}
		}
		System.out.println(countries.substring(countries.lastIndexOf(',')+1,countries.length()));

	}

}
