<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.bank.model.CreditCardModel"%>
<%@ page import="com.bank.service.CreditCardServiceInterface"%>
<%@ page import="com.bank.service.CreditCardServiceImpl"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		CreditCardServiceInterface creditCardServiceInterface = new CreditCardServiceImpl();
		ArrayList<CreditCardModel> creditCardsArrayList = creditCardServiceInterface.getCreditCards();
	%>


	<table  style="border:1px solid red;">
		<tr>
			<th>Card Number</th>
			<th>Card Holder Name</th>
		</tr>
		<%
			for (CreditCardModel creditCardModel : creditCardsArrayList) {
		%>
		<tr>
			<td><%=creditCardModel.getCardNo()%></td>
			<td><%=creditCardModel.getCardHolderName() %></td>
			<td></td>
		</tr>
		<%
			}
		%>
	</table>
<input type="button" onclick="alert('Clicked')" value="Click Me"/>

</body>
</html>



