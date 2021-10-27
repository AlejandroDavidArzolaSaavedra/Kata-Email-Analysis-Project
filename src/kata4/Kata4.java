
package kata4;

import java.io.FileNotFoundException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import static view.MailHistogramBuilder.build;
import view.MailListReader;
import static view.MailListReader.read;

public class Kata4 {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = new String("C:\\Users\\Lab-DIS\\Documents\\NetBeansProjects\\kata4\\email.txt");
        List<Mail> mailList;
        mailList = read(fileName);
        Histogram<String> histogram = new Histogram<String>();
        histogram = build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    }
