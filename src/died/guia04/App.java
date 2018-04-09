package died.guia04;

public class App {

	public static void main(String[] args) {
		Punto p1=new Punto(1,1);
		Punto p2=new Punto(2,2);
		Recta r1=new Recta(p1,p2);
		System.out.println("pendiente de la recta R1= "+r1.pendiente());
		Punto p3=new Punto(3,3);
		Recta r2=new Recta(p2,p3);
		System.out.println("¿R1 y R2 representan la misma recta?= "+r1.equal(r2));
	}
}
