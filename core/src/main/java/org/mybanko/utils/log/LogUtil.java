package org.mybanko.utils.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class LogUtil {
    private static final Map<String, Logger> loggersMap= new HashMap<>();

    public static Logger logger(Class<?> clazz) {
        if (!loggersMap.containsKey(clazz.getName())) {
            newLogger(clazz);
        }
        return loggersMap.get(clazz.getName());
    }

    private static void newLogger(Class<?> clazz) {
        loggersMap.put(clazz.getName(), LoggerFactory.getLogger(clazz));
    }
}
