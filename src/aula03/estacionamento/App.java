package aula03.estacionamento;

public class App {

	public static void main(String[] args) {
		VeiculoPasseio v = new VeiculoPasseio();
		ContaEstacionamento cliente1 = new ContaEstacionamento(v, new CalculoDiaria());
		cliente1.valorConta();
		cliente1.setCalculo(new CalculoMensal());
		cliente1.valorConta();
		
	}

}
