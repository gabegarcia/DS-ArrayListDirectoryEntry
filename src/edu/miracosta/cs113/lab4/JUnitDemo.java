package edu.miracosta.cs113.lab4;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.String;
import java.util.*;

class JUnitDemo {
	static private Directory directory = new Directory();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		String s = directory.addOrChangeEntry("AB", "000-000-0000");
		s = directory.addOrChangeEntry("BB", "000-000-0001");
		s = directory.addOrChangeEntry("CB", "000-000-0001");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddOrChangeEntry() {
		assertEquals(directory.addOrChangeEntry("DA",  "000-000-0004"), null); // Checking Add
		assertEquals(directory.addOrChangeEntry("AB",  "000-000-0004"), "000-000-0000"); // Checking Change
		
	//	fail("Not yet implemented");
	}
	
	@Test
	void testRemoveEntry() {
		assertEquals(directory.removeEntry("TA"), null); //Checking when Entry does not exist
		assertNotNull("The aName was not in the list", directory.removeEntry("CB")); //Checking when Entry does exist
		
		
	}

}
