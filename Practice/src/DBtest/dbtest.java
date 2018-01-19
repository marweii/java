package DBtest;
import jxl.write.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;

public class dbtest {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://127.0.0.1:3306/Book";
    public static void main(String[] args){
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL,"root","1234");
            PreparedStatement pstate = conn.prepareStatement("SELECT * FROM bookbuy");
            ResultSet rs =pstate.executeQuery();
            while(rs.next()){
                String strdate = rs.getString("buydate");
                strdate = strdate.substring(0,19);
                java.util.Date date = ft.parse(strdate);
                System.out.println(ft.format(date));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
