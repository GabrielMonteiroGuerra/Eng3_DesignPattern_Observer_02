package view;

import controller.ParImpar_Observadora;
import controller.NumeroAleatorio_Observavel;

public class Principal {
	public static void main(String[] args) {
		ParImpar_Observadora parImpar = new ParImpar_Observadora();
		NumeroAleatorio_Observavel numA = new NumeroAleatorio_Observavel(parImpar);
		NumeroAleatorio_Observavel numB = new NumeroAleatorio_Observavel(parImpar);
		
		numA.geraNumeroAleatorio();
		numB.geraNumeroAleatorio();
		
	}
}
