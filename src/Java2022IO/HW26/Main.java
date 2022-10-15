package Java2022IO.HW26;

public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()};

        for (BaseLogger baseLogger : loggers) {
            baseLogger.log("Log");
        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
    
}
