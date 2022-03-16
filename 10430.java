//source code


import java.util.*;

public class J10430 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		String input_ = input.nextLine();
		
		String[] num = input_.split(" ");
		
		int A = Integer.parseInt(num[0]);
		int B = Integer.parseInt(num[1]);
		int C = Integer.parseInt(num[2]);		
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);

		
	}

}
