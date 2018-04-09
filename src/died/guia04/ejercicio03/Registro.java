package died.guia04.ejercicio03;
import died.guia04.ejercicio02.Temperatura;

public class Registro {
	private String ciudad;
	private Temperatura[] historico;
	private int registradas;
	
	//constructores
	
	public Registro(String ciudad)
	{
		this.ciudad=ciudad;
		historico=new Temperatura[30];
		registradas=0;
	}
	
	public Registro() {this("-");}
	
	//metodos
	public String getCiudad() {return ciudad;}
	
	public void imprimir() 
	{
		System.out.println("TEMPERATURAS REGISTRADAS EN: "+ciudad);
		for(int i=0;i<registradas;i++)
			System.out.println(""+(i+1)+" "+historico[i].toString());
	}
	
	public void agregar(Temperatura t)
	{
		if(registradas<historico.length)
		{
			historico[registradas]=t;
			registradas++;
		}
	}
	
	public Double mediaAsCelsius() {
		Double media=0.0;
		for(int i=0;i<registradas;i++)
			media+=historico[i].asCelsius();
		return media/registradas;
	}
	
	public Double mediaAsFahrenheit() {
		Double media=0.0;
		for(int i=0;i<registradas;i++)
			media+=historico[i].asFahrenheit();
		return media/registradas;
	}
	
	public Temperatura maximo() {
		if(registradas==0) return null;
		return maximoRecursivo(0,historico[0]);
	}
	
	private Temperatura maximoRecursivo(int i,Temperatura max)
	{
		if(registradas==i+1) return max;
	    if(historico[i].asCelsius()>max.asCelsius())
				max=historico[i];
		return maximoRecursivo(i+1,max);
	}
}
