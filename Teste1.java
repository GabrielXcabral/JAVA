package ex;

public class Teste1 {
	public static void main(String[] args) {
		/*Retangulo r1 = new Retangulo (1, 2, 3);
		System.out.println(r1.calcularArea());
		
		Retangulo r2 = new Retangulo ();
		System.out.println(r2.calcularArea());*/
		
		/*Retangulo r = new Retangulo(1, 2, 3);
		System.out.println(r.calcularArea());
		
		r.enquadrar();
		System.out.println(r.calcularArea());*/
		
		
		
		/*Retangulo r;
		r = new Retangulo(1, 3, 3);
		System.out.println(r.ehQuadrado()); // true
		r = new Retangulo(2, 2, 7);
		System.out.println(r.ehQuadrado()); // false*/
		
		Retangulo r;
		r = new Retangulo(1, 3, 3);
		System.out.println(r.ehQuadrado()); // true
		r = new Retangulo(2, 2, 7);
		System.out.println(r.ehQuadrado()); // false
		System.out.print(r); //Printa o toString
	}

}
