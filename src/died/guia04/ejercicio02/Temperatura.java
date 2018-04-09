package died.guia04.ejercicio02;

public class Temperatura {

	private Double grados;
	private Escala escala;
	
	//constructores
	public Temperatura() {
		grados=0.0;
		escala=Escala.CELSIUS;
	}
	
	public Temperatura(Double g,Escala e){
		grados=g;
		escala=e;
	}
	
	//metodos
	public String toString() {
		return ""+grados+" "+(escala==Escala.CELSIUS?"C°":"F°");
	}
	
	public Double asCelsius() {
		if(escala==Escala.CELSIUS) return grados;
		return (grados-32)*5/9;}

	public Double asFahrenheit() {
		if(escala==Escala.FAHRENHEIT) return grados;
		return grados*9/5+32;}
	
	public void aumentar(Temperatura temperatura) {
		if(temperatura.grados>0.0)
		{
			switch(escala)
			{
			case FAHRENHEIT: switch(temperatura.escala)
							{
							case FAHRENHEIT: grados+=temperatura.grados;break;
							case CELSIUS: grados+=temperatura.asFahrenheit();break;
							}
							break;
			case CELSIUS: switch(temperatura.escala)
							{
							case FAHRENHEIT: grados+=temperatura.asCelsius();break;
							case CELSIUS: grados+=temperatura.grados;break;
							}
							break;
			}
		}
	}
	
	public void disminuir(Temperatura temperatura) {
		grados=(-grados);
		aumentar(temperatura);
		grados=(-grados);
	}
}
