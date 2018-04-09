package died.guia04;

public class Punto {
private float x,y;

//constructor
public Punto(float x,float y) {
	this.x=x;
	this.y=y;
}

public float getX() {
	return x;
}

public void setX(float nuevoValor) {
	x = nuevoValor;
}

public float getY() {
	return y;
}

public void setY(float nuevoValor) {
	y = nuevoValor;
}

public boolean equals(Object otroPunto) {
	if(otroPunto instanceof Punto && ((Punto)otroPunto).getX()==x && ((Punto)otroPunto).getY()==y)
		return true;
	else return false;
}

}
