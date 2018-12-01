package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        Kata4 kata = new Kata4();
        kata.execute();
    }
    
    String fileName;
    List<Mail> mailList;
    Histogram histogram;
    
    private void execute(){
        input();
        process();
        output();
    }
    
    private void input(){
        fileName = "email.txt";
        mailList = MailListReader.Read(fileName);
    }
    
    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }

}
