package org.lessons.java.shop;

public class Main {
	
	public static void main(String[] args){
		
		//Creo la variabile assegnandogli il tipo di classe
		Prodotto prodottoUno = new Prodotto();
		
		
		//Voglio stampare nome del prodotto e descrizione
		prodottoUno.setNomeProdotto("iPhone15");
		prodottoUno.setDescrizioneProdotto("ed è di colore Nero Ardesia");
		System.out.println("Il prodotto si chiama" + " " + prodottoUno.getNomeProdotto() + " " + prodottoUno.getDescrizioneProdotto());
		
		//Richiamiamo il metodo void per crere il codice prodotto randomico
		prodottoUno.getCreateCode();
		System.out.println("il codice del prodotto è:" + " " + prodottoUno.getCodiceProdotto());
		
		//Stampiamo il prezzo con IVA
		prodottoUno.setPrezzoProdotto(100);
		System.out.println("Il prezzo con IVA è:" + " " + prodottoUno.getPrezzoIva());
		
		//Stampiamo nome + codice
		System.out.println(prodottoUno.getNomeCodice());

	}
}
