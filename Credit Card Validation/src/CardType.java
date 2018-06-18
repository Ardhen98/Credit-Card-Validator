
public class CardType {
	
	public static void cardType(String a) {
		if(a.length() == 16 && a.substring(0,1).equals("4")) {
			System.out.println("Visa");
		}
		else if(a.length() == 16 && a.substring(0,1) == "5") {
			if(a.substring(1,2) == "1" || a.substring(1,2) == "2" || a.substring(1,2) == "3" || a.substring(1,2) == "4" || a.substring(1,2) == "5") {
				System.out.println("MasterCard/Diners Club(US & Canada)");
			}
		}
		else if(a.length() == 15 && a.substring(0,1).equals("3")) {
			if(a.substring(1,2).equals("4") || a.substring(1,2).equals("7")) {
				System.out.println("American Express");
			}
		}
		else if(a.length() == 16 && a.substring(0,4).equals("6011")) {
			System.out.println("Discover");
		}
		else if(a.length() == 14 && a.substring(0,2).equals("36")) {
			System.out.println("Diners Club(Outside US and Canada)");
		}
		else
			System.out.println("INVALID CARD");
		
	}

}


