package com.bank.service;

import java.util.ArrayList;

import com.bank.model.CreditCardModel;

public interface CreditCardServiceInterface {

	public ArrayList getCreditCards();

	CreditCardModel getCreditCard(String cardNo);

	int addCreditCard(CreditCardModel creditCardModel);

	int modifyCreditCard(CreditCardModel creditCardModel);

	int removeCreditCard(String cardNo);
}
