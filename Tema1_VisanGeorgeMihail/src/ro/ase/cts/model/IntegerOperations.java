package ro.ase.cts.model;

import ro.ase.cts.exceptions.InvalidDivisionException;
import ro.ase.cts.exceptions.InvalidNegativePowerOperand;
import ro.ase.cts.exceptions.InvalidSubstractionException;

public class IntegerOperations {
	
	private int firstOperand;
	private int secondOperand;
	private OperationTypes operation;
	
	public IntegerOperations(int firstOperand, int secondOperand, OperationTypes operation) {
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
		this.operation = operation;
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

	public OperationTypes getOperation() {
		return operation;
	}

	public void setOperation(OperationTypes operation) {
		this.operation = operation;
	}
	
	public int computeOperationOutput() throws InvalidDivisionException, InvalidSubstractionException, InvalidNegativePowerOperand
	{
		int result=0;
		switch(this.operation)
		{
		case ADDITION:
			result=this.firstOperand+this.secondOperand;
			break;
		case SUBSTRACTION:
			//if(this.firstOperand>=this.secondOperand)
				result=this.firstOperand-this.secondOperand;
			//else throw new InvalidSubstractionException("Can not have negative results!");
			break;
		case MULTIPLICATION:
			result=this.firstOperand*this.secondOperand;
			break;
		case DIVISION:
			if(this.firstOperand%this.secondOperand==0)
				result=this.firstOperand/this.secondOperand;
			else
				throw new InvalidDivisionException("Can not divide by 0!");
			break;
		case POWER:
			//if(this.firstOperand>0 && this.secondOperand>0)
				//{
					result=1;
					while(this.secondOperand>0)
					{
						result=result*this.firstOperand;
						this.secondOperand--;
					}
				//}
		//else throw new InvalidNegativePowerOperand("Can not have negative operands!");
		}
		return result;
	}
	
}
