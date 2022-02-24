package aula03;

import aula03.testes.Funcionario;

public class PessoaFisica extends Funcionario implements Pessoa{
	private String CPF;

	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
