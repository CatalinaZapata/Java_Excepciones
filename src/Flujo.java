public class Flujo {
	public static void main(String[] args) {
		try {
			metodo1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fin de main");
	}
	
	private static void metodo1() throws MyException{
		System.out.println("Inicio de metodo1");
		metodo2();
		System.out.println("Fin de metodo1");
	}
	
	private static void metodo2() throws MyException{
		System.out.println("Inicio de metodo2");
		throw new MyException("Mi excepcion fue lanzada");
	}



}
