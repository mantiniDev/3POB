package Projet02Colaboracao.src.Colabora;

import java.util.ArrayList;
import java.util.List;

public class ItensPedido {
	private int id;
	private int idPedido;
	private int idProduto;
	private double valorUnitario;
	private int qtde;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	public List<ItensPedido> getItensPedido(int idPed) {
		List<ItensPedido> lstItens = new ArrayList<ItensPedido>();
		ItensPedido item = new ItensPedido();
		item.setId(1);
		item.setIdPedido(10);
		item.setIdProduto(5);
		item.setQtde(2);
		item.setValorUnitario(45.32);
		lstItens.add(item);
		
		item.setId(2);
		item.setIdPedido(10);
		item.setIdProduto(7);
		item.setQtde(3);
		item.setValorUnitario(77.62);
		lstItens.add(item);
		
		return lstItens;
	}
}
