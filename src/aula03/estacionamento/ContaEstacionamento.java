package aula03.estacionamento;

public class ContaEstacionamento {
	private CalculoValor calculo;
	
	private Veiculo veiculo;
	private int inicio;
	private int fim;
	
	public ContaEstacionamento(Veiculo veiculo, CalculoValor calculo) {
		System.out.println("Conta Estacionamento Criada");
		this.veiculo = veiculo;
		this.calculo = calculo;
	}
	
	public void setCalculo(CalculoValor calculoValor) {
		this.calculo = calculoValor;
	}
	
	public float valorConta() {
		return calculo.calcular(0, this.veiculo);
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
