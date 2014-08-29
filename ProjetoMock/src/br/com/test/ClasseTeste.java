package br.com.test;

import java.util.List;

import br.com.mock.MockTeste;

public class ClasseTeste {

	/**
	 * Teste Feito Com EntidadeUsuario.class adicionando na lista 8 elementos
	 */
	public static void testar() {
		
		List<EntidadeUsuario> lista = MockTeste.complementaListaEntidade(EntidadeUsuario.class, 8);
		System.out.println("Teste Feito Com EntidadeUsuario.class adicionando na lista 8 elementos");

		for (EntidadeUsuario entidadeUsuario : lista) {
			
			System.out.println("----------------//----------------");
			System.out.println("entidadeUsuario.getEntidadeUsuario() -- Não é preenchido pelo Mock EntidadeUsuario.class");
			
			System.out.println("entidadeUsuario.getLogin()");
			System.out.println(entidadeUsuario.getLogin());
			
			System.out.println("entidadeUsuario.getDataNascimento()");
			System.out.println(entidadeUsuario.getDataNascimento().toGMTString());

			System.out.println("entidadeUsuario.getId()");
			System.out.println(entidadeUsuario.getId());

			System.out.println("entidadeUsuario.getIsVerdade()");
			System.out.println(entidadeUsuario.getIsVerdade());
			
			System.out.println("entidadeUsuario.getQuantidade()");
			System.out.println(entidadeUsuario.getQuantidade());

			System.out.println("entidadeUsuario.getValor()");
			System.out.println(entidadeUsuario.getValor());

			System.out.println("entidadeUsuario.getCaracterEspecial()");
			System.out.println(entidadeUsuario.getCaracterEspecial());
			System.out.println("----------------//----------------");
		}
	}
}
