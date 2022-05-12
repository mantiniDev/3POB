package helloworld.src.helloworld;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12;
		String a1 = "Hello ";
		String a2 = "Kintinool";
		System.out.println(a1 + a2);
		
		System.out.println(x);
		DisplayNum disp = new DisplayNum();
		disp.imprimeNum();
		disp.imprimeString("ola mundo");
		disp.imprimeDouble(4.5678);
		disp.imprimeDivisaoInt(8, 2);
		disp.imprimeDivisaoInt(7, 3);
	}

}
