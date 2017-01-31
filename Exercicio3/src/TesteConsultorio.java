import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/**
 * 
 * @author Patrick Muller
 *  
 *  
 */

public class TesteConsultorio {

	/**
	 * Este é o método main do programa 
	 * na qual contém o menu com as chamadas 
	 * para todas as funções das coleções
	 * 
	 */
	public static void main(String[] args) {
		coleçãoPacientes cowp = new coleçãoPacientes();
		ColeçaoMedicos cowm = new ColeçaoMedicos();
		ColeçaoConsultas cowc = new ColeçaoConsultas();
		int op = 100, y, m, a;
		LocalDate data, datac;
		String n, s, d, r, c, b;
		Scanner io = new Scanner(System.in);
		do {
			System.out.println("---------------Menu--------------");
			System.out.println("---------Parte paciente----------");
			System.out.println("1 - Adicionar Paciente");
			System.out.println("2 - Pesquisar Paciente pelo Documento");
			System.out.println("3 - Remover Paciente pelo Documento");
			System.out.println("4 - Quantidade de Pacientes por sexo");
			System.out.println("5 - Listar Pacientes com endereço");
			System.out.println("6 - Listar Pacientes com mais de 60 anos");
			System.out.println("-------------Parte Medico-----------------");
			System.out.println("7  - Adicionar Medico");
			System.out.println("8  - Pesquisar Médico pelo CRM");
			System.out.println("9  - Pesquisar Médico por parte do nome");
			System.out.println("--------------Parte Consulta-----------------");
			System.out.println("10 - Adicionar Consulta");
			System.out.println("11 - Quantidade de consultas em uma data");
			System.out.println("12 - Listar consultas de uma data");
			System.out.println("13 - Quantidade de consultas de um médico");
			System.out.println("14 - Listar consultas de um paciente");
			System.out.println("Digite a opção desejada:");
			op = io.nextInt();
			io.nextLine();

			switch (op) {
			case 1:
				Paciente p;
				System.out.println("Digite o nome do paciente: ");
				n = io.nextLine();
				System.out.println("Digite o sexo do paciente(m/f)");
				s = io.nextLine().toLowerCase();
				// while (!s.equals("f") || !s.equals("m")) {
				// System.out.println("Digite o sexo do paciente(m/f)");
				// s = io.nextLine().toLowerCase();
				// }
				System.out.println("Digite o documento do paciente");
				d = io.nextLine();
				String q;
				System.out
						.println("Deseja cadastrar endereço do Paciente: [s/n]");
				q = io.nextLine().toLowerCase();
				if (q.equals("s")) {
					System.out.println("Digite a rua do endereço do paciente");
					r = io.nextLine();
					System.out
							.println("Digite o bairro o endereço do paciente");
					b = io.nextLine();
					System.out
							.println("Digite o complemento do endereço do paciente");
					c = io.nextLine();
					Endereço e = new Endereço(r, c, b);
					System.out.println("Digite o dia do Nascimento");
					y = io.nextInt();
					System.out.println("Digite o mês do Nascimento");
					m = io.nextInt();
					System.out.println("Digite o ano do Nascimento");
					a = io.nextInt();
					data = LocalDate.of(a, m, y);
					p = new Paciente(d, s, n, e, data);
					cowp.adicionarPaciente(p);
				} else {
					p = new Paciente(d, s, n);
					cowp.adicionarPaciente(p);
				}
				;
				break;
			case 2:
				String u;
				System.out
						.println("Digite o numero do documento que deseja pesquisar: ");
				u = io.nextLine();
				cowp.pesquisaPeloDocumento(u);
				break;
			case 3:
				String t;
				System.out
						.println("Digite o numero do documento que deseja remover: ");
				t = io.nextLine();
				cowp.removePeloDocumento(t);
				;
				break;
			case 4:
				cowp.qtdPacientesPorSexo();
				;
				break;
			case 5:
				cowp.listagemComEndereços();
				;
				break;
			case 6:
				cowp.listagemDePacientesComMaisDe60();
				;
				break;
			case 7:
				Medico me;
				String z,
				x,
				w;
				System.out.println("Digite o nome do médico:");
				z = io.nextLine();
				System.out.println("Digite o CRM do médico:");
				x = io.nextLine();
				System.out.println("Digite a especialidade do médico:");
				w = io.nextLine();
				me = new Medico(z, x, w);
				cowm.adicionarMedico(me);
				;
				break;
			case 8:
				String l;
				System.out.println("Digite o CRM que deseja pesquisar:");
				l = io.nextLine();
				cowm.pesquisaPeloCRM(l);
				;
				break;
			case 9:
				String te;
				System.out
						.println("Digite a parte do nome que deseja pesquisar:");
				te = io.nextLine();
				cowm.pesquisaPorParteDoNome(te);
				;
				break;
			case 10:
				LocalTime yui;
				Consulta co;
				Paciente jo;
				Medico ju;
				String tu,
				ti;
				int yi,
				mi,
				aa,
				mm,
				mk;
				System.out
						.println("Digite o documento do Paciente para consulta:");
				tu = io.nextLine();
				jo = cowp.pesquisaPeloDocumento(tu);
				System.out.println("Digite o CRM do médico para consulta:");
				ti = io.nextLine();
				ju = cowm.pesquisaPeloCRM(ti);
				System.out.println("Digite o dia da consulta");
				yi = io.nextInt();
				System.out.println("Digite o mês da consulta");
				mi = io.nextInt();
				System.out.println("Digite o ano da consulta");
				aa = io.nextInt();
				datac = LocalDate.of(aa, mi, yi);
				System.out.println("Digite a hora da consulta");
				mk = io.nextInt();
				System.out.println("Digite os minutos da hora da consulta");
				mm = io.nextInt();
				yui = LocalTime.of(mk, mm);
				co = new Consulta(jo, ju, datac, yui);
				cowc.adicionarConsulta(co);
				break;
			case 11:
				cowc.qntdDeconsultasData();
				break;
			case 12:
				cowc.listagemConsultas();
				break;
			case 13:
				cowc.qntdDeconsultasMedico();
				break;
			case 14:
				cowc.lisaconsultasPaciente();
				break;
				
			}
		} while (op != 0);
		io.close();
	}
}
