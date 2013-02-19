package cts;

public class Arete {

	private int time;
	private Tache successeur;
	
	public Arete(int time, Tache tacheC, Tache tacheS) {
		this.time = time;
		this.successeur = successeur;
	}
	
	public int getTime() {
		return this.time;
	}
	
	public Tache getSuccesseur() {
		return this.successeur;
	}
}