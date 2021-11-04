import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample {

	public static void main(String[] args) throws java.io.IOException
	{
		System.out.println("要跳過第幾次的處理呢?(1~10)");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
        for(int i = 1;i<=10;i++) {
        	if(i == res)    
			continue;
        	System.out.println("第"+ i + "次的處理。");
	}
}}