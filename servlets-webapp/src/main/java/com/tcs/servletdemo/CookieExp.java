package com.tcs.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieExp
 */
@WebServlet("/cookieexp")
public class CookieExp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieExp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		int count=0;
//		PrintWriter out = response.getWriter();
//		Cookie cookies []= request.getCookies();
//		boolean flag=false;
//		Cookie c=null;
//		
//		for(int i=0;i<cookies.length;i++) {
//			out.println("hello");
//			c=cookies[i];
//			if (c.getName().equals("visits")) {
//				count = Integer.parseInt(c.getValue());
//			count++;
//				out.println("The page visiteed for the conseqent"+count+ "times");
//				flag=true;
//			response.addCookie(c);
//				break;
//			}
//		}
//		
//	
//		if(!flag) {
//		Cookie cookie = new Cookie("visits",++count+"");
//		response.addCookie(cookie);
//		out.println("The page visiteed for the first"+count+ "times");
//		flag=true;
//		}
		  response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			int count = 0;
			Cookie cookies[] = request.getCookies();
			Cookie c = null;
			boolean flag = false;
			for (int i = 0; i < cookies.length; i++) {
				c = cookies[i];
				if (c.getName().equals("visits")) {
					flag = true;
					break;
				}
			}
			if (flag) { // flag==true means visits cookie is found only after first visit
				count = Integer.parseInt(c.getValue());
				count++;
				c.setValue(count+"");
				response.addCookie(c);
			} else {
				Cookie cookie = new Cookie("visits", ++count + "");
				response.addCookie(cookie); // response header 
			}
			out.println("<h1>You have refreshed the page " + count + "  times</h1>");
		}
		
		
	//	out.println(count=count+1);
		
		
	

}
