package Demopackege;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/subjectlink")
public class Subject extends HttpServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

	String[] subjects=req.getParameterValues("course");
	
	PrintWriter pw=resp.getWriter();
	for(int i=0;i<subjects.length;i++) {
		pw.print("<h1>SELECTED SUBJECTS ARE"+subjects[i]+"</h1>");
	}

}
}
