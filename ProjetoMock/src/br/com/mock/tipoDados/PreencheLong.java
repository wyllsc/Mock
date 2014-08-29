package br.com.mock.tipoDados;


public class PreencheLong implements PreencharDados {

	public Long preencher() {
		Long big = new Long(0l);
		long rnd = (long) (1 + Math.random() * 999999999);
		big = rnd;
		return big;
	}

	public Long limpar() {
		return null;
	}

}