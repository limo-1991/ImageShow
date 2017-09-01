package studio.limo.image.demo;


import org.apache.log4j.Logger;


public class Log4jDemo {
    static Logger logger = Logger.getLogger(Log4jDemo.class.getName());

    static {
        logger.debug("log4j run");
    }

}
