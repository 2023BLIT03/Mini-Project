import java.util.*;

class GuessNum{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int myNumber = (int)(Math.random()*100);
		System.out.println("Start The Game");
		System.out.println("Enter no. 1-100");
		int n = 0;

		do {
			try{
			n = sc.nextInt();
			} catch(Exception exception) {
				System.out.println("Enter no. 1-100");
				sc.next();
			}
			if(n == myNumber) {
				System.out.println("Woo-Hoo\nAwesome!");
				break;
			} else if(n > myNumber) {
				System.out.println("Your No. is too large");
			} else if(n < myNumber) {
				System.out.println("Your No. is too small");
			} else{
				System.out.println("Try Next Time");
			}
		} while(n >= 0);
		System.out.println("My no. is "+ n);
		System.out.println("Game Over");
	}
}