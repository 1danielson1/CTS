package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.lang.model.type.NullType;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.exceptions.DivideByZeroException;
import ro.ase.cts.exceptions.MaximumNumberException;
import ro.ase.cts.models.IntegerDivision;

public class IntegerDivisionTests {
	
	
	@Test
	public void testConformancePrinciple()
	{
		IntegerDivision integerDivision=new IntegerDivision(6,5);
		try {
			assertEquals(1,integerDivision.computeDivisionOutput());
		} catch (MaximumNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderingPrinciple()
	{
		IntegerDivision integerDivision=new IntegerDivision(5,6);
		try {
			assertEquals(0, integerDivision.computeDivisionOutput());
		} catch (MaximumNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRangePrinciple()
	{
		IntegerDivision integerDivision=new IntegerDivision(Integer.MAX_VALUE+2,1);
		try {
			 integerDivision.computeDivisionOutput();
		} catch (MaximumNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(true);
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDivisionByZero()
	{
		IntegerDivision integerDivision=new IntegerDivision();
		
		try {
			integerDivision.computeDivisionOutput();
		} catch (MaximumNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testPerformanceExecution()
	{
		IntegerDivision integerDivision=new IntegerDivision(1500008765,235);
		long start = System.currentTimeMillis();
		try {
			integerDivision.computeDivisionOutput();
		} catch (MaximumNumberException | DivideByZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long sfarsit = System.currentTimeMillis();
		long durata = sfarsit - start;
		
		if(durata < 0.001)
			assertTrue(true);
		else
			fail("Executie prea lenta !");	
	}
	
	@Test
	public void testForNegativeResults()
	{
		IntegerDivision integerDivision=new IntegerDivision(-6,-6);
		try {
			assertEquals(1, integerDivision.computeDivisionOutput());
		} catch (MaximumNumberException | DivideByZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConstructorInverse()
	{
		int first=1,second=2;
		IntegerDivision integerDivision=new IntegerDivision(first,second);
		assertNotNull(integerDivision);
	}
}
