/**
 * 
 */

/**
 * @author Pedro
 *
 */
public class Players {
	// nome, nivel, ajudas
	private String name;
	private int lvl;
	private int help;
	private float prizeWon;
	private int wonLvl;

	public Players(String newName){
		name = newName;
		lvl = 1;
		help = 0;
		prizeWon = 0;
		wonLvl = 0;
	}

	public void nextLvl(){
		prizeWon = levelPrize(lvl);
		lvl++;
	}

	public void needHelp(){
		help++;
	}

	public int getHelpsUsed(){
		return help;
	}
	
	public void newHelps(){
		help = 0;
	}

	public String getName(){
		return name;
	}
	public int getLvl(){
		return lvl;
	}
	public void resetLvl(){
		lvl = 1;
	}
	public void resetHelps(){
		prizeWon = levelPrize(lvl);
	}
	
	public float getScore(){
		return prizeWon;
	}

	public void implementHelpPenalti(){
		prizeWon = (prizeWon * (1-  (0.25f * help)));
	}

	public int getLevelPrize(){
		return levelPrize(lvl);
	}
	public void resetPrize(){
		prizeWon = 0;
	}
	private int levelPrize(int lvl){
		int prize = 0;
		switch(lvl){
		case 1: prize = 50; break;
		case 2: prize = 100; break;
		case 3: prize = 200; break;
		case 4: prize = 300; break;
		case 5: prize = 500; break;
		case 6: prize = 1000; break;
		case 7: prize = 2000; break;
		case 8: prize = 3000; break;
		case 9: prize = 5000; break;
		case 10: prize = 10000; break;
		case 11: prize = 20000; break;
		case 12: prize = 50000; break;
		default: prize = 0;
		}
		return prize;
	}
}
