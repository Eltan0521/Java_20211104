import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Sample2_1 {

	public static void main(String[] args)throws java.io.IOException {
		System.out.println("請輸入整數");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		if(num == 1)
		{
			System.out.println("輸入的是1");
			System.out.println("選擇的是1");
		}
		System.out.println("結束處理");
	}
}
