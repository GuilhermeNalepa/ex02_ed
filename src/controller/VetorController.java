package controller;

public class VetorController {
	
	public VetorController() {
		
		super();
		
	}
	
	public int vetor(int[] vt, int tamanho) {
		
		//Condição de parada
		if (tamanho == 0 ) {
			
			return 0;
			//Quando tamanho for igual a 0, retornará 0 para somar com o contador
			
		} else {
			
			int cont = 0;
			
			int ultimaPosicao = tamanho - 1;
			int valor = vt[ultimaPosicao];
			tamanho = tamanho - 1;
			
			if (valor < 0) {
				
				cont = 1;
				
			}
			
			return cont + vetor(vt, tamanho);
			//Retorno é feito através da soma do contador (que recebe 1 caso
			//o valor seja negativo) com a chamada da função
			
		}
		
	}
	
}