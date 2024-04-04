package fr.voxi.admin;

public class Oeuvre {
	private int numero;
	private String titre;
	private static int NbOeuvre = 0;
	
	public Oeuvre ( int numero, String titre) {
		super();
		this.numero = numero ; 
		this.titre = titre;
		this.NbOeuvre = NbOeuvre+1 ;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNbOeuvre() {
		return NbOeuvre;
	}

	public void setNbOeuvre(int NbOeuvre) {
		this.NbOeuvre = NbOeuvre;
	}
	@Override
	public String toString() {
		return "Oeuvre [numero=" + numero + ", titre=" + titre + "]";
	}
	

}
