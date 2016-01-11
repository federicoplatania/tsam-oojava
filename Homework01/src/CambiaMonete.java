
public class CambiaMonete {
	
	public static String exchange (int value){
		String moneystring = "";
		while(value > 0){
			if(value >= 500){
				value-=500;
				moneystring+="500€ ";
			}
			else if(value >= 200){
				value-=200;
				moneystring+="200€ ";
			}
			else if(value >= 100){
				value-=100;
				moneystring+="100€ ";
			}
			else if(value >= 50){
				value-=50;
				moneystring+="50€ ";
			}
			else if(value >= 20){
				value-=20;
				moneystring+="20€ ";
			}
			else if(value >= 10){
				value-=10;
				moneystring+="10€ ";
			}
			else if(value >= 5){
				value-=5;
				moneystring+="5€ ";
			}
			else if(value >= 2){
				value-=2;
				moneystring+="2€ ";
			}
			else if(value >= 1){
				value-=1;
				moneystring+="1€";
			}
		}
		return moneystring;
	}
	
	
	public static void main(String[] args) {
		System.out.println(exchange(680));
	}
}
