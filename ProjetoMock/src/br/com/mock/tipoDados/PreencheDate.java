package br.com.mock.tipoDados;

import java.util.Date;

public class PreencheDate implements PreencharDados {
	
	public Date preencher() {
		Date big = new Date();
		big = new Date();
		return big;
	}

	public Date limpar() {
		return null;
	}
}