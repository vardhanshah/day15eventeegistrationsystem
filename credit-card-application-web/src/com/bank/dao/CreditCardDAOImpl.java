package com.bank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bank.model.CreditCardModel;

public class CreditCardDAOImpl implements CreditCardDAOInterface {

	@Override
	public int deleteCreditCard(String cardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CreditCardModel getCreditCard(String cardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList getCreditCards() {
		ResultSet resultSet = DBUtil.executeDBQuery("select * from credit_card");
		ArrayList<CreditCardModel> creditCardModelsArrayList = new ArrayList<CreditCardModel>();
		try {
			while (resultSet.next()) {
				CreditCardModel creditCardModel = new CreditCardModel();
				creditCardModel.setCardNo(String.valueOf(resultSet.getInt("card_number")));
				creditCardModel.setCardHolderName(resultSet.getString("card_holder_name"));
				creditCardModelsArrayList.add(creditCardModel);
			}
		} catch (SQLException e) {
			System.err.println("Error getting Credit Cards" + e);
			return null;
		}
		return creditCardModelsArrayList;
	}

	private ArrayList getCreditCardsArrayList() {
		ArrayList<CreditCardModel> creditCardsArrayList = new ArrayList<CreditCardModel>();
		CreditCardModel creditCardModel = new CreditCardModel();
		creditCardModel.setCardNo("123");
		creditCardModel.setCardHolderName("Heaven");
		creditCardsArrayList.add(creditCardModel);
		return creditCardsArrayList;
	}

	@Override
	public int insertCreditCard(CreditCardModel creditCardModel) {
		return 0;
	}

	@Override
	public int updateCreditCard(CreditCardModel creditCardModel) {
		// TODO Auto-generated method stub
		return 0;
	}
}
