public class Gerente_4 extends Funcionario_1 implements Autenticable_14 {	
	//Sobre-escritura de método
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
}
