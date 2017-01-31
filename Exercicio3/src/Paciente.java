import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Paciente {
	/**
	 * Classe Paciente
	 */
	
	private String documento;
	private String sexo;
	private String nome;
	private Endereço endereço;
	private LocalDate data;
	
	/**
	 * Contrutores da classe paciente
	 */
	public Paciente(String documento, String sexo, String nome,
			Endereço endereço,LocalDate data) {
	//	SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		this.documento = documento;
		this.sexo = sexo;
		this.nome = nome;
		this.endereço = endereço;
		this.data=data;
	}
	
	public Paciente(String documento, String sexo, String nome) {
		this.documento = documento;
		this.sexo = sexo;
		this.nome = nome;
	}
	/**
	 * Metodo que vai trazer a idade de um paciente a partir da data de seu nascimento
	 * 	 */
	public int getIdade() {
		// Data de hoje.
 		LocalDate agora=LocalDate.now();
 		int ano,mes,dia;
		// Data do nascimento.
 		LocalDate nascimento = this.data;
 		int anoNasc, mesNasc, diaNasc;
 		// Idade.
 		int idade = 0;
 		if(this.data != null){
 		//	nascimento.setTime(this.getNascimento());
 			ano = agora.getYear();
 	 		mes = agora.getMonthValue();
 	 		dia = agora.getDayOfMonth();
 	 		anoNasc = nascimento.getYear();
 	 		mesNasc = nascimento.getMonthValue();
 	 		diaNasc = nascimento.getDayOfMonth();
 	 		idade = ano - anoNasc;
 	 		// Calculando diferencas de mes e dia.
 	 		if(mes < mesNasc) {
 	 			idade--;
 	 		} else{
 	 		
 	 			if(dia < diaNasc) {
 	 				idade--;
 	 			}
 	 		}
 	 		
 	 			}
 	 		// Ultimo teste, idade "negativa".
 	 		if(idade < 0) {
 	 			idade = 0;
 	 		}
 	 		return idade;
	}
	/**
	 * Metodo que pega o nome do paciente e os formata deste modo: Medeiros, F P
	 */
	public void getIniciais(){
		String[] part;
		part=nome.split(" ");
		int d = part.length;
		d--;
		System.out.println(part[d]+", " + part[d-d].charAt(0)+". "+ part[d-d+1].charAt(0)+ " " +part[d-d+2].charAt(0)+" " +part[d-d+3].charAt(0)) ;
	}
	/**
	 * Metodos gets e sets da classe paciente
	 */
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereço getEndereço() {
		return endereço;
	}
	public void setEndereço(Endereço endereço) {
	//	String r,c,b;
	//	Scanner io = new Scanner(System.in);
	//	System.out.println("Digite o nome da RUA");
	//	r=io.nextLine();
	//	System.out.println("Digite o complemento");
	//	c=io.nextLine();
	//	System.out.println("Digite o nome do BAIRRO");
	//	b=io.nextLine();
	//	this.endereço = new Endereço(r,c,b);
		this.endereço = endereço;
		//io.close();
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	/**
	 * Metodos to string e equals da classe paciente
	 */
	public String toString() {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		if(endereço==null){
			return "Paciente [Documento=" + documento + ", Sexo=" + sexo + ", Nome=" + nome +" ]";
			
		}else{
		return "Paciente [Documento=" + documento + ", Sexo=" + sexo
				+ ", Nome=" + nome + ", " + endereço.toString() + ", Data de Nascimento="
				+ d.format(data) + "]";
		}
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (endereço == null) {
			if (other.endereço != null)
				return false;
		} else if (!endereço.equals(other.endereço))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
 

}
