import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Card Number: ");
		String cardNumber = scan.nextLine();
		CardType.cardType(cardNumber);
		cardValidity.cardValid(cardNumber);
		

	}

}
