//Question 2
public class CountStudents {
	private static int studentCS, studentEC,studentMech,studentCivil;
	public static void countStudents(String rollNumber[])
	{
		studentCS=0;studentEC=0;studentMech=0;studentCivil=0;
		for(String roll:rollNumber)
		{
			if(roll.startsWith("12")) {
				studentCS++;
			}
			else if(roll.startsWith("34")) {
				studentEC++;
			}
			else if(roll.startsWith("56")) {
				studentMech++;
			}
			else {
				studentCivil++;
			}	
		}
		System.out.println("Number of CS students:"+studentCS);
		System.out.println("Number of EC students:"+studentEC);
		System.out.println("Number of Mechanical students:"+studentMech);
		System.out.println("Number of Civil students:"+studentCivil);
	}

	public static void main(String[] args) {
		String rollNumber[]= {"12354","34126","12213","56837","78232","56233","12343","34223"};
		countStudents(rollNumber);
	}
}
