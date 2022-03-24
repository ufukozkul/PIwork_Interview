import java.util.LinkedList;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(is_divisible(75));
		
	}
	
	public static boolean is_divisible(int input) {
		
		int number = input;
		int totalOfDigits = 0;
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (number > 0) {
		    stack.push( number % 10 );
		    number = number / 10;
		}

		while (!stack.isEmpty()) {
			totalOfDigits += stack.pop();
		}
		
		if(input % totalOfDigits == 0) {
			return true;
		}
		return false;
		
	}

}
