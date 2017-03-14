package poopatrick;

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

	public int salvarArquivo() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("aluno.txt"));
			out.writeObject(alunos);
			out.close();
			return 0;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}

	}

	public ArrayList <Aluno> carregarArquivo() {
		ArrayList a = new ArrayList();
		try {
			FileInputStream in = new FileInputStream("aluno.txt");
			ObjectInputStream objIn = new ObjectInputStream(in);
		
			 a = (ArrayList) objIn.readObject();
				objIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return a;
	}

}