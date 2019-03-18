package it.polito.tdp.libretto;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto libr = new Libretto();
		
		libr.add(30, "Analisi I", LocalDate.of(2017, 1, 15));
		libr.add(21, "Analisi II", LocalDate.of(2018, 1, 25));
		libr.add(25, "Fisica I", LocalDate.of(2017, 6, 10));
		libr.add(28, "Fisica II", LocalDate.of(2018, 9, 3));
		libr.add(18, "Geometria", LocalDate.of(2017, 9, 1));
		libr.add(20, "Economia", LocalDate.of(2018, 1, 28));
		libr.add(25, "Ricerca Operativa", LocalDate.of(2018, 6, 5));
		libr.add(24, "Complementi di Economia", LocalDate.of(2018, 2, 15));
		libr.add(25, "Logistica", LocalDate.of(2019, 2, 1));
		libr.add(27, "Programmazione a Oggetti", LocalDate.of(2019, 1, 25));

	}

}
