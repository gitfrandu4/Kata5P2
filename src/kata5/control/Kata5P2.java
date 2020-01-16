package kata5.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import kata5.model.Histogram;
import kata5.model.Mail;
import kata5.view.HistogramDisplay;
import kata5.view.MailHistogramBuilder;
import kata5.view.MailListReaderBD;

public class Kata5P2 {
    
    public static void main(String[] args) {
        
       Connection conn = connect();

        /* I */ List<Mail> mailList = MailListReaderBD.read(conn);
        /* P */ Histogram histogram = MailHistogramBuilder.build(mailList);
        /* O */ HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        /* O */ histoDisplay.execute();
    }
    
    // Se conecta a la BD y devuelve un objeto Connection
    private static Connection connect () {
        
        // SQLite connection string
        String url = "jdbc:sqlite:kata5.db";
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}