package com.bank.service;

import java.util.ArrayList;

import com.bank.dao.CreditCardDAOImpl;
import com.bank.dao.CreditCardDAOInterface;
import com.bank.model.CreditCardModel;

public class CreditCardServiceImpl implements CreditCardServiceInterface {
	CreditCardDAOInterface creditCardDAOInterface = new CreditCardDAOImpl();

	public ArrayList<CreditCardModel> getCreditCards() {
		ArrayList<CreditCardModel> creditCardsArrayList = creditCardDAOInterface.getCreditCards();
		return creditCardsArrayList;
	}

	@Override
	public CreditCardModel getCreditCard(String cardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addCreditCard(CreditCardModel creditCardModel) {
		int result = creditCardDAOInterface.insertCreditCard(creditCardModel);
		return result;
	}

	@Override
	public int modifyCreditCard(CreditCardModel creditCardModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeCreditCard(String cardNo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
