package io.github.mavenreposs.illuminate4j.support;

import io.github.mavenreposs.php.functions.PHPFunctions;
import org.apache.commons.lang3.CharUtils;

import static io.github.mavenreposs.php.functions.PHPFunctions.implode;


public class Stringable {

    /**
     * The underlying string value.
     */
    private String value;

    public Stringable(String value) {
        this.value = value;
    }

    public Stringable() {
        this.value = "";
    }

    /**
     * Return the remainder of a string after the first occurrence of a given value.
     * @param search 搜索字符串
     * @return Stringable
     */
    public Stringable after(String search) {
        return new Stringable(Str.after(this.value, search));
    }

    /**
     * Return the remainder of a string after the last occurrence of a given value.
     * @param search 搜索字符串
     * @return Stringable
     */
    public Stringable afterLast(String search) {
        return new Stringable(Str.afterLast(this.value, search));
    }

    /**
     * Append the given values to the string.
     * @param values 追加字符串
     * @return Stringable
     */
    public Stringable append(String... values) {
        return new Stringable(this.value + implode("", values));
    }

    /**
     * Get the portion of a string before the first occurrence of a given value.
     * @param search 搜索字符串
     * @return Stringable
     */
    public Stringable before(String search) {
        return new Stringable(Str.before(this.value, search));
    }

    /**
     * Get the portion of a string before the last occurrence of a given value.
     * @param search 搜索字符串
     * @return Stringable
     */
    public Stringable beforeLast(String search) {
        return new Stringable(Str.beforeLast(this.value, search));
    }

    /**
     * Get the portion of a string between two given values.
     * @param from 开始字符
     * @param to 结束字符
     * @return Stringable
     */
    public Stringable between(String from, String to) {
        return new Stringable(Str.between(this.value, from, to));
    }

    /**
     * Convert a value to camel case.
     * @return Stringable
     */
    public Stringable camel() {
        return new Stringable(Str.camel(this.value));
    }

    /**
     * Determine if a given string contains a given substring.
     * @param needles 输入字符串
     * @return Boolean
     */
    public Boolean contains(String needles) {
        return Str.contains(this.value, needles);
    }

    /**
     * Determine if a given string contains a given substring.
     * @param needles 输入字符串
     * @return Boolean
     */
    public Boolean contains(String[] needles) {
        return Str.contains(this.value, needles);
    }

    /**
     * Determine if a given string contains a given substring.
     * @param needles 输入字符串
     * @return Boolean
     */
    public Boolean containsAll(String[] needles) {
        return Str.containsAll(this.value, needles);
    }

    /**
     * Determine if a given string ends with a given substring.
     * @param needles 输入字符串
     * @return Boolean
     */
    public Boolean endsWith(String needles) {
        return Str.endsWith(this.value, needles);
    }

    /**
     * Determine if a given string ends with a given substring.
     * @param needles 输入字符串
     * @return Boolean
     */
    public Boolean endsWith(String[] needles) {
        return Str.endsWith(this.value, needles);
    }

    /**
     * Determine if the string is an exact match with the given value.
     * @param value 输入字符串
     * @return Boolean
     */
    public Boolean exactly(String value) {
        return this.value.equals(value);
    }

    /**
     * Cap a string with a single instance of a given value.
     * @param cap 输入字符串
     * @return Stringable
     */
    public Stringable finish(String cap) {
        return new Stringable(Str.finish(this.value, cap));
    }

    /**
     * Determine if a given string matches a given pattern.
     * @param pattern 输入字符串
     * @return Stringable
     */
    public Boolean is(String pattern) {
        return Str.is(this.value, pattern);
    }

    /**
     * Determine if a given string is 7 bit ASCII.
     * @return Boolean
     */
    public Boolean isAscii() {
        return Str.isAscii(CharUtils.toChar(this.value));
    }

    /**
     * Determine if the given string is empty.
     * @return Boolean
     */
    public Boolean isEmpty() {
        return this.value.equals("");
    }

    /**
     * Determine if the given string is not empty.
     * @return Boolean
     */
    public Boolean isNotEmpty() {
        return ! isEmpty();
    }

    /**
     * Convert a string to kebab case.
     * @return Stringable
     */
    public Stringable kebab() {
        return new Stringable(Str.kebab(this.value));
    }

    /**
     * Return the length of the given string.
     * @return 字符串长度
     */
    public int length() {
        return Str.length(this.value);
    }

    /**
     * Limit the number of characters in a string.
     * @param limit 限制长度
     * @return Stringable
     */
    public Stringable limit(int limit) {
        return new Stringable(Str.limit(this.value, limit));
    }

    /**
     * Limit the number of characters in a string.
     * @param limit 限制长度
     * @param end 尾部追加内容
     * @return Stringable
     */
    public Stringable limit(int limit, String end) {
        return new Stringable(Str.limit(this.value, limit, end));
    }

    /**
     * Convert the given string to lower-case.
     * @return Stringable
     */
    public Stringable lower() {
        return new Stringable(Str.lower(this.value));
    }

    /**
     * Pad both sides of the string with another.
     * @param length 长度
     * @return Stringable
     */
    public Stringable padBoth(int length) {
        return new Stringable(Str.padBoth(this.value, length));
    }

