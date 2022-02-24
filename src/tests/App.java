package tests;

import java.util.LinkedList;

import modelos.Cliente;
import modelos.Funcionario;
import modelos.TelaLogin;

public class App {

	public static void main(String[] args) {
		Cliente obj1 = new Cliente();
		
		
		LinkedList<Cliente> lista = new LinkedList<Cliente>();
		for(int i = 0; i < 10; i++) {
			Cliente tmp = new Cliente()
;			tmp.nome = "Nome da Pessoa" + i;
			tmp.cpf = "CPF da Pessoa" + i;
			tmp.saldo = 10000+50*i;
			lista.add(tmp);
			
		}
		
			System.out.println("-----------------------------");
			System.out.println(lista);
			
			Cliente turing = lista.get(1);
			turing.nome = "Turing";
			turing.nome.toUpperCase();
			
			Cliente juca = lista.get(3);
			juca.nome = "Juca";
			
			System.out.println("------------------------------");
			System.out.println(lista);
			
			Funcionario juquinha = new Funcionario();
			juquinha.nome = "Juquinha";
			juquinha.salario = 2000;
			
			TelaLogin.login(juquinha);
			
			TelaLogin.login(juca);
			
			
			
			
		
		
		

	}

}
