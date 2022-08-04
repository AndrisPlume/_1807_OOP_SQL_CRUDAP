import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class DBLogic {

    // Establish connection to SQL
    String DB = "jdbc:mysql://localhost:3306/07_crudap";
    String USER = "root";
    String PASS = "Tornakalna7.";

    Scanner scan = new Scanner(System.in);

    // insert encapsulated encapsulated for limited use
    private void insert() {

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "INSERT INTO users (email, name) VALUES ('andris.plume@gmail.lv', 'Andris')";

            stmt.executeUpdate(sql);

            System.out.println("Dati ir ievadīti");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Getter for insert function
    public void getInsert() {
        insert();
    }
    // delete function encapsulated for limited use

    private void delete() {

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();
            System.out.println("Insert user Nr. to delete");
            int x = scan.nextInt();

            String sql = "DELETE FROM users WHERE id ='" + x + "'";

            stmt.executeUpdate(sql);

            System.out.println("Dati ir izdzēsti");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Getter for delete funcion

    public void getDelete() {
        delete();

    }

    // update
    private void update() {

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            System.out.println("Insert user Nr. to update");
            int y = scan.nextInt();

            System.out.println("Enter new email:");
            String nemail = scan.next();
            System.out.println("enter new name:");
            String nname = scan.next();

            String sql = "UPDATE users SET email = '"+ nemail +"', name ='"+ nname +"' WHERE id ='" + y + "'";

            stmt.executeUpdate(sql);

            System.out.println("Dati ir atjaunoti");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //getter for update

        public void getUpdate() {
            update();
        }

            // select
            private void select () {

                try {

                    Connection conn = DriverManager.getConnection(DB, USER, PASS);
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT id, email, name FROM users");


                    while (rs.next()) {
                        System.out.println("id: " + rs.getInt("id"));
                        System.out.println("email: " + rs.getString("email"));
                        System.out.println("name: " + rs.getString("name"));
                        System.out.println("");


                    }


                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            public void getSelect () {
                    select();
                }
            }


