import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Sample {

	public static void main(String[] args) throws java.io.IOException
	{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J5�ӤH������");
		Integer test[] = new Integer[5];
		
		for(int i = 0;i<test.length;i++){
		String str = br.readLine();
		test[i]=Integer.parseInt(str);
		}
		Arrays.sort(test,Collections.reverseOrder());
        for(int i = 0;i<test.length;i++) {
        	System.out.println("��"+ (i+1) + "�W�����ƬO"+test[i]);
	}}}
