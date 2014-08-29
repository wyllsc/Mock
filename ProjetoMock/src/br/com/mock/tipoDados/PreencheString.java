package br.com.mock.tipoDados;

public class PreencheString implements PreencharDados {

	public String preencher() {
		String resultado = new String();
		String[] nome = new String[23];
		nome[0] = "Mirella";
		nome[1] = "Mitsuki";
		nome[2] = "Allana";
		nome[3] = "Alex";
		nome[4] = "Eduardo";
		nome[5] = "Sofia ";
		nome[6] = "Joana";
		nome[7] = "Kátia";
		nome[8] = "Letícia";
		nome[9] = "Adriano";
		nome[10] = "Mateus";
		nome[11] = "Samanta";
		nome[12] = "Wylliam";
		nome[13] = "Sonia";
		nome[14] = "Marcus";
		nome[15] = "Carlos";
		nome[16] = "Marcelo";
		nome[17] = "Michel";
		nome[18] = "Natalia";
		nome[19] = "Mayra";
		nome[20] = "Allison";
		nome[21] = "Bruna";
		nome[22] = "Jeane";
		int indice = getRandomico(nome.length);
		resultado = nome[indice];
		return resultado;
	}

	public String limpar() {
		return null;
	}

	public static int getRandomico(int tamanho) {
		return (int) (Math.random() * (double) tamanho);
	}

}