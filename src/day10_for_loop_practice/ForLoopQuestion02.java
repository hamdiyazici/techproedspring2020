package day10_for_loop_practice;

public class ForLoopQuestion02 {

	public static void main(String[] args) {
		/*
		 * Create a for statement using a range of numbers from 1 to 200 inclusive
		 * Print all the numbers that can be divided with both by 3 and 5.
		 * Count the numbers like; 1 -> 15
		 *                         2 -> 30
		 *                         3 -> 45
		 *                            .
		 *                            .
		 *                            . 
		 */
		
		int count = 1; // When you want to count sth in a loop create a variable and assign 1 to it

		for(int i=1; i<=200; i++) {
			if(i%3==0 & i%5==0) {
				System.out.println(count +  " -> " + i);
				count++; //If you do not increase the value of count variable,you get 1 for every step
					     //Therefore, you have to make increment
			}
		}
	}

} 
