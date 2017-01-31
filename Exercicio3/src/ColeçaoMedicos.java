import java.util.ArrayList;
import java.util.Iterator;

public class ColeçaoMedicos {

	/**
	 * Classe da coleção da classe medico
	 */
	private ArrayList<Medico> Medicos;

	/**
	 * Construtor da Classe ColeçaoMedicos
	 */
	public ColeçaoMedicos() {
		Medicos = new ArrayList<Medico>();
	}

	/**
	 * Metodo que vai adiconar um objeto da classe Medico no arraylist
	 */
	public void adicionarMedico(Medico me) {
		this.Medicos.add(me);
	}

	/**
	 * Metodo que pesquisa pelo CRM na coleção
	 * 
	 * 
	 */
	public Medico pesquisaPeloCRM(String doc) {
		Medico t, c = null;
		int o = 0;
		Iterator i = Medicos.iterator();
		while (i.hasNext()) {
			t = (Medico) i.next();
			if (doc.equals(t.getCRM())) {
				o++;
				System.out.println(t.toString());
				c = t;
			}
			if (o == 0) {
				System.out
						.println("O Médico com esse CRM não consta no sistema");
			}
		}
		return c;
	}

	/**
	 * 
	 * Metodo que pesquisa por parte do nome do medico na coleção
	 */
	public void pesquisaPorParteDoNome(String n) {
		Medico t;
		int l, o = 0;
		String[] div;
		Iterator i = Medicos.iterator();
		while (i.hasNext()) {
			t = (Medico) i.next();
			div = t.getNome().split(" ");
			l = div.length;
			l--;
			if (n.equals(div[l]) || n.equals(div[l - 1])
					|| n.equals(div[l - 2]) || n.equals(div[l - 3])) {
				System.out
						.println("Médico encontrado com o nome pesquisado:  ");
				System.out.println(t.toString());
				o++;
			}
			if (o == 0) {
				System.out
						.println("O Médico com esse nome não consta no sistema");
			}
		}
	}
}