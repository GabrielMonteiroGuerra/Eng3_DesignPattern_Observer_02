package controller;

public class NumeroAleatorio_Observavel implements IObservavel, INumeroAleatorio {
	
	private ParImpar_Observadora parImpar;
	private int acao;
	
	public NumeroAleatorio_Observavel(ParImpar_Observadora parImpar) {
		this.parImpar = parImpar;
	}
	

	@Override
	public void geraNumeroAleatorio() {
        int aleatorioNum = (int) ((Math.random() * 1000 ) + 1 );  
        acao = aleatorioNum;
        System.out.println("Numero aleatório: "+aleatorioNum);
        parImpar.update(acao);
		
	}


	@Override
	public void notificaMudanca(int acao) {
		parImpar.update(acao);
		
	}


}
