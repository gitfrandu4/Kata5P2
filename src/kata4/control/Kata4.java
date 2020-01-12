package kata4.control;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    
    public static void main(String[] args) {
       String fileName = "email.txt";
        /* I */ List<Mail> mailList = MailListReader.read(fileName);
        /* P */ Histogram histogram = MailHistogramBuilder.build(mailList);        
        /* O */ HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        /* O */ histoDisplay.execute();
    }
}