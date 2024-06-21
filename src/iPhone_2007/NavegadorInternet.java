package iPhone_2007;

public interface NavegadorInternet {
	/*
	 * interface NavegadorInternet define um conjunto de capacidades básicas que
	 * qualquer navegador de internet deve ter. Isso inclui exibir uma página da
	 * web, adicionar novas abas e atualizar a página atual.
	 */

	void exibirPagina(String url);

	void adicionarNovaAba();

	void atualizarPagina();

}
