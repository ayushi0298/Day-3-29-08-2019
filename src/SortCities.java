
public class SortCities {

	public static void main(String[] args) {
		String cities[]={"bhopal","agra","mumbai","chennai","pune","delhi"};
		for(int i=0;i<cities.length;i++)
		{
			for(int j=1;j<i;j++){
				if(cities[j].compareTo(cities[j-1])<0) {
				         String tmp="";
				         tmp= cities[j-1];
				         cities[j-1]= cities[j];
				         cities[j]= tmp;
					  }
			}
		}
		for(int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]);
		}	
	}
}
