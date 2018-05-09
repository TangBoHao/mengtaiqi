package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.SetCategoryDAO;
/*
 * post过来的参数为category1 category2
 * 当post过来的参数category1为0 设置主类别名称
 * 当post过来的参数category为1-9 设置第n个主分类的第m个二级分类的名称
 * name为要命名的名字
 */
@WebServlet("/setCategory")
public class setCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public setCategory() {
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
		int n=Integer.valueOf(request.getParameter("category1"));
		int m=Integer.valueOf(request.getParameter("category2"));
		String category_name=request.getParameter("name");
		
		SetCategoryDAO.doSet(n,m,category_name);
		PrintWriter out=response.getWriter();
		out.print("success");
		
		
		
		
		
	}

}
