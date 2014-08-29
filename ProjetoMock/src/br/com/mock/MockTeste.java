package br.com.mock;


import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.mock.tipoDados.PreencharDados;
import br.com.mock.tipoDados.PreencheBigDecimal;
import br.com.mock.tipoDados.PreencheBoolean;
import br.com.mock.tipoDados.PreencheCharacter;
import br.com.mock.tipoDados.PreencheDate;
import br.com.mock.tipoDados.PreencheInteger;
import br.com.mock.tipoDados.PreencheLong;
import br.com.mock.tipoDados.PreencheString;

/**
 * Classe utilizada para preenchimento de objetos para Teste
 * @author Wylliam SantClair
 */
public class MockTeste{

	/**
	 * Mapa com as classes que preenchem os objetos para os testes, caso necessitem basta 
	 * criar classes especificas para preenchimento
	 * 
	 * OBS: Preenche Apenas:
	 * 		BigDecimal; 
	 * 		String; 
	 * 		Integer; 
	 * 		Long; 
	 * 		Date; 
	 * 		Boolean; 
	 * 		Character
	 */
	public static  Map<Class, PreencharDados> mapaPreenche = new HashMap<Class, PreencharDados>();
	static {
		mapaPreenche.put(BigDecimal.class, new PreencheBigDecimal());
		mapaPreenche.put(String.class, new PreencheString());
		mapaPreenche.put(Integer.class, new PreencheInteger());
		mapaPreenche.put(Long.class, new PreencheLong());
		mapaPreenche.put(Date.class, new PreencheDate());
		mapaPreenche.put(Boolean.class, new PreencheBoolean());
		mapaPreenche.put(Character.class, new PreencheCharacter());
	}

	/**
	 * Método que retorna uma lista preenchida com a classe passada como parametro <br/>
	 * A classe não preenche atributos de lista.
	 * Ex: 
	 * List<RelatorioDadosBalanceteAnaliticoVo> lista = MockTeste.complementaListaEntidade(RelatorioDadosBalanceteAnaliticoVo.class);
	 * @param classe - classe que será preenchida varias vezes
	 * @param qtdLista - Quantidade de itens na lista
	 * @return List<T> lista preenchida
	 */
	public static <T>List<T> complementaListaEntidade(Class<T> classe, Integer qtdLista) {

		/*
		 * Quantidade de itens na lista
		 */
		int totalIncremento = qtdLista;
		
		List<T> listaRetorno = new ArrayList<T>();

		for (int i = 0; i < totalIncremento; i++) {

			Object objeto = new Object();
			try {
				objeto = classe.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
			List<Field> listaAtributos = new ArrayList<Field>();
			Class superClasse =  classe.getSuperclass();

			//Objeto criado apenas para ser usado como verificao de object no while
			Object obj = new Object();
			
			/*
			 * Verifica super classe em caso de herança
			 */
			while(!(superClasse.isInstance(obj))){
				listaAtributos.addAll(Arrays.asList(superClasse.getDeclaredFields()));
				superClasse = superClasse.getSuperclass();
			}
			listaAtributos.addAll(Arrays.asList(classe.getDeclaredFields()));

			
			for (Field field : listaAtributos) {
				field.setAccessible(true);
				Class<?> tipoList = List.class;
				Class<?> tipoHash = HashMap.class;
				Class<?> tipoLongSerializable = long.class;
				Class<?> tipoEntidade = Class.class;
				
				if (field.getType().equals(BigDecimal.class)
						|| field.getType().equals(String.class)
						|| field.getType().equals(Integer.class)
						|| field.getType().equals(Long.class)
						|| field.getType().equals(Date.class)
						|| field.getType().equals(Boolean.class)
						|| field.getType().equals(Character.class)) {

					if (!field.getType().isAssignableFrom(tipoList)
							&& !field.getType().isAssignableFrom(tipoLongSerializable)
							&& !field.getType().isAssignableFrom(tipoEntidade)
							&& !field.getType().isAssignableFrom(tipoHash)) {
						if (!field.getType().equals(List.class)) {
							Object valor = mapaPreenche.get(field.getType()).preencher();
							try {
								objeto.getClass().getDeclaredField(field.getName()).set(objeto, valor);
							} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
								e.printStackTrace();	
							}
						}
					}
				}
			}
			listaRetorno.add((T) objeto);

		}
		return listaRetorno;
	}	
	
}