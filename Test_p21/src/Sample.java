import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample {

	public static void main(String[] args) throws java.io.IOException
	{
		System.out.println("�аݭn��������u?");
		System.out.println("�п�J���");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
        char ans = (res ==1)?'A':'B';
	
        
			System.out.println("��ܤF"+ ans + "���u");
	}
}
