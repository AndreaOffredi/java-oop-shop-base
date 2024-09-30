package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	//Creo gli attributi della classe
	int codiceProdotto;
	
	String nomeProdotto;
	
	String descrizioneProdotto;
	
	double prezzoProdotto;
	
	double ivaProdotto = 1.22;
	
	
	//Creo i metodi della classe
	//METODO PER CREARE CODICE RANDOMICO
	void createCode(){
		Random numeroRandomico = new Random(); //importo l'utilities per il random
		codiceProdotto = numeroRandomico.nextInt(10000); //assegno all'attributo il num random
	}
	
	//METODO CALCOLO PREZZO + IVA
	double getPrezzoIva() {
		return prezzoProdotto * ivaProdotto; //faccio ritornare al double il calcolo
	}
	
	//CREO LA STRINGA NOME+CODICE
	String getNomeCodice() {
		return nomeProdotto + "-" + codiceProdotto; //creo concatenazione
	}
	
}
