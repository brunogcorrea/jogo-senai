import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int resp = 0;
		int comp = 0;

		Pc pc = new Pc();;
		User user = new User();;
		Vencedor ven = new Vencedor();;

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas partidas terá o jogo?");
		int n = scan.nextInt();
		System.out.println("Teremos: " + n + " partida(s)!");
		System.out.println("Faça sua escolha!\n");
		System.out.println("0 - Pedra");
		System.out.println("1 - Tesoura");
		System.out.println("2 - Papel");
		int n2 = scan.nextInt();
		user.User(n2);
		user.Printando();
		comp = pc.PC();
		resp = (ven.Vencer(n2, comp));
		switch (resp) {
		case 0:
			System.out.println("O computador ganhou!");
			break;
		case 1:
			System.out.println("Parabéns! Você ganhou!");
			break;
		case 2:
			System.out.println("Deu empate!");
			break;
		case 3:
			System.out.println("Erro!!!");
			break;
		}
	}
}