    /**
     * Pad both sides of the string with another.
     * @param length 长度
     * @param pad 填充字符串
     * @return Stringable
     */
    public Stringable padBoth(int length, String pad) {
        return new Stringable(Str.padBoth(this.value, length, pad));
    }

    /**
     * Pad left sides of the string with another.
     * @param length 长度
     * @return Stringable
     */
    public Stringable padLeft(int length) {
        return new Stringable(Str.padLeft(this.value, length));
    }

    /**
     * Pad left sides of the string with another.
     * @param length 长度
     * @param pad 填充字符串
     * @return Stringable
     */
    public Stringable padLeft(int length, String pad) {
        return new Stringable(Str.padLeft(this.value, length, pad));
    }

    /**
     * Pad right sides of the string with another.
     * @param length 长度
     * @return Stringable
     */
    public Stringable padRight(int length) {
        return new Stringable(Str.padRight(this.value, length));
    }

    /**
     * Pad right sides of the string with another.
     * @param length 长度
     * @param pad 填充字符串
     * @return Stringable
     */
    public Stringable padRight(int length, String pad) {
        return new Stringable(Str.padRight(this.value, length, pad));
    }

    /**
     * Prepend the given values to the string.
     * @param values 输入字符串
     * @return Stringable
     */
    public Stringable prepend(String... values) {
        return new Stringable(implode("", values) + this.value);
    }

    /**
     * Replace the given value in the given string.
     * @param search 搜索字符串
     * @param replace 替换字符串
     * @return Stringable
     */
    public Stringable replace(String search, String replace) {
        return new Stringable(Str.replace(search, replace, this.value));
    }

    /**
     * Replace a given value in the string sequentially with an array.
     * @param search 搜索字符串
     * @param replace 替换字符串
     * @return Stringable
     */
    public Stringable replaceArray(String search, String[] replace) {
        return new Stringable(Str.replaceArray(search, replace, this.value));
    }

    /**
     * Replace the first occurrence of a given value in the string.
     * @param search 搜索字符串
     * @param replace 替换字符串
     * @return Stringable
     */
    public Stringable replaceFirst(String search, String replace) {
        return new Stringable(Str.replaceFirst(search, replace, this.value));
    }

    /**
     * Replace the last occurrence of a given value in the string.
     * @param search 搜索字符串
     * @param replace 替换字符串
     * @return Stringable
     */
    public Stringable replaceLast(String search, String replace) {
        return new Stringable(Str.replaceLast(search, replace, this.value));
    }

    /**
     * Begin a string with a single instance of a given value.
     * @param prefix 字符串前缀
     * @return Stringable
     */
    public Stringable start(String prefix) {
        return new Stringable(Str.start(this.value, prefix));
    }

    /**
     * Convert the given string to upper-case.
     * @return Stringable
     */
    public Stringable upper() {
        return new Stringable(Str.upper(this.value));
    }

    /**
     * Convert the given string to title case.
     * @return Stringable
     */
    public Stringable title() {
        return new Stringable(Str.title(this.value));
    }

    /**
     * Convert a string to snake case.
     * @return Stringable
     */
    public Stringable snake() {
        return new Stringable(Str.snake(this.value));
    }

    /**
     * Convert a string to snake case.
     * @param delimiter 分割符
     * @return Stringable
     */
    public Stringable snake(char delimiter) {
        return new Stringable(Str.snake(this.value, delimiter));
    }

    /**
     * Determine if a given string starts with a given substring.
     * @param needles 输入字符串
     * @return Boolean
     */
    public Boolean startsWith(String needles) {
        return Str.startsWith(this.value, needles);
    }

    /**
     * Determine if a given string starts with a given substring.
     * @param needles 输入字符串
     * @return Boolean
     */
    public Boolean startsWith(String[] needles) {
        return Str.startsWith(this.value, needles);
    }

    /**
     * Convert a value to studly caps case.
     * @return Stringable
     */
    public Stringable studly() {
        return new Stringable(Str.studly(this.value));
    }

    /**
     * Returns the portion of the string specified by the start and length parameters.
     * @param start 开始位置
     * @param length 长度
     * @return Stringable
     */
    public Stringable substr(int start, int length) {
        return new Stringable(Str.substr(this.value, start, length));
    }

    /**
     * Make a string's first character uppercase.
     * @return Stringable
     */
    public Stringable ucfirst() {
        return new Stringable(Str.ucfirst(this.value));
    }

    /**
     * Limit the number of words in a string.
     * @param words 多少个单词
     * @param end 结束符
     * @return Stringable
     */
    public Stringable words(int words, String end) {
        return new Stringable(Str.words(this.value, words, end));
    }

    /**
     * Trim the string of the given characters.
     * @return Stringable
     */
    public Stringable trim() {
        return new Stringable(PHPFunctions.trim(this.value));
    }

    /**
     * Left trim the string of the given characters.
     * @return Stringable
     */
    public Stringable ltrim() {
        return new Stringable(PHPFunctions.ltrim(this.value));
    }

    /**
     * Right trim the string of the given characters.
     * @return Stringable
     */
    public Stringable rtrim() {
        return new Stringable(PHPFunctions.rtrim(this.value));
    }

    @Override
    public String toString() {
        return this.value;
    }
}
