package com.bank.service;

import java.util.ArrayList;

import com.bank.dao.CreditCardDAOImpl;
import com.bank.dao.CreditCardDAOInterface;
import com.bank.model.CreditCardModel;

public class CreditCardServiceImpl implements CreditCardServiceInterface{
	public ArrayList<CreditCardModel> getCreditCards() {
	 CreditCardDAOInterface creditCardDAOInterface = new CreditCardDAOImpl();
	 ArrayList<CreditCardModel> creditCardsArrayList = creditCardDAOInterface.getCreditCards();
	 return creditCardsArrayList;
	}
}
