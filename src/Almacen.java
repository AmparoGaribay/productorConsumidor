
import java.util.ArrayList;

public class Almacen {
		
	public final static ArrayList<Integer> lista= new ArrayList<Integer>();
	public final static int max =100;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productor productor1 = new Productor("Productor 1 ");
		Consumidor cons1= new Consumidor("Consumidor 1 ");
		
		Thread t1 = new Thread(cons1);
		productor1.start();

		t1.start();

	}//main

}//clase
