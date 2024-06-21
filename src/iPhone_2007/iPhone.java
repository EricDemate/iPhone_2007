package iPhone_2007;

import java.util.Locale;
import java.util.Scanner;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		iPhone meuIPhone = new iPhone();

		System.out.println("Testando função IPOD");
		meuIPhone.tocar();
		meuIPhone.pausar();
		meuIPhone.selecionarmusicas("tears for fears - everybody wants to rule the world tradução");

		System.out.println();

		System.out.println("Testando Função Telefone");
		meuIPhone.ligar("2345678");
		meuIPhone.atender();
		meuIPhone.iniciarCorreiodeVoz();

		System.out.println();

		System.out.println("Testando Função Navegador");
		meuIPhone.exibirPagina("www.apple.com");
		meuIPhone.adicionarNovaAba();
		meuIPhone.atualizarPagina();

		sc.close();
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");

	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);

	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");

	}

	@Override
	public void iniciarCorreiodeVoz() {
		System.out.println("Iniciando correio de voz");

	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo música");

	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");

	}

	@Override
	public void selecionarmusicas(String musicas) {
		System.out.println("Selecionando a música: " + musicas);

	}

}
