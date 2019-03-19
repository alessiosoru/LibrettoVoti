package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;

	public Libretto() {
		
		this.voti = new ArrayList<Voto>();
	}
	
	public void add(int voto, String corso, LocalDate date) {
		
	}

	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		voti.add(v);
	}
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * 
	 * @param punti punteggio da  ricerca
	 * @return lista di {@link Voto} aventi quel punteggio (eventualmente vuota)
	 */	
	public List<Voto> cercaVoti(int punti) {
		
		List<Voto> result  = new ArrayList<Voto>();
		
		for( Voto v: this.voti) {
			if(v.getPunti()==punti) {
				result.add(v);
			}
		}
		return result;
		
	}
	
	
	
	/**
	 * Ricerca un voto relativo al corso di cui è specificato il nome
	 * 
	 * @param nomeEsame nome del corso da ricercare
	 * @return il {@link Voto} corrispondente, oppure {@code null} se non esistente
	 */
	public Voto cercaEsame(String nomeEsame) {
		
		Voto voto = new Voto(0, nomeEsame, null); // è un oggetto incompleto ma mi serve
		// solo per poterlo confrontare come oggetto Voto
		int pos = this.voti.indexOf(voto);
		if(pos==-1)
			return null;
		else
			return this.voti.get(pos);
		// ho usato strutture a più alto livello anzichè cicli for annidati
//		for(Voto v:this.voti) {
//			if(v.getCorso().equals(nomeEsame)) {
//				return v;
//			}
//		}
//		return null;
	}
	

	/**
	 * Dato un {@link Voto}, determina se esiste già un voto con uguale corso ed uguale punteggio
	 * 
	 * @param v
	 * @return {@code true}, se ha trovato un corso e punteggio uguali,
	 * 			{@code false} se non ha torvato il corso, oppure l'ha trovato con voto diverso
	 */
	public boolean esisteGiaVoto(Voto v) {
		int pos = this.voti.indexOf(v);
		if(pos==-1)
			return false;
		else
			return v.getPunti() == this.voti.get(pos).getPunti(); // ritorna direttamente vero se uguaglianza vera, falso altimenti
//		else {
//			if(v.getPunti() == this.voti.get(pos).getPunti())
//				return true;
//			else
//				return false;
//		}
		// ho usato strutture a più alto livello anzichè cicli annidati
//		Voto trovato =  this.cercaEsame(v.getCorso());
//		if(trovato==null)
//			return false;
//		if(trovato.getPunti()==v.getPunti()) {
//			return true;
//		} else {
//			return false;
//		}
	}

}
