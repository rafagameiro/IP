/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Present {
	
	private float price;
	private String name;
	private int amount;
	private String description;
	
	/**Cria um novo presente com os argumentos:
 	* @param descricao – Descrição do presente
	* @param nome – Nome da pessoa que recebe o presente
	* @param quantidade – Quantidade de unidades do presente
	* @param precoUnitario – Preço de cada uma das unidades do presente
	* @pre quantidade > 0 && precoUnitario >= 0.0f
	*/
	public Present(String nome, String descricao, int quantidade){
		name = nome;
		description = descricao;
		amount = quantidade;
		price = 0.0f;
	}
	
	/**Devolve a descrição do presente
	 * @return – A descrição do presente
	 */
	public String getDescription(){
		return description;
	}
	
	/**Devolve o nome da pessoa que recebe o presente
	* @return – O nome da pessoa que recebe o presente
	*/	
	public String getName(){
		return name;
	}
	
	/**Devolve o valor total do presente
	 * @return – O valor total do presente
	 */
	public float getTotal(){
		return price * amount;
	}
	
	/**Acrescenta unidades ao presente.
	 * @param n – número de unidades a acrescentar ao presente
	 * @pre n > 0
	 */
	public void addAmount(int n){
		amount = amount + n;
	}
	
	/**Compara o objecto this com o argumento outro
	 * @return true se todos os membros de this forem iguais aos do outro
	 */
	public boolean equals(Present outro){
		return outro.name.equals(name) && outro.description.equals(description) && outro.amount == amount;
	}
}