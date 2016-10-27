package kata4;

import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
public class Kata4 {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata4\\emailsfilev1.txt";
        ArrayList<String> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
    
}
