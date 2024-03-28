import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

public class ACMESports {
	private Scanner entrada = new Scanner(System.in);
	private PrintStream saidaPadrao = System.out;   // Guarda a saida padrao - tela (console)
	private final String nomeArquivoEntrada = "dadosin.txt";
	private final String nomeArquivoSaida = "dadosout.txt";
	private Medalheiro medalheiro;
	private Plantel plantel;

	public ACMESports() {
		redirecionaES();

		medalheiro = new Medalheiro();
		plantel = new Plantel();
	}

	public void executar() {
		menu();
		int opcao = entrada.nextInt();
		entrada.nextLine();
		System.out.println("====================================");
		while(opcao != 0) {
			switch (opcao) {
				case 1:
					cadastrarAtleta();
					break;
				case 2:
					cadastrarMedalha();
					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 6:

					break;
				case 7:

					break;
				case 8:

					break;
				case 9:

					break;
				case 10:

					break;
				case 11:

					break;
				case 12:

					break;
				case 0:
					break;
				default:
					System.out.println("Opcao invalida. Digite novamente.");
			}
			menu();
			opcao = entrada.nextInt();
			entrada.nextLine();
			System.out.println("====================================");
		}
		System.out.println("Fim da execucao...");
	}

	private void menu() {
		System.out.println("====================================");
		System.out.println("Opcoes:");
		System.out.println("1: 	Cadastrar atleta");
		System.out.println("2: 	Cadastrar medalha");
		System.out.println("3: 	Cadastrar medalhas e atletas correspondentes");
		System.out.println("4: 	Mostrar os dados de um determinado atleta (por número)");
		System.out.println("5: 	Mostrar os dados de um determinado atleta (por nome)");
		System.out.println("6: 	Mostrar os dados de uma determinada medalha (por código)");
		System.out.println("7: 	Mostrar os dados dos atletas de um determinado país");
		System.out.println("8: 	Mostrar os dados atletas de um determinado tipo de medalha");
		System.out.println("9: 	Mostrar os dados atletas de uma determinada modalidade");
		System.out.println("10: Mostrar os dados do atleta com mais medalhas");
		System.out.println("11: Mostrar o quadro geral de medalhas por país");
		System.out.println("12: Mostrar o quadro geral de medalhas completo");
		System.out.println("0: 	Sair");
		System.out.print("Digite a opcao desejada: ");
	}

	private void cadastrarAtleta() {
		System.out.println("CADASTRAR UM ATLETA");
		System.out.print("Digite o numero do atleta: ");
		int numero = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Digite o nome do atleta: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o país do atleta: ");
		String pais = entrada.nextLine();
		Atleta atleta = new Atleta(numero,nome,pais);
		plantel.cadastraAtleta(atleta);
        System.out.println("Atleta cadastrado!");
	}

	private void cadastrarMedalha() {
		System.out.println("CADASTRAR UMA MEDALHA");
		System.out.print("Digite o codigo da medalha: ");
		int codigo = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Digite o tipo da medalha: ");
		int tipo = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Digite true se a medalha é individual e false se a medalha é de uma equipe: ");
		boolean individual = Boolean.parseBoolean(String.valueOf(entrada));
		System.out.println("Digite a modalidade da medalha: ");
		String modalidade = entrada.nextLine();
		Medalha medalha = new Medalha(codigo, tipo, individual, modalidade);
		medalheiro.cadastraMedalha(medalha);
		System.out.println("Medalha cadastrada!");
	}

	private Atleta dadosAtletaNumero(int numero){
		return null;
	}

	private Atleta dadosAtletaNome(String nome){
		return null;
	}

	private Medalha dadosMedalhaCod(int codigo){
		return null;
	}








	private void redirecionaES() {
		try {
			BufferedReader streamEntrada = new BufferedReader(new FileReader(nomeArquivoEntrada));
			entrada = new Scanner(streamEntrada);   // Usa como entrada um arquivo
			PrintStream streamSaida = new PrintStream(new File(nomeArquivoSaida), Charset.forName("UTF-8"));
//			System.setOut(streamSaida);             // Usa como saida um arquivo
		} catch (Exception e) {
			System.out.println(e);
		}
		Locale.setDefault(Locale.ENGLISH);
		entrada.useLocale(Locale.ENGLISH);
	}

	private void restauraES() {
		System.setOut(saidaPadrao);
		entrada = new Scanner(System.in);
	}
}