
public class Salute {

	public static double BMR (Persona s){
		if(s.sesso == 'm'){
			if(s.attività=="sedentario")
				return 0.2*(655 + (13.8* s.peso) + (1.8 * s.altezza) * (4.7 * s.età));
			if(s.attività=="moderatamente attivo")
				return 0.3*(655 + (13.8* s.peso) + (1.8 * s.altezza) * (4.7 * s.età));
			if(s.attività=="attivo")
				return 0.4*(655 + (13.8* s.peso) + (1.8 * s.altezza) * (4.7 * s.età));
			if(s.attività=="molto attivo")
				return 0.5*(655 + (13.8* s.peso) + (1.8 * s.altezza) * (4.7 * s.età));
		}
		if(s.sesso == 'f'){
			if(s.attività=="sedentario")
				return 0.2*(655 + (9.6* s.peso) + (1.8 * s.altezza) * (4.7 * s.età));
			if(s.attività=="moderatamente attivo")
				return 0.3*(655 + (9.6* s.peso) + (1.8 * s.altezza) * (4.7 * s.età));
			if(s.attività=="attivo")
				return 0.4*(655 + (9.6* s.peso) + (1.8 * s.altezza) * (4.7 * s.età));
			if(s.attività=="molto attivo")
				return 0.5*(655 + (9.6* s.peso) + (1.8 * s.altezza) * (4.7 * s.età));
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Persona Anna = new Persona(165, 50, 20, "moderatamente attivo",'f');
		Persona Giovanni = new Persona(180, 90, 28,"sedentario",'m');
		
		System.out.println(BMR(Anna));
		System.out.println(BMR(Giovanni));
	}
	
}
