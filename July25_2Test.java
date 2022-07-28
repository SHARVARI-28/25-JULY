import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class July25_2Test {
	July25_2 e = new July25_2();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Yudhistir");
		list.add("Bheem");
		list.add("Arjun");
		list.add("Nakul");
		list.add("Sahadev");
	}
	
	
	@Before
	void before() {
		System.out.println("before");
	}

	@After
	void after() {
		System.out.println("after");
	}

	@Test
	void testFindName() {
		System.out.println(list);
		assertEquals("Result", "FOUND", e.findName(list, "Arjun"));
		System.out.println("Tested and Found");
	}

}