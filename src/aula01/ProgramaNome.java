package aula01;

//Como queremos utilziar o Scanner para ler os dados que o usuário vai digitar, e ele não é carregado por padrão, precisamos IMPORTAR o Scanner para que nosso programa "entenda" ele
import java.util.Scanner;

//Esse programa deve receber o nome do usuário e exibir este nome com uma mensagem de boas vindas

public class ProgramaNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A linha abaixo cria um leitor para lermos o teclado do usuário
		Scanner leitor = new Scanner(System.in);
		//Scanner é uma classe que existe na biblioteca do JAVA. É um programinha que segue uma série de tarefas. Faz leitura de textos.
		
		//A linha abaixo cria uma variável (espaço na RAM) para guardar dados do tipo String (textos)
		String nome;
		//nome é o nome da variável, é assim que isso será identificado
		
		System.out.println("Fale o nome de uma pessoa pra eu dar uma opinião:");
		//Esse código lê um texto do teclado do usuário
		
		//A linha abaixo pega o texto digitado pelo usuário e guarda na variável "nome"
		nome = leitor.next();
		
		//Para lermos textos com espaço, podemos usar o nextLine:
		//nome = leitor.nextLine();
		//Letra maiuscula a gente usa para criar classes
		//letras minusculas usa para nomes de objetos, nomes de variáveis e nomes de métodos
		//método é alguma coisa que uma classe é capaz de fazer
		//como eu sei que leitor.next é um método e não uma variável?Por conta do "ponto"
		
		System.out.println("Nossa! " + nome+ "! Vou nem dizer o que eu acho kkkk.");
		
		//Variável é um espaço que tem na memória RAM do computador.

		//Ao abrir um recurso, você deve fecha-lo imediatamente. Regra: Após terminarmos de usar o leitor, precisamos fechar
		leitor.close();
	}

}