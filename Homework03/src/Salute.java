
public class Salute {
	
	public static double IMC (Persona s){
		return s.massa /(s.altezza * s.altezza);
	}
	
	 public static String valutazione (double v){
		 if(v <= 18.5){
				return "sottopeso";
		 	}
			else if(v <= 25){
				return "normale";
			}
			else if(v <= 30){
				return "sovrappeso";
			}
			else{
				return "obeso";
			}
	 }
	 
	 public static void main(String[] args) {
		 Persona Anna = new Persona (55,1.65);
		 System.out.println(IMC(Anna) + "  " + valutazione(IMC(Anna)));
	 }
}

	
