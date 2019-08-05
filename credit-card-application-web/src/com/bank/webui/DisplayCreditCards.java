package com.bank.webui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.model.CreditCardModel;
import com.bank.service.CreditCardServiceImpl;
import com.bank.service.CreditCardServiceInterface;

@WebServlet("/displaycreditcards")
public class DisplayCreditCards extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		CreditCardServiceInterface creditCardServiceInterface = new CreditCardServiceImpl();
		ArrayList<CreditCardModel> creditCardsArrayList = creditCardServiceInterface.getCreditCards();
		// out.println(creditCardsArrayList);
		request.setAttribute("creditCardsArrayList", creditCardsArrayList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/display.jsp");
		requestDispatcher.forward(request, response);
	}
}
