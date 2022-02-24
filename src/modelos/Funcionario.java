package modelos;

public class Funcionario extends PessoaFisica implements Usuario{ //SuperClass
	//public String login;
	//public String senha;
	public float salario;

	@Override
	public boolean autenticar() {
		System.out.println("Acesso Liberado por Biometria");
		return true;
	}
}
