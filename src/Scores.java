/** Interface of classes for storing high scores in an array in non-decreasing order.
* Format: [(<name>, <score>), (<name>, <score>) …]
* Example: [(John, 10), (Carol, 5), (Dan, 3)]
*/
public interface Scores {

	/** Returns a string representation of the high scores list */
	String toString();

	//O método “add” da interface “Scores” deve inserir os scores em ordem
	//A partir do	momento em que a lista estiver cheia sempre que um novo
	// “melhor score” tiver de ser
	//inserido o menor score armazenado terá de ser removido.
	//. Isso implica, também, que a	partir do momento em que a lista estiver
	//cheia apenas scores maiores que os já	armazenados poderão ser armazenados.
	/** Attempt to add a new score to the collection (if it is high enough) */
	boolean add(GameEntry e);

	/** Remove and return the high score at index i */
	GameEntry remove(int i) throws IndexOutOfBoundsException;

	/** Returns the capacity of the collection */
	int getCapacity();

	/** Returns the number of scores currently stored on the collection */
	int getNumElements();
}
