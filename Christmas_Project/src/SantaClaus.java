/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class SantaClaus {
	
	public static final int MAX = 100;
	public static final int GROWTH = 2;
		
	private Present[] presentes;
	private int counter;
	private float max;
	private float currentPrice;
	private int current;
	
	/**Cria um novo PaiNatal.
	* @param � maximo � limite m�ximo para os gastos
	* @pre maximo >= 0.0f
	*/
	public SantaClaus (float maximo){
		presentes = new Present[MAX];
		max = maximo;
		counter = 0;
		currentPrice = maximo;
		current = -1;
	}
	
	/**Tenta dar um presente de Natal. Apenas deve ser dado um presente se o limite de gastos
	* nos presentes n�o for ultrapassado. Se n�o conseguir dar o presente, n�o faz nada.
	* @param descricao � Descri��o do presente
	* @param nome � Nome da pessoa que recebe o presente
	* @param quantidade � Quantidade de unidades do presente
	* @param precoUnitario � Pre�o de cada uma das unidades do presente
	* @pre quantidade > 0 && precoUnitario >= 0.0f
	*/
	public void gives(String descricao, String nome, int quantidade, float precoUnitario){
		if(currentPrice == 0){
		}else{
			if(counter < presentes.length){
				presentes[counter] = new Present(nome, descricao, quantidade);
			counter ++;
			currentPrice = currentPrice - precoUnitario;
			}else if(counter == presentes.length)
				resize();
		}
	}
	
	private void resize(){
		Present [] temp = new Present [GROWTH * presentes.length];

		for(int i = 0; i < counter; i++ ){
			temp[i] = presentes[i];
		}
		presentes = temp;
	}
	
	/**Devolve o n�mero de ofertas registadas na colec��o de presentes. Note que isto
	* corresponde ao n�mero de elementos da colec��o de presentes, e n�o ao n�mero de
	* unidades oferecidas. Por exemplo, 2 sapatos oferecidos contam como uma oferta.
	* @return � o n�mero de ofertas registadas
	*/
	public int CountGives(){
		return counter;
	}
	
	/**Devolve os gastos totais em presentes.
	* @return � o valor total gasto em presentes.
	*/
	public float getTotal(){
		return max - currentPrice;
	}
	
	/**Devolve o presente mais caro de todos. Em caso de empate, devolve um qualquer de entre
	* os empatados.
	* @return � o presente mais caro da colec��o.
	* @pre � countGives()>0
	*/
	public Present mostExpensive(){
		int expensive = 0;
		for(int i = 0; i <= counter; i++){
			if(expensive < presentes[i].getTotal())
			expensive = i;
		}
		return presentes[expensive];
	}
	
	/**Remove todos os presente a dar a uma pessoa da lista, dado o seu nome. Se n�o
	* existirem presentes para essa pessoa, o m�todo n�o faz nada. Esta opera��o deve manter
	* a ordem dos restantes presentes.
	* @param nome � nome da pessoa que fica sem presentes.
	*/
	public void Punish(String nome){
		for(int i = 0; i <= counter; i++){
			if(presentes[i].getName().equals(nome)){
				removePresent(i);
			}
		}
	}
	
	private int removePresent(int pos){
		for(int i = pos; i <= counter -1; i++){
			presentes[pos] = presentes[pos+1];
			counter --;
		}
		return pos;
	}
	
	/**Inicializa o iterador de presentes.
	*/
	public void inicializaIterador(){
		current = 0;
	}
	
	/**Testa se h� mais elementos a visitar com o iterador.
	* @return true, se houver mais elementos a visitar, ou false, caso contr�rio.
	*/
	public boolean hasNext(){
		return current < counter && current >= 0;
	}
	
	/**Devolve o pr�ximo presente da colec��o visitada com o iterador.
	* @return o pr�ximo presente da colec��o visitada com o iterador.
	* @pre existeProximo()
	*/
	public Present next(){
		return presentes[counter++];
	}

}
