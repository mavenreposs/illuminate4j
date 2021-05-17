package io.github.mavenreposs.illuminate4j.support;

import java.util.HashMap;
import java.util.Map;

public class StudlyCache {

    /**
     * The cache of snake-cased words.
     */
    public static Map<String, String> snakeCache = new HashMap<>();

    /**
     * The cache of camel-cased words.
     */
    public static Map<String, String> camelCache = new HashMap<>();

    /**
     * The cache of studly-cased words.
     */
    public static Map<String, String> studlyCache = new HashMap<>();


}
