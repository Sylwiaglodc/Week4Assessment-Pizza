package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pizza;

/**
 * Servlet implementation class getPizzaOrder
 */
@WebServlet("/getPizzaOrder")
public class getPizzaOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPizzaOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String userMeat = request.getParameter("toppingsMeat");
		String userVeggie = request.getParameter("toppingsVeggies");
		
		Pizza userPizza = new Pizza();
		
		int userPizzaOrderRaw = userPizza.setPizzaPrice(Integer.parseInt(userVeggie),Integer.parseInt(userMeat));
		
		String userPizzaOrder = String.valueOf(userPizzaOrderRaw);
				
		request.setAttribute("userPizzaOrder", userPizzaOrder);
		
		getServletContext().getRequestDispatcher("/thankyou.jsp").forward(request, response);
		

	}

}
