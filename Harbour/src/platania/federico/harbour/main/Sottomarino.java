package platania.federico.harbour.main;

public class Sottomarino extends Invasore {
	private double nArmamenti;
	private int stazza; // in tonnellate
	
	public double getnArmamenti() {
		return nArmamenti;
	}

	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public double potenzaFuoco(){
		return  (this.nArmamenti * this.stazza)*1.5;
	}
}
