package br.com.mock.tipoDados;

import java.math.BigDecimal;

public class PreencheBigDecimal implements PreencharDados {

	public BigDecimal preencher() {
		BigDecimal big = new BigDecimal(0);
		BigDecimal rnd = BigDecimal.valueOf(1 + Math.random() * 7366858675.00);
		big = rnd;
		return big;
	}

	public BigDecimal limpar() {
		return null;
	}

}