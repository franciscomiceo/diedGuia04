package died.guia04.ejercicio05;

public class App {

	public static void main(String[] args) {
		Patron p=new Patron(-5,3,10);
		System.out.println("cantidad de cuadros que rodean al punto ("+p.x+","+p.y+") : "+p.solucionRecursiva(p.k,0,0));
	}
	
	
}
