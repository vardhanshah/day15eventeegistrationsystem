package com.bank.dao;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bank.model.CreditCardModel;

public class CreditCardDAOImpl implements CreditCardDAOInterface {

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

	@Override
	public CreditCardModel getCreditCard(String cardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCreditCard(CreditCardModel creditCardModel) {
		String insertQueryString = "insert into credit_card values(" + Integer.parseInt(creditCardModel.getCardNo()) + ",'"
				+ creditCardModel.getCardHolderName() + "',null,null,null)";
		int noOfRowsAffected  = DBUtil.executeDBUpdate(insertQueryString);
		return noOfRowsAffected;
	}

	@Override
	public int updateCreditCard(CreditCardModel creditCardModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCreditCard(String cardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

//private ArrayList getCreditCardsArrayList() {
//	ArrayList<CreditCardModel> creditCardsArrayList = new ArrayList<CreditCardModel>();
//	CreditCardModel creditCardModel = new CreditCardModel();
//	creditCardModel.setCardNo("123");
//	creditCardModel.setCardHolderName("Heaven");
//	creditCardsArrayList.add(creditCardModel);
//	return creditCardsArrayList;
//}
}
