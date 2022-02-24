package modelos;

public class Cliente extends PessoaFisica implements Usuario{
	//public String cpf;
	//public String nome;
	public float saldo;
	
	//Estão publicas então não é necessário por hora
	/*public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}*/
	
	@Override
	public String toString() {
		maiuscula();
		return "cpf = " + cpf +
				", nome = " + nome +
				", saldo = R$ " + saldo + "\n";
	}
	
	public void maiuscula()
	{
		nome = super.nome.toUpperCase(); //pode colocar ou não, ele vai procurar se não for declarado
	}
	
	@Override
	public boolean autenticar() {
		System.out.println("Acesso Liberado por Reconhecimento Facial");
		return true;
	}
}
