package LogTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger4JTest {
    public static  void main(String[] args){
        PropertyConfigurator.configure("src/LogTest/log4j.properties");
        Logger logger = Logger.getLogger(Logger4JTest.class);
        logger.debug(" debug");
        logger.error(" error ");
    }
}
