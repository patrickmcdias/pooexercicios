public class Endereço {
	/**
	 * Classe endereço
	 */
	private String CEP;
	private String rua;
	private String bairro;
	private String complemento;

	/**
	 * 
	 * Contrutores da classe endereço
	 */
	public Endereço(String cEP, String rua, String bairro, String complemento) {
		CEP = cEP;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
	}

	public Endereço(String rua, String complemento, String bairro) {
		this.rua = rua;
		this.complemento = complemento;
		this.bairro = bairro;
	}

	/**
	 * Metodos gets e sets da classe endereço
	 * 
	 */
	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * Metodos to string e equals classe endereço
	 */
	public String toString() {
		return "Endereço [CEP=" + CEP + ", rua=" + rua + ", bairro=" + bairro
				+ ", complemento=" + complemento + " ]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereço other = (Endereço) obj;
		if (CEP == null) {
			if (other.CEP != null)
				return false;
		} else if (!CEP.equals(other.CEP))
			return false;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}

}
