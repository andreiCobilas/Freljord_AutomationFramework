package com.Freljord.Infrastructure.Helper.Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LoggerHelper {

    public  static void logAction(String logMessage, String className) {

        Logger log = (Logger) LogManager.getLogger(className);
        log.info(logMessage);
    }
}
