package died.guia04.ejercicio06;

public class App {
	static Item[][] a= {{new Item(Color.BLUE),new Item(Color.BLUE),new Item(Color.BLUE),new Item(),new Item(),new Item()},
			{new Item(),new Item(Color.BLUE),new Item(),new Item(),new Item(),new Item(Color.RED)},
			{new Item(Color.BLUE),new Item(Color.BLUE),new Item(),new Item(Color.GREEN),new Item(),new Item()},
			{new Item(),new Item(),new Item(),new Item(Color.GREEN),new Item(),new Item()},
			{new Item(),new Item(),new Item(),new Item(Color.GREEN),new Item(Color.GREEN),new Item()},
			{new Item(Color.RED),new Item(),new Item(),new Item(),new Item(),new Item()}};
	
	static boolean[][] aux=new boolean[6][6];
	
	public static void main(String[] args) {
		
		int x=0,y=4;
		if(a[x][y].color!=Color.WHITE)
			{
			aux[x][y]=true;	
			System.out.println("tamanio del grupo: "+(1+tamanio(x,y)));
			}
		else
			System.out.println("tamanio del grupo: 0");
	}
	
	public static int tamanio(int x, int y) {
		int sum=0;
			//System.out.println(""+x+","+y);
			if(x>0&&a[x][y].color==a[x-1][y].color&&!aux[x-1][y])
			{
				aux[x-1][y]=true;
				sum+=(1+tamanio(x-1,y));
			}
			
			if(x<5&&a[x][y].color==a[x+1][y].color&&!aux[x+1][y])
			{
				aux[x+1][y]=true;
				sum+=(1+tamanio(x+1,y));
			}
			
			if(y>0&&a[x][y].color==a[x][y-1].color&&!aux[x][y-1])
			{
				aux[x][y-1]=true;
				sum+=(1+tamanio(x,y-1));
			}
			if(y<5&&a[x][y].color==a[x][y+1].color&&!aux[x][y+1])
			{
				aux[x][y+1]=true;
				sum+=(1+tamanio(x,y+1));
			}
		return sum;
	}
}
