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
 * post�����Ĳ���Ϊcategory1 category2
 * ��post�����Ĳ���category1Ϊ0 �������������
 * ��post�����Ĳ���categoryΪ1-9 ���õ�n��������ĵ�m���������������
 * nameΪҪ����������
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
