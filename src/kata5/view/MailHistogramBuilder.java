package kata5.view;

import java.util.List;
import kata5.model.Histogram;
import kata5.model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram build(List<Mail> listMail) {
        
        Histogram<String> histogram = new Histogram ();
        
        for (Mail mail : listMail )
            histogram.increment(mail.getDomain());
        
        return histogram;
    }
    
}
