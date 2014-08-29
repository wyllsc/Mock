package br.com.mock.tipoDados;


public class PreencheInteger implements PreencharDados {
	
	public Integer preencher() {
		Integer big = new Integer(0);
		int rnd = (int) (1 + Math.random() * 3);
		big = rnd;
		return big;
	}

	public Integer limpar() {
		return null;
	}

}