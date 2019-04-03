package ro.ase.cts.models;

import org.junit.experimental.theories.Theories;

import ro.ase.cts.exceptions.MaximumNumberException;
import ro.ase.cts.exceptions.DivideByZeroException;

public class IntegerDivision {
	
	private int firstOperand;
	private int secondOperand;
	
	public IntegerDivision()
	{
		
	}
	
	public IntegerDivision(int firstOperand, int secondOperand) {
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
	}

	public int getFirstOperand() {
		return firstOperand;
	}

	public void setFirstOperand(int firstOperand) {
		this.firstOperand = firstOperand;
	}

	public int getSecondOperand() {
		return secondOperand;
	}

	public void setSecondOperand(int secondOperand) {
		this.secondOperand = secondOperand;
	}
	
	public int computeDivisionOutput() throws MaximumNumberException, DivideByZeroException
	{
		int result=0;
		if(this.firstOperand>Integer.MAX_VALUE || this.secondOperand>Integer.MAX_VALUE)
		{
			throw new MaximumNumberException("Can not have numbers greater integer maximum!");
		}
		
		if(this.secondOperand==0)
		{
			throw new DivideByZeroException("Can not divide by zero!");
		}
		return result=this.firstOperand/this.secondOperand;
	}
	
	
}
