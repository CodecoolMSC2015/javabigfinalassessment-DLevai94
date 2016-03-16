package client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		request.getRequestDispatcher("index.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		request.getRequestDispatcher("index.jsp").include(request, response);
		String skill = request.getParameter("skill");
		String[] splittedSkills = skill.split(",");

		SocketClient sc = new SocketClient(splittedSkills);

		String searchType = request.getParameter("searchType");
		out.println("Searchtype: " + searchType);

		// TODO: searchtype jó lekérése, mert most csak "on"-t ad vissza ez a fos.

		out.flush();
		out.close();
	}

}
