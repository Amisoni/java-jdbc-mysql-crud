package registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String no = request.getParameter("no");
		String username = request.getParameter("unm");
		String password = request.getParameter("pw");
		String firstname = request.getParameter("fnm");
		String lastname = request.getParameter("lnm");
		String gender = request.getParameter("ge");
		String address = request.getParameter("add");
		String city = request.getParameter("city");
		String mobile = request.getParameter("mn");
		String email = request.getParameter("em");
		String eduction = request.getParameter("edu");
		String persantage = request.getParameter("pa");
		String designation = request.getParameter("des");

		
		try {
			Class.forName("com.mysql.jdbc.Driver");

		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ami", "root", ""); // create new connection with test database
		
		String query="update registration set username=?,password=?,firstname=?,lastname=?,gender=?,address=?,city=?,mobile=?,email=?,eduction=?,persantage=?,designation=? WHERE no=?";
		
		PreparedStatement ps=con.prepareStatement(query);  // generates sql query
		
		
		ps.setString(1,username);
		ps.setString(2,password);
		ps.setString(3,firstname);
		ps.setString(4,lastname);
		ps.setString(5,gender);
		ps.setString(6,address);
		ps.setString(7,city);
		ps.setString(8,mobile);
		ps.setString(9,email);
		ps.setString(10,eduction);
		ps.setString(11,persantage);
		ps.setString(12,designation);
		ps.setInt(13,Integer.parseInt(no));
	
		ps.executeUpdate(); // execute it on test database
		System.out.println("successfuly update");
		ps.close();
		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}

}
