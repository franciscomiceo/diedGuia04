package died.guia04.ejercicio01;

public class Recta {
private Punto p0,p1;

//constructores
public Recta(Punto p1,Punto p2) {
	p0=p1;
	this.p1=p2;
}

public Recta() {
	p0=new Punto(0,0);
	p1=new Punto(1,1);
}

public float pendiente() {
	if(p1.getX()-p0.getX()==0) return 0;
	else return (p1.getY()-p0.getY())/(p1.getX()-p0.getX());
}

public boolean paralelas(Recta otraRecta) {
	return this.pendiente()==otraRecta.pendiente();
}

public boolean equal(Object otraRecta) {
	if(otraRecta instanceof Recta)
		{
		Recta r3=new Recta(p0,((Recta)otraRecta).p0);
		float m3=r3.pendiente();
		return m3==pendiente() && m3==((Recta)otraRecta).pendiente();
		}
	return false;
}
}
