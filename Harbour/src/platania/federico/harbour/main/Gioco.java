package platania.federico.harbour.main;

public class Gioco {
	
	public static void main(String[] args){
		
	}
	
	 public static String status(PortoNavale p, Aereo a, Sottomarino s){
		int attacchi = 0;
		double salute = p.getDimensione();
		while(salute > 0){
			
			salute = salute - (a.getP() + s.getP());
			attacchi++;
		}
		//System.out.println("Il porto " + p.getNome() + " è stato distrutto dopo " + attacchi + " attacchi.");
		
		return "Il porto " + p.getNome() + " è stato distrutto dopo " + attacchi + " attacchi.";
		
	}
}
