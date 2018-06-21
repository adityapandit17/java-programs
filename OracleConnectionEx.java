import java.sql.*;
class OracleConnectionEx
  {
    public static void main(String args[]) throws Exception
      {
        try
          {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-PP83NHN:1521:xe","scott","tiger");
            Statement statement=connection.createStatement();
            ResultSet resultset=statement.executeQuery("select * from students");
            while(resultset.next())
              {
                System.out.println(resultset.getInt("S_ID")+"  "+resultset.getString("S_NAME")+"  "+resultset.getInt("S_AGE"));
              }
            connection.close();
          }
        catch(Exception ex)
          {
            System.out.println(ex);
          }
      }
  }
  