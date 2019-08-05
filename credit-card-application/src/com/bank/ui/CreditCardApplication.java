package com.bank.ui;

import java.util.ArrayList;

import com.bank.dao.CreditCardDAOImpl;
import com.bank.model.CreditCardModel;
import com.bank.service.CreditCardServiceImpl;
import com.bank.service.CreditCardServiceInterface;

public class CreditCardApplication {
	public static void main(String[] args) {
		CreditCardServiceInterface creditCardServiceInterface = new CreditCardServiceImpl();
		
		//Get all the credit cards.
//		ArrayList<CreditCardModel> creditCardsArrayList = creditCardServiceInterface.getCreditCards();
//		System.out.println(creditCardsArrayList);
		
		
		CreditCardModel creditCardModel = new CreditCardModel("12345","Friday Boy");
		int result = creditCardServiceInterface.addCreditCard(creditCardModel);
		if(result == 1 ) {
			System.out.println("Inserted : " + creditCardModel);
		}
		
	}
}
