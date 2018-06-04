package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import dao.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getTemplcontent
 */
@WebServlet("/getTemplcontent")
public class getTemplcontent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTemplcontent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		GetTempl get=new GetTempl();
		
		String userid=request.getParameter("userid");
		String templid=request.getParameter("templid");
		if(userid!=null)
		{
			out.println(get.getbyUserid(userid));
		}
		if(templid!=null)
		{
			out.println(get.getbyTemplid(templid));
		}
	}

}
