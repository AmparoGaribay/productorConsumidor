import java.sql.SQLOutput;

public class Productor extends Thread {
	
	public Productor(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
	}
	@Override
	public void run() {
		System.out.println("INICIO del productor "+ getName());
		int contador=0;
			while(contador <Almacen.max) {
				Integer numero= Integer.valueOf((int) (Math.random()*500));
				Almacen.lista.add(numero);
				System.out.println(contador + " Productor: "+ this .getName()+ " Numero: "+ numero +" Size: "+ Almacen.lista.size());
				try {
					Thread.sleep(numero);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
				contador ++;
			}//wilw
		System.out.println("************ *** FIN  del productor "+ getName());
	}//class
}//class
