public class Calculadora {
	
	public static void main(String[] args) {
		//variavel que indica o valor investido no anuncio
		double valorInvestido=59.50;
		
		//variavel que guarda as pessoas alcancadas pelo investimento no anuncio
		int quantidadeDePessoas =0;
		//variavel que guarda as pessoas que visualizam e clicam
		int pessoasClicaram = 0;
		//variavel que guarda as pessoas que clicam e compartilham
		int numeroCompartilhamentos;
		//variavel que guarda a projeção de pessoas que irao visualizar o anuncio
		int numeroVisualizacoes;
		
		// funcao que calcula a quantidade de pessoas que serao alcancadas pelo investimento
		for(int valor = 1; valor<= (int) valorInvestido; valor++) {
			quantidadeDePessoas +=30;
			// calcula a quantidade de pessoas que clicam no anuncio
			int div = (int) quantidadeDePessoas/100;
			pessoasClicaram = div*12;
		}
		
		// calcula a quantidade de pessoas que compartilham o anuncio
		int div = (int) pessoasClicaram/20;
		numeroCompartilhamentos = div*3;
		
		// calcula a quantidade de pessoas que visualizam o anuncio
		numeroVisualizacoes = quantidadeDePessoas + numeroCompartilhamentos*40;
		
		System.out.println("A quantidade de pessoas alcancadas pelo valor investido e: "+ quantidadeDePessoas);
		System.out.println("A quantidade de pessoas que clicaram e: "+pessoasClicaram);
		System.out.println("A quantidade de pessoas que clicaram/compartilharam e: "+numeroCompartilhamentos);
		System.out.println("A quantidade de pessoas que visualizaram e: "+numeroVisualizacoes);
	}
}