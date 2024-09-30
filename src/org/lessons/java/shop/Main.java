package org.lessons.java.shop;

public class Main {
	
	public static void main(String[] args){
		
		//Creo la variabile assegnandogli il tipo di classe
		Prodotto prodottoUno = new Prodotto();
		
		//Assegno gli attributi al prodotto uno
		prodottoUno.nomeProdotto = "iPhone 15";
		prodottoUno.descrizioneProdotto = "Nuovo iPhone con Intelligenza Artificiale incorporata";
		prodottoUno.prezzoProdotto = 1499.99;
		
		//Voglio stampare nome del prodotto e descrizione
		System.out.println("Nome Prodotto: " + prodottoUno.nomeProdotto);
		System.out.println("Descrizione: " + prodottoUno.descrizioneProdotto);
		
		//Richiamiamo il metodo void per crere il codice prodotto randomico
		prodottoUno.createCode();
		System.out.println("Codice Prodotto: " + prodottoUno.codiceProdotto);
		
		//Stampiamo il prezzo con IVA
		System.out.println("Il Prezzo Totale è: " + prodottoUno.getPrezzoIva());
		
		//Stampiamo nome + codice
		System.out.println("Il nome esteso è: "+ prodottoUno.getNomeCodice());
		
	}
}
