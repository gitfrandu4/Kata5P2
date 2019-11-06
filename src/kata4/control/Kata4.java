package kata4.control;

import kata4.model.Histogram;
import kata4.view.HistogramDisplay;

public class Kata4 {
    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("gmail.com");
        
        /*for (int value : histogram){
            System.out.println(value + " " +histogram.getCount(value));    
        }*/
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}