/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Hi-XV
 */
public class test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinhvien","root","123456");
            Statement stmt= con.createStatement();
            ResultSet rs= stmt.executeQuery("SELECT *from hocphi");
            while(rs.next())    System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+ rs.getInt(4));
            con.close();
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("e");
        }
    }
}
