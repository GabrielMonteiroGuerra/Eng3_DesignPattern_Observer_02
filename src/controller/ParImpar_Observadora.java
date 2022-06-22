package controller;

public class ParImpar_Observadora implements IObservador {

	@Override
	public void update(int acao) {
		if (acao % 2 == 0) {
			System.out.println("Número par");
		}
		if (acao % 2 == 1) {
			System.out.println("Número impar");
		}
		
	}
}