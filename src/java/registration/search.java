package registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public search() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
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
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ami", "root", ""); // create new connection with test database
            String query = "select * from registration";
            PreparedStatement ps = con.prepareStatement(query);  // generates sql query
            ResultSet rs = ps.executeQuery();
            out.print("<table border='1'>");
            out.print("<tr><th>No</th>	<th>UserName</th> <th>Password</th> <th>FirstName</th> <th>LastName</th>");
            out.print("<th>Gender</th> 	<th>Address</th> 	<th>City</th>	<th>Mobile</th> <th>Email</th> <th>Education</th>");
            out.print("<th>Parcentage</th> <th>Designation</th> <th>Update</th> <th>Delete</th> </tr>");

            while (rs.next()) {
                out.print("<tr><td>" + rs.getInt(1) + "</td>");
                out.print("<td>" + rs.getString(2) + "</td>");
                out.print("<td>" + rs.getString(3) + "</td>");
                out.print("<td>" + rs.getString(4) + "</td>");
                out.print("<td>" + rs.getString(5) + "</td>");
                out.print("<td>" + rs.getString(6) + "</td>");
                out.print("<td>" + rs.getString(7) + "</td>");
                out.print("<td>" + rs.getString(8) + "</td>");
                out.print("<td>" + rs.getString(9) + "</td>");
                out.print("<td>" + rs.getString(10) + "</td>");
                out.print("<td>" + rs.getString(11) + "</td>");
                out.print("<td>" + rs.getString(12) + "</td>");
                out.print("<td>" + rs.getString(13) + "</td>");
                out.print("<td> <a href=update.jsp> Update </a> </td>");
                out.print("<td> <a href=delete.jsp> Delete </a> </td> </tr>");
            }

            ps.executeUpdate(); // execute it on test database
            out.println("</table>");
            System.out.println("successfuly view");
            ps.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
