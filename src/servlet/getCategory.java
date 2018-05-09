package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.GetCategoryDAO;
/**
 * Servlet implementation class GetCategory
 */
@WebServlet("/getCategory")
public class getCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String jsonName;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCategory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num=request.getParameter("num");
		int i=Integer.valueOf(num);
		GetCategoryDAO obj1=new GetCategoryDAO();
		
		try {
			jsonName=obj1.getNames(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out=response.getWriter();
		out.print(jsonName);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
