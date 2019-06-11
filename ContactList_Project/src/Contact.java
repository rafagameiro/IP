/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 *Um contact com nome, email e telefone
 */
public class Contact {
	
	private String name;
	private String email;
	private int phone;
	
	public Contact(String name, int phone, String email){
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPhone(){
		return phone;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setPhone(int phone){
		this.phone = phone;
	}
	
	public void setEmail(String name){
		this.email = name;
	}

}
