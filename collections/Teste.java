package collections;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		ColecaoPessoa cowp = new ColecaoPessoa();
		Scanner io = new Scanner(System.in);
		int op = 100;
		do {
			System.out.println("---------------Menu--------------");
			System.out.println("1 - Adicionar pessoa");
			System.out.println("2 - Adicionar pessoa no sistema com cpf");
			System.out.println("3 - Pesquisar pessoa pelo nome");
			System.out.println("4 - Pesquisar pessoa pelo cpf");
			System.out.println("5 - Remover pelo cpf");
			System.out.println("6 - Remover pelo nome");
			System.out.println("0 - Sair");
			System.out.println("Digite a opção desejada: ");
			op = io.nextInt();
			switch (op) {
			case 1:
				int i;
				String n;
				Scanner io1 = new Scanner(System.in);
				System.out.println("Digite o nome da pessoa: ");
				n = io1.nextLine();

				System.out.println("Digite a idade da pessoa: ");
				i = io1.nextInt();
				Pessoa p = new Pessoa(i, n);
				cowp.adicionarHashSet(p);
				break;
			case 2:
				Scanner io2 = new Scanner(System.in);
				String s,
				c;
				Pessoa e = null;
				System.out.println("Digite o nome da pessoa: ");
				s = io2.nextLine();
				e = cowp.pesquisarHashSet(s);
				if (e == null) {
					break;
				}
				System.out.println("Digite o CPF da pessoa: ");
				c = io2.nextLine();
				cowp.adicionarHashMap(c, e);
				break;
			case 3:
				Scanner io3 = new Scanner(System.in);
				String d;
				Pessoa w;
				System.out.println("Digite o nome da pessoa: ");
				d = io3.nextLine();
				w = cowp.pesquisarHashSet(d);
				if (w != null) {
					System.out.println(w);
				}
				break;
			case 4:
				Scanner io4 = new Scanner(System.in);
				String o;
				System.out.println("Digite o CPF da pessoa: ");
				o = io4.nextLine();
				cowp.pesquisarHashMap(o);
				break;
			case 5:
				Scanner io5 = new Scanner(System.in);
				String q;
				System.out.println("Digite o CPF da pessoa: ");
				q = io5.nextLine();
				cowp.removerHashMap(q);
				break;
			case 6:
				Scanner io6 = new Scanner(System.in);
				String x;
				System.out.println("Digite o nome da pessoa: ");
				x = io6.nextLine();
				cowp.removerHashSet(x);
			}

		} while (op != 0);
		io.close();
	}

}
