//source code
//주어진 예제 값은 다 출력되는데 틀렸다고 나옵니다. 어디가 틀린걸까요?

import java.util.*;

public class J2884 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int hour = input.nextInt();
		int min = input.nextInt();
		
	
		if(min > 45){
			min = min - 45;
			
		} else if(hour == 0) {
			hour = hour-1 + 24;
			min = 60 + (min - 45);
		} else {
			min = 60 + (min - 45);
			hour = hour - 1;
		}
				
		
		System.out.printf("%d %d",hour, min);
		
	}
}

		
