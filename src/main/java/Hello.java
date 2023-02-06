

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	
	private static final long serialVersionUID = 1L; 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<h1>Hello Servlet, this is my first servlet project!!!</h1></br>");
		out.print("</body></html>");
		
		out.print("// below is the servletConfig interface example implementation </br>");
		
		 ServletConfig config=getServletConfig();  
		 String author = config.getInitParameter("author");  
		 out.print("Author is: "+author+"</br>");  
		 String server = config.getServletName();
		 out.print("The name of servlet is "+server);
		 Enumeration<String> e=config.getInitParameterNames();  
		 String str="";  
		    while(e.hasMoreElements()){  
		    str=e.nextElement();  
		    out.print("<br>Name: "+str);  
		    out.print(" value: "+config.getInitParameter(str)+"</br></br>");  
		    }  
		    
		    out.print("// below is the attribute in servlet example implementation </br>");
		    ServletContext context = getServletContext();  
		    context.setAttribute("company","IBM");  
		    
		    out.println("Welcome to first servlet </br>");  
		    out.println("<a href='InputNameServlet'>visit</a>");  
		    out.close();  
		      
	} 
}
