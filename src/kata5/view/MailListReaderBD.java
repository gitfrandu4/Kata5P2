package kata5.view;

import java.util.ArrayList;
import java.util.List;
import kata5.model.Mail;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MailListReaderBD {
    
    public static List<Mail> read(Connection conn) {
        List<Mail> list = new ArrayList<>();

        String sql = "SELECT * FROM MAIL";
        
        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            
            // Bucle sobre el conjunto de registros
            while (rs.next()){
                String mail = rs.getString("Mail");
                if(Mail.isMail(mail)){
                    list.add(new Mail (mail));
                }
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return list;
    }
}
