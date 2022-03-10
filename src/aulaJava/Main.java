package aulaJava;

public class Main {
	public static void exibe() {
		
	}
	//main
	public static void main(String args[]) {
		int idade = 20;
		System.out.println("Idade atual: "+ idade);
		int idadeAnoQueVem= idade +1;
		System.out.println("Idade ano que vem: " + (idade + 1) );
		System.out.println("Idade ano que vem: " + idadeAnoQueVem);
		System.out.println("Idade ano que vem: " + idade + 1 ); //converte para string
		int valor = 'a'; //busca o ASCII referente
		System.out.println(valor);
		char caracter = 97;//busca o ASCII referente
		System.out.println(caracter);
		String nome = "rex";
		System.out.println(nome.toUpperCase());
		if (idade>=18)
			System.out.println("Pode Dirigir"); //um unico comando não requer as chaves
		else
			System.out.println("Não Pode Dirigir");
		boolean resultado = idade>=18 ? true : false;
		System.out.println("Variavel booleana " + resultado);
		
	}
}