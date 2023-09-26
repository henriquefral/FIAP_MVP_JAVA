package br.com.fiap.MVP3.model;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;

@Entity
@Validated
@SequenceGenerator(name = "formulario", sequenceName = "SQ_FORMULARIO", allocationSize = 1)
public class Formulario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "formulario")
	private int codigo;
	
	@Nonnull
	@NotBlank(message = "É preciso digitar documento do formulário")
	private String documento;
	
	@ManyToMany
	private List<PilarESG> pilaresESG;
	
	@OneToMany
	private List<Pergunta> perguntas;
	
	@ManyToOne
	private Usuario usuario;
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public void setPergunta(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}
	
	public List<Pergunta> getPergunta() {
		return perguntas;
	}
	
	public void setPilarESG(List<PilarESG> pilaresESG) {
		this.pilaresESG = pilaresESG;
	}
	
	public List<PilarESG> getPilarESG() {
		return pilaresESG;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
}

