import java.util.*;
import java.text.*;

public class coleçãoPacientes {
	/**
	 * Classe da coleção da classe Paciente
	 */

	private ArrayList<Paciente> Pacientes;

	/**
	 * Contrustor da coleçaoPacientes
	 */
	public coleçãoPacientes() {
		Pacientes = new ArrayList<Paciente>();
	}

	/**
	 * 
	 * Metodo que vai adicionar um objeto Paciente no arraylist
	 */
	public void adicionarPaciente(Paciente pa) {
		this.Pacientes.add(pa);
	}

	/**
	 * Metodo que vai pesquisar pelo documento do paciente na coleção
	 * */
	public Paciente pesquisaPeloDocumento(String doc) {
		int k = 0;
		Paciente j = null;
		for (Paciente t : Pacientes) {
			if (doc.equals(t.getDocumento())) {
				System.out.println(t.toString());
				k++;
				j = t;
			}
		}
		if (k == 0) {
			System.out
					.println("O paciente com esse documento não consta no sistema");
		}

		// Iterator i = Pacientes.iterator();
		// while (i.hasNext()) {
		// t = (Paciente) i.next();
		// if (doc.equals(t.getDocumento())) {
		// System.out.println(t.toString());
		// j=t;
		// } else {
		// System.out
		// .println("O paciente com esse documento não consta no sistema");
		// }
		// }
		return j;
	}

	/**
	 * Metodo que vai remover o paciente pelo documento na coleção
	 * */
	public void removePeloDocumento(String doc) {
		Paciente t;
		int k = 0;
		for (Iterator<Paciente> i = Pacientes.iterator(); i.hasNext();) {
			t = i.next();
			if (doc.equals(t.getDocumento())) {
				i.remove();
				k++;
			}
		}
		if (k == 0) {
			System.out
					.println("O paciente com esse documento não consta no sistema");
		}
	}

	// Iterator i = Pacientes.iterator();
	// while (i.hasNext()) {
	// t = (Paciente) i.next();
	// String l = t.getDocumento();
	// if (doc.equals(l)) {
	// Pacientes.remove(t);
	// }
	// }
	/**
	 * Metodo que vai trazer a quantidade de pacientes por sexo na coleção
	 * */
	public void qtdPacientesPorSexo() {
		int contf = 0, contm = 0;
		Paciente t;
		Iterator i = Pacientes.iterator();
		while (i.hasNext()) {
			t = (Paciente) i.next();
			if (t.getSexo().equals("m")) {
				contm++;
			}
			if (t.getSexo().equals("f")) {
				contf++;
			}
		}
		System.out.println("Pacientes femininos: " + contf
				+ " Pacientes Masculinos: " + contm);

	}

	/**
	 * Metodo que vai trazer a lista de pacientes com endereços cadastrados na
	 * coleção
	 * */
	public void listagemComEndereços() {
		Paciente t;
		Iterator i = Pacientes.iterator();
		while (i.hasNext()) {
			t = (Paciente) i.next();
			if (t.getEndereço() != null) {
				System.out.println(t.toString());
			}
		}
	}

	/**
	 * Metodo que vai trazer os pacientes com mais de 60 anos na coleção
	 * */
	public void listagemDePacientesComMaisDe60() {
		Paciente t;
		int cont, y = 0;
		Iterator i = Pacientes.iterator();
		while (i.hasNext()) {
			t = (Paciente) i.next();
			cont = t.getIdade();
			y++;
			if (cont > 60) {
				System.out.println(t.toString());
			}
		}
		if (y == 0) {
			System.out.println("Não há pacientes acima de 60 anos");
		}
	}

}
