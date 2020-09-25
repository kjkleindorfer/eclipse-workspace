package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TemperatureConverter;

/**
 * Servlet implementation class getTempServlet
 */
@WebServlet("/getTempServletF")
public class getTempServletF extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTempServletF() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userTempF = request.getParameter("userTempF");
		TemperatureConverter userNewtemp = new TemperatureConverter(Double.parseDouble(userTempF));
		
		
		request.setAttribute("userTempF", userNewtemp);
		getServletContext().getRequestDispatcher("/resultF.jsp").forward(request, response);
	}

}
