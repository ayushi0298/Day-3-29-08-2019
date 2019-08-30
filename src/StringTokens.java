import java.util.StringTokenizer;
public class StringTokens {

	public static void main(String[] args) {
		
		String s="1.java,2.oracle,3.python,4.php,5.linux";
		StringTokenizer st=new StringTokenizer(s,",");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
