package br.com.mock.tipoDados;

import java.util.Random;

public class PreencheBoolean implements PreencharDados {

	@Override
	public Boolean preencher() {
		Boolean valido;
		Random rd = new Random();
		valido = rd.nextBoolean();
		
		return valido;
	}

	@Override
	public Object limpar() {
		return null;
	}


}
