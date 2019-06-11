/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 *conjunto de contactos indentificaveis por nome
 */
public class ContactList {
	
	public static final int MAX = 100;
	public static final int GROWTH = 2;
	
	private Contact[] contacts;
	private int counter;
	private int current;
	
	public ContactList(){
		contacts = new Contact[MAX];
		counter = 0;
		current = -1;
	}
	
	public ContactList(int capacity){
		contacts = new Contact[capacity];
		counter = 0;
		current = -1;
	}
	
	public boolean hasContact(String name){
		return indexOfContact(name)!= -1;
	}
	
	private int indexOfContact(String name) {
		int pos = -1;
		int i = 0;
		while(i < counter && pos == -1){
			if(name.equalsIgnoreCase(contacts[i].getName())){
				pos = i;
			}
			i++;
		}
		return pos;
	}
	
	public int getNumberOfContacts(){
		return counter;
	}

	//pre !hasContact(name)
	public void addContact(String name, String email, int phone){
		if(counter == contacts.length){
			resize();
		}else
		contacts[counter] = new Contact(name, phone, email);
	}

	private void resize() {
		Contact [] temp = new Contact [GROWTH * contacts.length];
		for(int i = 0; i < counter; i++ ){
			temp[i] = contacts[i];
		}
		contacts = temp;	
	}
	
	//pre: !hasContact(name)
	public int getPhone(String name){
	return contacts[indexOfContact(name)].getPhone();
	}
	
	//pre: !hasContact(name)
	public String getEmail(String name){
		return contacts[indexOfContact(name)].getEmail();
	}
	
	//pre: !hasContact(name)
	public void setEmail(String name, String email){
		contacts[indexOfContact(name)].setEmail(email);
	}
	
	//pre: !hasContact(name)
	public void setPhone(String name, int phone){
		contacts[indexOfContact(name)].setPhone(phone);
	}
	
	//pre: !hasContact(name)
	public void deleteContact(String name){
		contacts[indexOfContact(name)] = contacts[counter - 1];
		counter --;
	}
	
	public void initializeIterator(){
		current = 0;
	}
	
	public boolean hasNext(){
		return current < counter && current >= 0;
	}
	
	//pre: hasNext()
	public Contact next(){
		return contacts[current++];
	}

}
