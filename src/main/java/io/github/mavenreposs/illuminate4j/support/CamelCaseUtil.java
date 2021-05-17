package io.github.mavenreposs.illuminate4j.support;

/**
 * 驼峰与下划线之间互转工具类
 */
public class CamelCaseUtil {
    private static final char UNDERLINE_SEPARATOR = '-';
    private static final char UNDERSCORE_SEPARATOR = '_';

    private CamelCaseUtil() {
    }

    /**
     * <p>
     * 转中划线
     * </p>
     *
     * @param s:
     */
    public static String toUnderlineName(String s) {
        return snake(s, UNDERLINE_SEPARATOR);
    }

    /**
     * <p>
     * 转下划线
     * </p>
     *
     * @param s:
     */
    public static String toUnderscoreName(String s) {
        return snake(s, UNDERSCORE_SEPARATOR);
    }


    public static String snake(String s, char delimiter) {
        if (s == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        boolean upperCase = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean nextUpperCase = true;

            if (i < (s.length() - 1)) {
                nextUpperCase = Character.isUpperCase(s.charAt(i + 1));
            }

            if (Character.isUpperCase(c)) {
                if (!upperCase || !nextUpperCase) {
                    if (i > 0) sb.append(delimiter);
                }
                upperCase = true;
            } else {
                upperCase = false;
            }

            sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    /**
     * <p>
     * 转驼峰
     * </p>
     *
     * @param s:
     */
    public static String toCamelCase(String s) {
        if (s == null) {
            return null;
        }
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s.length());
        boolean upperCase = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == UNDERSCORE_SEPARATOR) {
                upperCase = true;
            } else if (upperCase) {
                sb.append(Character.toUpperCase(c));
                upperCase = false;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * <p>
     * 转大写驼峰
     * </p>
     *
     * @param s:
     */
    public static String toCapitalizeCamelCase(String s) {
        if (s == null) {
            return null;
        }
        s = toCamelCase(s);
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

}
