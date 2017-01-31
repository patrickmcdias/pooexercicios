import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ColeçaoConsultas {

	/**
	 * Classe da coleção da classe consulta
	 */
	private ArrayList<Consulta> Consultas;

	/**
	 * Contrustor da ColeçaoConsultas
	 */
	public ColeçaoConsultas() {
		Consultas = new ArrayList<Consulta>();
	}

	/**
	 * 
	 * Metodo que vai adicionar um objeto Consulta no arraylist
	 */
	public void adicionarConsulta(Consulta co) {
		this.Consultas.add(co);
	}

	/**
	 * Metodo que vai trazer a quantidade de consultas em uma determinada data
	 */
	public void qntdDeconsultasData() {
		int d, m, a, cont = 0;
		Consulta t;
		Scanner io = new Scanner(System.in);
		System.out.println("Digite o dia que quer consultar: ");
		d = io.nextInt();
		System.out.println("Digite o mês que quer consultar: ");
		m = io.nextInt();
		System.out.println("Digite o ano que quer consultar: ");
		a = io.nextInt();
		Iterator i = Consultas.iterator();
		while (i.hasNext()) {
			t = (Consulta) i.next();
			if (t.getData().getDayOfMonth() == d
					&& t.getData().getMonthValue() == m
					&& t.getData().getYear() == a) {
				cont++;
			}
		}
		System.out.println("Quantidade de consultas na data pesquisada " + d
				+ "/" + m + "/" + a + ": " + cont);
	}

	/**
	 * Metodo que vai trazer a lista de consultas em uma determinada data
	 */
	public void listagemConsultas() {
		Consulta t;
		int d, m, a;
		Iterator i = Consultas.iterator();
		Scanner io = new Scanner(System.in);
		System.out.println("Digite o dia que quer consultar: ");
		d = io.nextInt();
		System.out.println("Digite o mês que quer consultar: ");
		m = io.nextInt();
		System.out.println("Digite o ano que quer consultar: ");
		a = io.nextInt();
		System.out.println("Lista de consultas na data" + d + "/" + m + "/" + a
				+ ":");
		while (i.hasNext()) {
			t = (Consulta) i.next();
			if (t.getData().getDayOfMonth() == d
					&& t.getData().getMonthValue() == m
					&& t.getData().getYear() == a) {
				System.out.println(t.toString());
			}
		}
	}

	/**
	 * Metodo que vai trazer a quantidade de consultas de um medico
	 */
	public void qntdDeconsultasMedico() {
		int cont = 0;
		String n;
		Consulta t;
		Scanner io = new Scanner(System.in);
		System.out
				.println("Digite o nome completo do médico que deseja saber a quantidade de consultas:");
		n = io.nextLine();
		Iterator i = Consultas.iterator();
		while (i.hasNext()) {
			t = (Consulta) i.next();
			if (t.getMedico().getNome().equals(n)) {
				cont++;
			}
		}
		System.out.println("Quantidade de consultas que o médico " + n
				+ " tem: " + cont);
	}

	/**
	 * Metodo que vai trazer a lista de consultas de um paciente
	 * 
	 * 
	 * */
	public void lisaconsultasPaciente() {
		int cont = 0;
		String n;
		Consulta t;
		Scanner io = new Scanner(System.in);
		System.out
				.println("Digite o nome completo do paciente que deseja saber as consultas:");
		n = io.nextLine();
		Iterator i = Consultas.iterator();
		System.out.println("Lista das consultas do paciente" + n);
		while (i.hasNext()) {
			t = (Consulta) i.next();
			if (t.getPaciente().getNome().equals(n)) {
				System.out.println(t.toString());
			}
		}
	}
}
