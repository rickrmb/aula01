package aula01;

//Como queremos utilziar o Scanner para ler os dados que o usu�rio vai digitar, e ele n�o � carregado por padr�o, precisamos IMPORTAR o Scanner para que nosso programa "entenda" ele
import java.util.Scanner;

//Esse programa deve receber o nome do usu�rio e exibir este nome com uma mensagem de boas vindas

public class ProgramaNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A linha abaixo cria um leitor para lermos o teclado do usu�rio
		Scanner leitor = new Scanner(System.in);
		//Scanner � uma classe que existe na biblioteca do JAVA. � um programinha que segue uma s�rie de tarefas. Faz leitura de textos.
		
		//A linha abaixo cria uma vari�vel (espa�o na RAM) para guardar dados do tipo String (textos)
		String nome;
		//nome � o nome da vari�vel, � assim que isso ser� identificado
		
		System.out.println("Fale o nome de uma pessoa pra eu dar uma opini�o:");
		//Esse c�digo l� um texto do teclado do usu�rio
		
		//A linha abaixo pega o texto digitado pelo usu�rio e guarda na vari�vel "nome"
		nome = leitor.next();
		
		//Para lermos textos com espa�o, podemos usar o nextLine:
		//nome = leitor.nextLine();
		//Letra maiuscula a gente usa para criar classes
		//letras minusculas usa para nomes de objetos, nomes de vari�veis e nomes de m�todos
		//m�todo � alguma coisa que uma classe � capaz de fazer
		//como eu sei que leitor.next � um m�todo e n�o uma vari�vel?Por conta do "ponto"
		
		System.out.println("Nossa! " + nome+ "! Vou nem dizer o que eu acho kkkk.");
		
		//Vari�vel � um espa�o que tem na mem�ria RAM do computador.

		//Ao abrir um recurso, voc� deve fecha-lo imediatamente. Regra: Ap�s terminarmos de usar o leitor, precisamos fechar
		leitor.close();
	}

}