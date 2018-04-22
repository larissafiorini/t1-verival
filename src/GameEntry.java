
public class GameEntry {

	// nome do jogador
	private String name;
	//lista de scores
	private int scores;

	/** Constructor to create a game entry */
	public GameEntry(String n, int s) {
		this.name = n;
		this.scores = s;
	}

	/** Retrieves the name field */
	public String getName() {
		return this.name;
	}

	/** Retrieves the score field */
	public int getScore() {
		return this.scores;
	}

	/**
	 * Returns a string representation of this entry Format: (<name>, <score>)
	 */
	@Override
	public String toString() {
		return "GameEntry [name=" + name + ", scores=" + scores + "]";
	}


	
}