package com.bank.dao;

import java.util.ArrayList;

import com.bank.model.CreditCardModel;

public interface CreditCardDAOInterface {
	ArrayList getCreditCards();

	CreditCardModel getCreditCard(String cardNo);

	int insertCreditCard(CreditCardModel creditCardModel);

	int updateCreditCard(CreditCardModel creditCardModel);

	int deleteCreditCard(String cardNo);

}