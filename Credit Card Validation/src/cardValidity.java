
public class cardValidity {
	
	public static void cardValid(String a) {
		String reverse = new StringBuilder(a).reverse().toString();
		int result = 0;
		for(int i = 0; i < reverse.length(); i++) {
			if(i%2 == 0) {
				result += Integer.parseInt(reverse.substring(i,i+1));
			}
			else {
				int temp = Integer.parseInt(reverse.substring(i,i+1))*2;
				String tem = Integer.toString(temp);
				if(tem.length() == 2) {
					int tempo = Integer.parseInt(tem.substring(0,1)) + Integer.parseInt(tem.substring(1));
				    result += tempo;
				}
				else
					result += temp;
				
			}
			
		}
		
		if(result%10 == 0) {
			System.out.println("Valid Card");
		}
		else
			System.out.println("Invalid Card");
	}
	
	public static void main(String[] args) {
		String a = "4519023131370288";
		CardType.cardType(a);
		cardValid(a);
		
	}

}
