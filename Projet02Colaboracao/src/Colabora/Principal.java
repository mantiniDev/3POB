package Projet02Colaboracao.src.Colabora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valorPed = 23.22;
		String cep = "20037123";
		
		Frete frete = new Frete();
		double valorFrete = frete.calculaFrete(cep);
		
		Cliente cliente = new Cliente(67, "Japeri");
		
		Pedido ped = new Pedido();
		ped.setId(1);
		ped.setValorPedido(valorPed);
		ped.setValorFrete(frete.calculaFrete(cep));
		ped.setCepDestino(cep);
		ped.setCliente(cliente);
		
		Cliente cli = ped.getCliente();
		
		System.out.println(ped.getId());
		System.out.println(ped.getValorPedido());
		System.out.println(ped.getValorFrete());
		System.out.println(ped.getCepDestino());
		System.out.println(cli.getId());
		System.out.println(cli.getNome());
		
	}

}
