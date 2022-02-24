package modelos;

public class TelaLogin {
	Usuario user;
	public static void login(Usuario user) {
		if (user.autenticar()) {
			System.out.println("Acesso liberado");
		} else {
			System.out.println("Acesso Negado");
		}
	}
}
