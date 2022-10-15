package Java2022IO.KodlamaIOSimulateCourse.core.logging;

public class MailLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Mail Gönderildi : " + data);
    }
    
}
