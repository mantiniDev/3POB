package Projet02Colaboracao.src.Colabora;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int id;
	private double valorPedido;
	private double valorFrete;
	private String cepDestino;
	private Cliente cliente;
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	private List<ItensPedido> itens;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	public String getCepDestino() {
		return cepDestino;
	}
	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}
	
	public Pedido getPedidoCompleto(int idPed) {
		
		ItensPedido itens = new ItensPedido();
		this.itens = itens.getItensPedido(idPed);
		return this;
	}
}
