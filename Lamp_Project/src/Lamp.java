/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Lamp {
	// coisas necessarias para a classe: estado, construtor e interface
	
	private boolean lampisOn;
	// chamam-se variaveis de instancia
	
	 public Lamp(){
		 // construtor da classe
		 // quando criado neste metodo todas as coisas criadas aqui são para todos os metodos
		 
		 lampisOn = false;
		
	}
	
	public void on(){
		// A estas public void chamam-se methods
		lampisOn = true;
	}
	
	public void off(){
		lampisOn = false;
	}
	
	public boolean isOn(){
		return lampisOn;
		}

}
