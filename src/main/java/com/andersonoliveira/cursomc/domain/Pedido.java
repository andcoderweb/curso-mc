package com.andersonoliveira.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.andersonoliveira.cursomc.domain.Pagamento;
@Entity

public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L; 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private Date instante;
@OneToOne(cascade=CascadeType.ALL,mappedBy="pedido")
private Pagamento pagamento;
@ManyToOne
@JoinColumn(name="cliente_id")
private Cliente cliente;
@ManyToOne
@JoinColumn(name="endereco_de_entrega_id")
private Endereco enderecodeEntrega;
public Pedido() {}
public Pedido(Integer id, Date instante, Cliente cliente, Endereco enderecodeEntrega) {
	super();
	this.id = id;
	this.instante = instante;
	this.cliente = cliente;
	this.enderecodeEntrega = enderecodeEntrega;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Date getInstante() {
	return instante;
}
public void setInstante(Date instante) {
	this.instante = instante;
}
public Pagamento getPagamento() {
	return pagamento;
}
public void setPagamento(Pagamento pagamento) {
	this.pagamento = pagamento;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public Endereco getEnderecodeEntrega() {
	return enderecodeEntrega;
}
public void setEnderecodeEntrega(Endereco enderecodeEntrega) {
	this.enderecodeEntrega = enderecodeEntrega;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
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
	Pedido other = (Pedido) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

}
