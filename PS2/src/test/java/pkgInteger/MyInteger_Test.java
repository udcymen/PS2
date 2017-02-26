package pkgInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {

		MyInteger n1 = new MyInteger(12);
		MyInteger n2 = new MyInteger(11);
		MyInteger n3 = new MyInteger(11);
		
		assertEquals(12, n1.getiValue());
		assertEquals(true, n1.isEven());
		assertEquals(false, n2.isEven());
		assertEquals(false, n1.isOdd());
		assertEquals(true, n2.isOdd());
		assertEquals(false, n1.isPrime());
		assertEquals(true, n2.isPrime());
		
		assertEquals(true, MyInteger.isEven(12));
		assertEquals(false, MyInteger.isEven(11));
		assertEquals(false, MyInteger.isOdd(12));
		assertEquals(true, MyInteger.isOdd(11));
		assertEquals(false, MyInteger.isPrime(12));
		assertEquals(true, MyInteger.isPrime(11));
		
		assertEquals(true, MyInteger.isEven(n1));
		assertEquals(false, MyInteger.isEven(n2));
		assertEquals(true, MyInteger.isOdd(n2));
		assertEquals(false, MyInteger.isOdd(n1));
		assertEquals(false, MyInteger.isPrime(n1));
		assertEquals(true, MyInteger.isPrime(n2));
		
		assertEquals(true, n1.equals(12));
		assertEquals(false, n1.equals(11));
		assertEquals(true, n2.equals(n3));
		assertEquals(false, n2.equals(n1));
		
	}

}
