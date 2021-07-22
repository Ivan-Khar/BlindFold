package com.aqupd.blindfold.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AqLogger {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void logError(String error) {
        LOGGER.error("[AqUpd's Items] " + error);
    }

    public static void logInfo(String info) {
        LOGGER.info("[AqUpd's Items] " + info);
    }

}
