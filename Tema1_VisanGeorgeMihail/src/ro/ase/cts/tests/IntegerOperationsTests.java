package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import ro.ase.cts.exceptions.InvalidDivisionException;
import ro.ase.cts.exceptions.InvalidNegativePowerOperand;
import ro.ase.cts.exceptions.InvalidSubstractionException;
import ro.ase.cts.model.IntegerOperations;
import ro.ase.cts.model.OperationTypes;

public class IntegerOperationsTests {
	
	@Test
	public void testAdditionFor2Variables()
	{
		IntegerOperations op=new IntegerOperations(15,15,OperationTypes.ADDITION);
		try {
			assertEquals(30,op.computeOperationOutput());
		} catch (InvalidDivisionException e) {
			e.getMessage();
		} catch (InvalidSubstractionException e) {
			e.getMessage();
		} catch (InvalidNegativePowerOperand e) {
			e.getMessage();
		}
	}
	
	@Test
	public void testSubstractionFor2variables()
	{
		IntegerOperations op=new IntegerOperations(55,25,OperationTypes.SUBSTRACTION);
		try {
			assertEquals(30,op.computeOperationOutput());
		} catch (InvalidDivisionException e) {
			e.getMessage();
		} catch (InvalidSubstractionException e) {
			e.getMessage();
		} catch (InvalidNegativePowerOperand e) {
			e.getMessage();
		}
	}
	
	@Test
	public void testDivisionFor2Variables()
	{
		IntegerOperations op=new IntegerOperations(75,25,OperationTypes.DIVISION);
		try {
			assertEquals(3,op.computeOperationOutput());
		} catch (InvalidDivisionException e) {
			e.getMessage();
		} catch (InvalidSubstractionException e) {
			e.getMessage();
		} catch (InvalidNegativePowerOperand e) {
			e.getMessage();
		}
	}
	@Test
	public void testMultiplicationFor2Variables()
	{
		IntegerOperations op=new IntegerOperations(5,5,OperationTypes.MULTIPLICATION);
		try {
			assertEquals(25,op.computeOperationOutput());
		} catch (InvalidDivisionException e) {
			e.getMessage();
		} catch (InvalidSubstractionException e) {
			e.getMessage();
		} catch (InvalidNegativePowerOperand e) {
			e.getMessage();
		}
	}
	
	@Test//fails, which is ok
	public void testDivisionByZero()
	{
		IntegerOperations op= new IntegerOperations(20,0,OperationTypes.DIVISION);
		try {
			op.computeOperationOutput();
			fail("Division by zero is not allowed!");
		} catch (InvalidDivisionException e) {
			e.getMessage();
		} catch (InvalidSubstractionException e) {
			e.getMessage();
		} catch (InvalidNegativePowerOperand e) {
			e.getMessage();
		}
	}
	
	@Test
	public void testSubstractionWithNegativeResult()
	{
		IntegerOperations op=new IntegerOperations(15,25,OperationTypes.SUBSTRACTION);
		try {
			op.computeOperationOutput();
			fail("The result should only be positive!");
			//if we comment the if in ,,substraction,, from switch, the test fails =>OK
		} catch (InvalidDivisionException e) {
			e.getMessage();
		} catch (InvalidSubstractionException e) {
			e.getMessage();
		} catch (InvalidNegativePowerOperand e) {
			e.getMessage();
		}
	}
	
	@Test
	public void testPositiveOperandsPowerOperation()
	{
		IntegerOperations op=new IntegerOperations(5,3,OperationTypes.POWER);
		try {
			assertEquals(125,op.computeOperationOutput());
		} catch (InvalidDivisionException e) {
			e.getMessage();
		} catch (InvalidSubstractionException e) {
			e.getMessage();
		} catch (InvalidNegativePowerOperand e) {
			e.getMessage();
		}
	}
	
	@Test
	public void testNegativeOperandsPowerOperation()
	{
		IntegerOperations op=new IntegerOperations(-5,3,OperationTypes.POWER);
		try {
			op.computeOperationOutput();
			fail("Operands should be positive!");
			//if we comment the if in ,,power,, from switch, the test fails =>OK
		} catch (InvalidDivisionException e) {
			e.getMessage();
		} catch (InvalidSubstractionException e) {
			e.getMessage();
		} catch (InvalidNegativePowerOperand e) {
			e.getMessage();
		}
	}
	
	@Test
	public void testAddingWith10()
	{
		IntegerOperations op=new IntegerOperations(12,10,OperationTypes.POWER);
		try {
			assertEquals(2,op.computeOperationOutput());
			//result should not be 2=> OK
		} catch (InvalidDivisionException e) {
			e.getMessage();
		} catch (InvalidSubstractionException e) {
			e.getMessage();
		} catch (InvalidNegativePowerOperand e) {
			e.getMessage();
		}
	}
	
	@Test
	public void testMultiplyingWith10()
	{
		IntegerOperations op=new IntegerOperations(12,10,OperationTypes.POWER);
		try {
			assertEquals(15,op.computeOperationOutput());
			//result should not be 15=> OK
		} catch (InvalidDivisionException e) {
			e.getMessage();
		} catch (InvalidSubstractionException e) {
			e.getMessage();
		} catch (InvalidNegativePowerOperand e) {
			e.getMessage();
		}
	}
	
}
