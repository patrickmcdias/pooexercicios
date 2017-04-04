package collections;

import java.util.*;

public class ColecaoPessoa {

	private Map<String, Pessoa> ks;
	private HashSet<Pessoa> pessoas;

	public ColecaoPessoa() {
		pessoas = new HashSet<Pessoa>();
		ks = new HashMap<String, Pessoa>();
	}

	public void adicionarHashSet(Pessoa e) {
		pessoas.add(e);
	}

	public void adicionarHashMap(String n, Pessoa p) {
		ks.put(n, p);
	}

	public Pessoa pesquisarHashSet(String n) {
		Pessoa t = null;
		int k = 0;
		for (Pessoa te : pessoas) {
			if (te.getNome().equals(n)) {
				// System.out.println();
				t = te;
				k++;
			}
		}
		if (k == 0) {
			System.out.println("Não temos pessoa cadastrada com esse nome");
		}
		return t;
	}

	public void removerHashSet(String n) {
		int k = 0;
		Pessoa t;
		for (Iterator<Pessoa> i = pessoas.iterator(); i.hasNext();) {
			t = i.next();
			if (n.equals(t.getNome())) {
				i.remove();
				k++;
			}
		}
		if (k == 0) {
			System.out.println("Não temos pessoa cadastrada com esse nome");
		}
	}

	public void pesquisarHashMap(String l) {
		Pessoa e = ks.get(l);
		System.out.println(e);
	}

	public void removerHashMap(String r){
		try{
		ks.remove(r);
		}catch(NullPointerException e){
			System.out.println("Não existe essa pessoa cadastrada");
		}
	}
}
