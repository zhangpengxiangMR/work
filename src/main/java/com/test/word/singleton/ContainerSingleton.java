package com.test.word.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static volatile Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        Object instance = null;
        if (!ioc.containsKey(className)) {
            synchronized (ContainerSingleton.class) {
                try {
                    if (!ioc.containsKey(className)) {
                        instance = Class.forName(className).newInstance();
                        ioc.put(className, instance);
                    } else {
                        return ioc.get(className);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return instance;
        } else {
            return ioc.get(className);
        }

    }

}
