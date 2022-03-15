//source code

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int B_1 = B%10;
		int B_2	= B%100-B_1;
		int B_3 = B%1000-B_2-B_1;
		
		System.out.println(A*B_1);
		System.out.println(A*B_2/10);
		System.out.println(A*B_3/100);
		System.out.println(A*B);
	
	
	}

}
