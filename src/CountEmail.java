//Question 1
public class CountEmail {
	private static int countgmail,countyahoo;
	public static void countDomain(String emails[])
	{
		countgmail=0;countyahoo=0;
		for(String email:emails)
		  {  
			  if(email.endsWith("gmail.com")) {
				  
				   countgmail++;
			  } 
		      else {
			   countyahoo++;
		      }
		  }
		System.out.println("Number of gmail: "+countgmail );
		System.out.println("Number of yahoo: "+countyahoo );
	}
	
	public static void main(String[] args) {
	  String emails[]= {"ayushi@gmail.com","adil@gmail.com","aditee@yahoo.com","prakhar@yahoo.com","ankita@gmail.com","akash@gmail.com"};
	  countDomain(emails);
	}
}
