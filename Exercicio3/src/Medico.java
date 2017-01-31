public class Medico {
	/**
	 * Classe Medico
	 */
	private String nome;
	private String CRM;
	private String especialidade;

	/**
	 * Contrutores da classe Medico
	 */
	public Medico(String nome, String cRM, String especialidade) {
		this.nome = nome;
		CRM = cRM;
		this.especialidade = especialidade;
	}

	/**
	 * Metodos gets e sets da Classe metodo
	 * 
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	/**
	 * Metodo to string da classe Medico
	 */
	public String toString() {
		return "Medico [Nome=" + nome + ", CRM=" + CRM + ", Especialidade="
				+ especialidade + "]";
	}

}
