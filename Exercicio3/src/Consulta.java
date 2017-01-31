import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 
 * @author Patrick Muller
 * 
 */
public class Consulta {
	/**
	 * Esta é a classe consulta
	 */
	private Paciente paciente;
	private Medico medico;
	private LocalDate data;
	private LocalTime hora;

	public Consulta(Paciente paciente, Medico medico, LocalDate data,
			LocalTime hora) {
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
		this.hora = hora;
	}

	/**
	 * Os dois contrutores da classe consulta
	 * 
	 */
	public Consulta(Paciente paciente, LocalDate daho, LocalTime hora) {
		this.paciente = paciente;
		this.data = daho;
		this.hora = hora;
	}

	/**
	 * Metodos gets e sets da classe consulta
	 * 
	 * */
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate daho) {
		this.data = daho;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	/**
	 * Metodos To string e equals da classe consulta
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (medico == null) {
			if (other.medico != null)
				return false;
		} else if (!medico.equals(other.medico))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		return true;
	}

	public String toString() {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
		return "Consulta [Paciente=" + paciente.toString() + ", Medico="
				+ medico.toString() + ", Data e Hora da Consulta="
				+ d.format(data) + "  " + f.format(hora) + "]";
	}
}
