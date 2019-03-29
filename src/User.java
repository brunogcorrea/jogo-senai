public class User {
	int pedra, papel, tesoura, n;

	public int User(int n) {
		this.n = n;
		switch (n) {
		case 0:
			Pedra();
			break;
		case 1:
			Tesoura();
			break;
		case 2:
			Papel();
			break;
		}
		return n;
	}

	public void Pedra() {
	}

	public void Tesoura() {
	}

	public void Papel() {
	}

	public void Printando() {
		switch (n) {
		case 0:
			System.out.println("Usuário escolheu Pedra!");
			break;
		case 1:
			System.out.println("Usuário escolheu Tesoura!");
			break;
		case 2:
			System.out.println("Usuário escolheu Papel!");
			break;
		}
	}
}