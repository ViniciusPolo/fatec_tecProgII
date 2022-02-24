package aula03.testes;

public abstract class Funcionario {
	private String codigo;
	
	public abstract float getSalario();
	
	public String getCodigoFuncionario() {
		return this.codigo;
	}
}
