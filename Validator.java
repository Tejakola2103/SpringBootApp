package com.infy.validator;

import java.time.LocalDate;

import com.infy.exception.InsuranceException;
import com.infy.model.PolicyDTO;

public class Validator {


	public static void validate(PolicyDTO policy) throws InsuranceException{
		
	}

	
	public static Boolean validatePolicyName(String policyName){

		return null;

	}
	
	public static Boolean validatePolicyType(String policyType){

		return null;

	}
	
	public static Boolean validatePremium(Double premium){

		return null;

	}
	
	public static Boolean validateTenure(Integer tenureInMonths){

		return null;

	}

	
	public static Boolean validateDateOfBirth(LocalDate dateOfBirth){

		return null;

	}

	
	public static Boolean validatePolicyNumber(String policyNumber,String policyType){

		return null;

	}

	
	public static Boolean validatePolicyHolderName(String policyHolderName){

		return null;

	}
}
