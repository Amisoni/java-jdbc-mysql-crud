<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Registration Form</title>
    </head>
    <body>
        <form action="Registration" method="post">
            <table>
                <tr>
                    <td>No</td> <td> <input type="text" name="no"> </td>
                </tr>
                <tr>
                <tr>
                    <td> UserName</td> <td> <input type="text" name="unm"> </td>
                </tr>
                <tr>
                    <td>Password</td> <td> <input type="password" name="pw"> </td>
                </tr>
                <tr>
                    <td>FirstName</td> <td> <input type="text" name="fnm"> </td>
                </tr>
                <tr>
                    <td>LastName</td> <td> <input type="text" name="lnm"> </td>
                </tr>
                <tr>
                    <td>Gender</td>  <td> <input type="radio" name="ge" value="male"> Male  <input type="radio" name="ge" value="female"> Female </td>

                </tr>
                <tr>
                    <td>Address</td> <td> <input type="text" name="add"> </td>
                </tr>
                <tr>
                    <td>City</td> <td> <select name="city"> 
                            <option>Ahmedabad</option>
                            <option>Surat</option> 
                            <option>Rajkot</option>
                        </select> 
                    </td>
                </tr>
                <tr>
                    <td>Mobile</td> <td> <input type="text" name="mn"> </td>
                </tr>
                <tr>
                    <td>Email</td> <td> <input type="email" name="em"> </td>
                </tr>
                <tr>
                    <td>Education</td> <td> <select name="edu"> 
                            <option> MCA </option>
                            <option> MBA </option> 
                            <option> MCOM </option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Parcentage</td> <td> <input type="text" name="pa"> </td>
                </tr>
                <tr>
                    <td>Designation</td> <td> <select name="des"> 
                            <option> ACC </option>
                            <option> MAN </option> 
                            <option> SAL </option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td>
                        <input type="submit" value="go"/>
                    </td>
                </tr>

            </table>

        </form>    

        <form action="search" method="post">

            <input type="submit" value="View">

        </form>
    </body>
</html>