import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScoresBuggedImplTest {

	private ScoresBuggedImpl scoreBugged;
	private GameEntry gameEntry;

	@Before 
	public void initialize() {
		scoreBugged = new ScoresBuggedImpl();
		gameEntry = null;

		// Inicializa com 4
		scoreBugged.add(new GameEntry("Marlon", 5));
		scoreBugged.add(new GameEntry("Carlos", 10));
		scoreBugged.add(new GameEntry("Larissa", 15));
		scoreBugged.add(new GameEntry("Felipe", 7));

	}
	
	@Test
	public void testScoresBuggedImpl() {
		ScoresBuggedImpl scoreBuggedImpl = new ScoresBuggedImpl();
		assertNotNull("Objeto não deve ser nulo: ", scoreBuggedImpl);
		assertNotSame("Objetos não devem ser iguais: ", scoreBugged, scoreBuggedImpl);
	}

	@Test
	public void testAdd() {
		boolean success = false;

		// Inicializou com 4, add mais 1
		gameEntry = new GameEntry("Gabriel",9);
		success = scoreBugged.add(gameEntry);
		assertTrue(success);

		// Adiciona o maior scores
		gameEntry = new GameEntry("Maria",20);
		success = scoreBugged.add(gameEntry);
		assertTrue(success);

		// Não adiciona o menor scores
		gameEntry = new GameEntry("André Balada",2);
		success = scoreBugged.add(gameEntry);
		assertFalse(success);
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCapacity() {
		int capacity = scoreBugged.getCapacity();

		assertNotNull("Capacidade da lista não deve ser nulo: ", capacity);

		int expected = 5;
		assertEquals("Capacidade da lista deve ser 5: ", expected, capacity);

		int unexpected = 4;
		assertNotEquals("Capacidade da lista deve ser diferente de 4: ", unexpected, capacity);
	}

	@Test
	public void testGetNumElements() {
		int elements = scoreBugged.getNumElements();
		int expected;
		
		expected = 4;
		assertEquals("Deve ter 4 elementos ja inicializados: ", expected, elements);
		
		// Adiciona mais um
		scoreBugged.add(new GameEntry("Marcelo Grohe",20));
		expected = 5;
		elements = scoreBugged.getNumElements();
		assertEquals("Deve ter 5 elementos: ", expected, elements);

		// Adiciona mais um
		scoreBugged.add(new GameEntry("Jael",9));
		expected = 5;
		elements = scoreBugged.getNumElements();
		assertEquals("Após adicionar outro, deve continuar com 5 elementos: ", expected, elements);
	}

}
