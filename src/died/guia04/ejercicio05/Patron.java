package died.guia04.ejercicio05;

public class Patron {
	int x,y,k;

public Patron(int x,int y,int k)
	{
	this.x=x;
	this.y=y;
	this.k=k;
	}

public int solucionRecursiva(int lado,int xCentro,int yCentro)
{
int dentro=0;
if (x<=xCentro+lado/2&&x>=xCentro-lado/2&&
y<=yCentro+lado/2&&y>=yCentro-lado/2)
dentro=1;
if (lado<=2) //caso base
return dentro;
//caso recursivo
return dentro+
solucionRecursiva(lado/2,xCentro+lado/2,yCentro+lado/2)+
solucionRecursiva(lado/2,xCentro+lado/2,yCentro-lado/2)+
solucionRecursiva(lado/2,xCentro-lado/2,yCentro+lado/2)+
solucionRecursiva(lado/2,xCentro-lado/2,yCentro-lado/2);
}
}