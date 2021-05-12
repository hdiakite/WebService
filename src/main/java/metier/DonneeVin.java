package metier;

public class DonneeVin {

	private int id;
	private Vin vin;
	private int quantite;
	public Vin getVin() {
		return vin;
	}
	public void setVin(Vin vin) {
		this.vin = vin;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public void addQuantite (int newquantite) {
		this.quantite= this.quantite + newquantite;
	}
	
	public void removeQuantite (int removquantite) {
		if(this.quantite > removquantite) {
			this.quantite= this.quantite - removquantite;
		}
	}
	
	public DonneeVin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
