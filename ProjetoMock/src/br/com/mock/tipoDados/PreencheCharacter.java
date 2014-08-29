package br.com.mock.tipoDados;

import java.util.Random;

public class PreencheCharacter implements PreencharDados {
	
	public Character preencher() {

		final String alphabet = "IAE";
		final int N = alphabet.length();

		Random r = new Random();

		Character resultado = alphabet.charAt(r.nextInt(N));
		return resultado;
	}

	public String limpar() {
		return null;
	}
}