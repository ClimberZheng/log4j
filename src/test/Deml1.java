package test;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class Deml1 {
 
	static Logger logger = LogManager.getLogger();  
	  
    public static void main(String[] args) {  
        for (int i = 0; i < 1; i++) {  
            logger.trace("trace message " + i);  
            logger.debug("debug message " + i);  
            logger.info("info message " + i);  
            logger.warn("warn message " + i);  
            logger.error("error message " + i);  
            logger.fatal("fatal message " + i);  
        }          
        System.out.println("Hello World! 2");  
    }  
}