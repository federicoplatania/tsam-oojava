package platania.federico.harbour.main;

public class Aereo extends Invasore {
	private int fuocoAlpha = 10;
	private int fuocoBeta = 25;
	private int armamentiAlpha;
	private int armamentiBeta;
	
	
	public int getArmamentiAlpha() {
		return armamentiAlpha;
	}
	public void setArmamentiAlpha(int armamentiAlpha) {
		this.armamentiAlpha = armamentiAlpha;
	}
	public int getArmamentiBeta() {
		return armamentiBeta;
	}
	public void setArmamentiBeta(int armamentiBeta) {
		this.armamentiBeta = armamentiBeta;
	}
	
	
	
	public double potenzaFuoco (){
		return ((this.armamentiAlpha * this.fuocoAlpha) + (this.armamentiBeta * this.fuocoBeta))*1.5;
	}
	
	
	
}
