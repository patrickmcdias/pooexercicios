import java.io.*;
import java.util.ArrayList;

public class ColecaoAluno {

	private ArrayList<Aluno> alunos;

	public ColecaoAluno() {
		alunos = new ArrayList<Aluno>();
	}

	public void adicionarAluno(Aluno al) {
		alunos.add(al);
	}

	public void salvarArquivo(ArrayList<Aluno> alunos) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
				"Aluno"));
		out.writeObject(alunos);
		
	}

	public void carregarArquivo() throws FileNotFoundException, IOException,
			ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"Aluno"));

		ArrayList al = (ArrayList) in.readObject();
	}

}
