//package mundo;

public class CalGeo{
		

public static void main (String args[]){
	Cuadrado cuadrado = new Cuadrado(4);
	Rectangulo rectangulo = new Rectangulo(5,7);
	Triangulo triangulo = new Triangulo(2, 4, 5);
	Circulo circulo = new Circulo (5);
	Esfera esfera = new Esfera (5);
	System.out.println(cuadrado);
	System.out.println(rectangulo);
	System.out.println(triangulo);
	System.out.println(triangulo.area());
	System.out.println(triangulo.perimetro());
	System.out.println(circulo);
	System.out.println(circulo.circunferencia());
	System.out.println(circulo.area());
	System.out.println(esfera);
	System.out.println(esfera.superfice());
	System.out.println(esfera.volumen());
	}
}