import java.util.Random;

public class Pc {
	Random randomValue = new Random();
	int valorAleatorio;
	Random op = new Random();

	int PC() {
		int valorAleatorio = randomValue.nextInt(3);
		this.valorAleatorio = valorAleatorio;
		switch (valorAleatorio) {
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
		return valorAleatorio;
	}

	public void Pedra() {
	}

	public void Tesoura() {
	}

	public void Papel() {
	}

	public void Printando() {
		switch (valorAleatorio) {
		case 0:
			System.out.println("O computador escolheu Pedra!");
			break;
		case 1:
			System.out.println("O computador escolheu Tesoura");
			break;
		case 2:
			System.out.println("O computador escolheu Papel!");
			break;
		}
	}
}