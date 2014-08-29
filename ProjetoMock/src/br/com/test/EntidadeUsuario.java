package br.com.test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EntidadeUsuario implements Serializable {

	private static final long serialVersionUID = 261314164735863014L;
	public EntidadeUsuario entidadeUsuario;
	public Long id;
	public Date dataNascimento;
	public String login;
	public BigDecimal valor;
	public Boolean isVerdade;
	public Integer quantidade;
	public Character caracterEspecial;

	public EntidadeUsuario getEntidadeUsuario() {
		return entidadeUsuario;
	}

	public void setEntidadeUsuario(EntidadeUsuario entidadeUsuario) {
		this.entidadeUsuario = entidadeUsuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Boolean getIsVerdade() {
		return isVerdade;
	}

	public void setIsVerdade(Boolean isVerdade) {
		this.isVerdade = isVerdade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result
				+ ((entidadeUsuario == null) ? 0 : entidadeUsuario.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((isVerdade == null) ? 0 : isVerdade.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((quantidade == null) ? 0 : quantidade.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntidadeUsuario other = (EntidadeUsuario) obj;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (entidadeUsuario == null) {
			if (other.entidadeUsuario != null)
				return false;
		} else if (!entidadeUsuario.equals(other.entidadeUsuario))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isVerdade == null) {
			if (other.isVerdade != null)
				return false;
		} else if (!isVerdade.equals(other.isVerdade))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

	public EntidadeUsuario(EntidadeUsuario entidadeUsuario, Long id,
			Date dataNascimento, String login, BigDecimal valor,
			Boolean isVerdade, Integer quantidade) {
		super();
		this.entidadeUsuario = entidadeUsuario;
		this.id = id;
		this.dataNascimento = dataNascimento;
		this.login = login;
		this.valor = valor;
		this.isVerdade = isVerdade;
		this.quantidade = quantidade;
	}

	public EntidadeUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Character getCaracterEspecial() {
		return caracterEspecial;
	}

	public void setCaracterEspecial(Character caracterEspecial) {
		this.caracterEspecial = caracterEspecial;
	}

	public EntidadeUsuario(Character caracterEspecial) {
		super();
		this.caracterEspecial = caracterEspecial;
	}
}