import java.sql.*;
public class JDBC {
    /*
    1. import the package
    2. Load the driver
    3. Register the driver
    4. Create the statement
    5. Execute the statement
    6. Process the result
    7. Close
     */

    public static void main()
    {
        int id = 6;
        String name = "James";
        int marks = 84;

        String url = "jdbc:postgresql://localhost:5433/Demo";
        String user = "postgres";
        String password = "20tgurus";
        String query = "insert into public.\"Student\" values (?, ?, ?)";

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Connected to database successfully");
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, id);
            st.setString(2, name);
            st.setInt(3, marks);
            st.executeUpdate();
            con.close();
            System.out.println("Connection closed");

        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver not found " + e.getMessage());
        }
        catch (SQLException e) {
            System.out.println("SQL Error " + e.getMessage());
        }
    }
}
