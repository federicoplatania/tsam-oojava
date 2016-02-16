package platania.federico.harbour.main;

public class PortoNavale {
	private String nome;
	private int nImbarcazioni;
	private double dimensione; //in metriquadri
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getnImbarcazioni() {
		return nImbarcazioni;
	}
	public void setnImbarcazioni(int nImbarcazioni) {
		this.nImbarcazioni = nImbarcazioni;
	}
	public double getDimensione() {
		return dimensione;
	}
	public void setDimensione(double d) {
		this.dimensione = d;
	}
	
	
	public String salute (){
		return "";
	}
}
