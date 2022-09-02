package streams;

import java.util.ArrayList;
import java.util.Collections;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x;
		x=10;
		{
			int y=20;
			System.out.println(x+" "+y);
		}*/
		
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(59);
		nums.add(45);
		nums.add(5);
		
		System.out.println("Before Sorting "+nums);
		Collections.sort(nums);
		Collections.sort(nums,Collections.reverseOrder());
		System.out.println("After Sorting "+nums);

	}

}
