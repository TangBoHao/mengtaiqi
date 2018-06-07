package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import net.sf.json.JSONArray;


import dao.HibernateUtils;
import entity.Templ;

/**
 * Servlet implementation class addTempl
 */
@WebServlet("/addTempl")
public class addTempl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addTempl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid=request.getParameter("userid");
		String templid=request.getParameter("templid");
		String content=request.getParameter("content");
		String class1=request.getParameter("class1");
		String class2=request.getParameter("class2");
		System.out.println(userid+templid+content);
		Session session=HibernateUtils.getSession();
		Transaction tx=session.beginTransaction();
		
	class2="asdfasdf";	
		Templ onet=new Templ(templid,userid,content,class1,class2);
		HibernateUtils.session.save(onet);
		tx.commit();
		PrintWriter out=response.getWriter();
		//out.println("add success");
		Map<String,String> res=new HashMap<String,String>();
		res.put("status", "200");
		res.put("thisid",""+onet.getTid());
		JSONArray jres=JSONArray.fromObject(res);
		out.println(jres.toString());
		
		
	}

}









