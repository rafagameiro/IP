/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	
	
	public static final String ADD_CONTACT = "AD";
	public static final String REMOVE_CONTACT = "RC";
	public static final String GET_PHONE = "GP";
	public static final String GET_MAIL = "GE";
	public static final String REFRESH_PHONE = "SP";
	public static final String REFRESH_MAIL = "SE";
	public static final String GET_CONTACT = "LC";
	public static final String LEAVE = "Q";
	
	//Contantes que definem comandos
	public static final String CONTACT_EXIST = "Contact already exists.";
	public static final String WRONG_COMM = "Invalid Command.";
	public static final String CANNOT_REMOVE = "Cannot remove contact.";
	public static final String NAME_NOT_EXIST = "Contact does not exist";
	public static final String CONTACT_ADDED = "Contact added.";
	public static final String GOODBYE = "Goodbye.";
	public static final String BOOK_EMPTY = "Contact book empty.";
	
	
	private static void processLeave() {
		// TODO Auto-generated method stub
		System.out.println(GOODBYE);
	}
	
	private static void ListAllContacts(ContactList ag) {
		// TODO Auto-generated method stub
		Contact c;
		if(ag.getNumberOfContacts() == 0){
			System.out.println(BOOK_EMPTY);
		}else{
			ag.initializeIterator();
			while(ag.hasNext()){
				c = ag.next();
				System.out.println(c.getName() + ";" + c.getEmail() + ";" + c.getPhone());
			}			
		}
	}
	
	private static void setEMail(ContactList ag, Scanner in) {
		// TODO Auto-generated method stub
		String name;
		String email;
		name = in.nextLine();
		email = in.nextLine();
		if(ag.hasContact(name)){
			System.out.println(NAME_NOT_EXIST);
		}else
			ag.setEmail(name, email);
	}
	
	private static void getPhone(ContactList ag,Scanner in) {
		// TODO Auto-generated method stub
		String name;
		name = in.nextLine();
		if(ag.hasContact(name)){
			System.out.println(NAME_NOT_EXIST);
		}else
			ag.getPhone(name);
	}
	
	private static void getMail(ContactList ag,Scanner in) {
		// TODO Auto-generated method stub
		String name;
		name = in.nextLine();
		if(ag.hasContact(name)){
			System.out.println(NAME_NOT_EXIST);
		}else
			ag.getEmail(name);
	}
	
	private static void setPhone(ContactList ag, Scanner in) {
		// TODO Auto-generated method stub
		String name;
		int phone;
		name = in.nextLine();
		phone = in.nextInt();
		if(ag.hasContact(name)){
			System.out.println(NAME_NOT_EXIST);
		}else
			ag.setPhone(name, phone);
	}

	private static void deleteContact(ContactList ag, Scanner in) {
		// TODO Auto-generated method stub
		String name;
		name = in.nextLine();
		if(ag.hasContact(name)){
			System.out.println(NAME_NOT_EXIST);
		}else
			ag.deleteContact(name);
	}
	
	private static void addContact(ContactList ag, Scanner in) {
		// TODO Auto-generated method stub
		String name, email;
		int phone;
		name = in.nextLine();
		phone = in.nextInt();
		in.nextLine();
		email = in.nextLine();
		if(ag.hasContact(name)){
			System.out.println(CONTACT_EXIST);
		}else{
			ag.addContact(name, email, phone);
		System.out.println(CONTACT_ADDED);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ContactList ag = new ContactList();
		String option = "";
		
		while(!option.equalsIgnoreCase(LEAVE)){
			option = in.next().toUpperCase();
			
			switch(option){
			case ADD_CONTACT:addContact(ag,in);break;
			case REMOVE_CONTACT:deleteContact(ag,in);break;
			case GET_PHONE:getPhone(ag,in);break;
			case GET_MAIL:getMail(ag,in);break;
			case REFRESH_PHONE:setPhone(ag,in);break;
			case REFRESH_MAIL:setEMail(ag,in);break;
			case GET_CONTACT:ListAllContacts(ag);break;
			case LEAVE:processLeave();break;
			}
		}
		in.close();
	}

}
