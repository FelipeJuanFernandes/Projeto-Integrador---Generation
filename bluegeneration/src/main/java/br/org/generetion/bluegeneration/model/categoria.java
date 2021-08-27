package br.org.generetion.bluegeneration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
@Table (name = "tb_categoria")
public class categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo tipo é obrigatorio")
	@Size (min = 5, max = 100, message = "o atribuo tipo deve ter no minimo 5 e no maximo 100 caracteres")
	private String tipo;
	
	@NotNull(message = "O atributo classificação é obrigatorio")
	@Size (min = 5, max = 100, message = "o atribuo classificação deve ter no minimo 5 e no maximo 100 caracteres")
	private String classificacao;
	
	@Pattern (regexp = "^(true|false)$", message = "O atributo ativo deve ser verdadeiro ou falso")
	private Boolean ativo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	

	
}
