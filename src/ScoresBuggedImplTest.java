import static org.junit.Assert.*;

import org.junit.Test;

public class ScoresBuggedImplTest {

	@Test
	public void testScoresBuggedImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		boolean actual=false;
		ScoresBuggedImpl sbi = new ScoresBuggedImpl();
		GameEntry e = new GameEntry("Marlon", 5);
		actual = sbi.add(e);
		assertTrue(actual);
		e = new GameEntry("Carlos",10);
		actual = sbi.add(e);
		assertTrue(actual);
		e = new GameEntry("Larissa",15);
		actual = sbi.add(e);
		assertTrue(actual);
		e = new GameEntry("Felipe",7);
		actual = sbi.add(e);
		assertTrue(actual);
		e = new GameEntry("Gabriel",9);
		actual = sbi.add(e);
		assertTrue(actual);
		e = new GameEntry("João",11);
		actual = sbi.add(e);
		assertTrue(actual);
		// scores <= 5
		e = new GameEntry("Maria",5);
		actual = sbi.add(e);
		assertFalse(actual);
		// scores > 5 && score > scores[5]

	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCapacity() {
		ScoresBuggedImpl sbi = new ScoresBuggedImpl();
		Integer actual = sbi.getCapacity();
		assertNotNull(actual);

		// scores ∊ Ν
		assertTrue(actual instanceof Integer);
		// scores <= 5 && scores >= 0
		Integer expected = 5;
		assertEquals(expected, actual);

		// scores < 0
		expected = 3;
		assertEquals(expected, actual);

	}

	@Test
	public void testGetNumElements() {
		fail("Not yet implemented");
	}

}
