package br.senai.sp.jandira.model;

import br.senai.sp.jandira.Tabuada;


public class AppTabuada {

	public static void main(String[] args) {
		

		
		Tabuada tabuada = new Tabuada();
		tabuada.multiplicando = 8;
		tabuada.minimoMultiplicador = 1;
		tabuada.maximoMultiplicador = 1000;
		
		
		int i = 0;
		String resultado[] = tabuada.getTabuada();
		
		while (i < resultado.length) {
		
			System.out.println(resultado[i]);
			i++;
			
		}
		
	}

}