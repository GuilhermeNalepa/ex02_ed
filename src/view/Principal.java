package view;

import controller.VetorController;

public class Principal {

	public static void main(String[] args) {
		
		VetorController vc = new VetorController();
		int[] vt = {5,-9,2,8,-5,-9,3,-1,6,7};
		int tamanho = vt.length;

		int vetor = vc.vetor(vt, tamanho);
		System.out.println("Quantidade de números negativos = " + vetor);

	}

}