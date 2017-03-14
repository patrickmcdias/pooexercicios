package poopatrick;

import java.util.ArrayList;

public class MainArquivos {

	public static void main(String[] args) {

		String nome = "Aluno";
		String matri = "123";
		String nome2 = "Aluno2";
		String matri2 = "12345";
		ArrayList<Aluno> alu = new ArrayList<Aluno>();
		ColecaoAluno cowa = new ColecaoAluno();
		Aluno al = new Aluno(nome, matri);
		Aluno al2 = new Aluno(nome2, matri2);
		cowa.adicionarAluno(al);
		cowa.adicionarAluno(al2);

		cowa.salvarArquivo();

		alu = cowa.carregarArquivo();

		System.out.println(alu);

	}

}
