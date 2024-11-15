
public class Consumidor implements Runnable {
	private String name;
	
	public Consumidor(String name) {
		this.name = name;
	}//constructor

	
	public String getName() {
		return name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("iniciando consumidor"+ getName());
		int contador=0;
		while (contador <Almacen.max) {
			if (Almacen.lista.size()==0) {
				System.err.println("CONSUMIDOR "+ getName()+ "zZZ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//tryCatch
			}//if
			System.out.println(contador + " Consumiendo "+ getName()+
					" "+ Almacen.lista.remove(0));
			contador ++;
		}//while
		
		System.out.println("FINALIZANDO consumidor "+ getName());
		
	}//run
	

}//class
