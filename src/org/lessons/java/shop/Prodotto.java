package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	//Creo gli attributi della classe
	private int codiceProdotto;
	
	private String nomeProdotto;
	
	private String descrizioneProdotto;
	
	private double prezzoProdotto;
	
	private static double ivaProdotto = 1.22;
	

	//GETTER NOME	
	public String getNomeProdotto() {
		return nomeProdotto;
	}


	//SETTER NOME	
	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}


	//GETTER DESCRIZIONE	
	public String getDescrizioneProdotto() {
		return descrizioneProdotto;
	}


	//SETTER DESCRIZIONE	
	public void setDescrizioneProdotto(String descrizioneProdotto) {
		this.descrizioneProdotto = descrizioneProdotto;
	}


	//GETTER PREZZO	
	public double getPrezzoProdotto() {
		return prezzoProdotto;
	}


	//SETTER DESCRIZIONE
	public void setPrezzoProdotto(double prezzoProdotto) {
		this.prezzoProdotto = prezzoProdotto;
	}

	
	//GETTER CODICE	
	public int getCodiceProdotto() {
		return codiceProdotto;
	}


	//METODO PER CREARE CODICE RANDOMICO
	public void getCreateCode(){
		Random numeroRandomico = new Random(); //importo l'utilities per il random
		codiceProdotto = numeroRandomico.nextInt(10000); //assegno all'attributo il num random
	}
	
	//METODO CALCOLO PREZZO + IVA
	public double getPrezzoIva() {
		return prezzoProdotto * ivaProdotto; //faccio ritornare al double il calcolo
	}
	
	//CREO LA STRINGA NOME+CODICE
	public String getNomeCodice() {
		return nomeProdotto + "-" + codiceProdotto; //creo concatenazione
	}
	
}
