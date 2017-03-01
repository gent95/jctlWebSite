package com.jctl.cloud.utils;


import com.google.common.collect.Lists;
import org.apache.commons.lang3.ArrayUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/12/8 0008.
 */
public class StringUtils {
    private static Pattern numericPattern = Pattern.compile("^[0-9\\-]+$");
    private static Pattern floatNumericPattern = Pattern.compile("^[0-9\\-\\.]+$");
    private static Pattern abcPattern = Pattern.compile("^[a-z|A-Z]+$");

    private StringUtils() {
    }

    public static String convertObjectArrayToStr(Object[] objects, String spiltStr) {
        int size = objects.length;
        StringBuffer buffer = new StringBuffer();
        if(size > 0) {
            for(int i = 0; i < size; ++i) {
                if(objects[i] != null) {
                    buffer.append(objects[i]).append(spiltStr);
                }
            }

            if(buffer.toString().endsWith(spiltStr)) {
                buffer = buffer.deleteCharAt(buffer.length() - 1);
            }
        }

        return buffer.toString();
    }

    public static boolean isBlank(String input) {
        int strLen;
        if(input != null && (strLen = input.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if(!Character.isWhitespace(input.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isEmpty(String[] str) {
        return str == null || str.length == 0;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static boolean isNotBlank(String input) {
        return !isBlank(input);
    }

    public static void trimTrailingCharacter(StringBuffer buffer, char endChar) {
        if(buffer != null && buffer.length() > 0 && buffer.charAt(buffer.length() - 1) == endChar) {
            buffer.deleteCharAt(buffer.length() - 1);
        }

    }

    public static String trimWhitespace(String str) {
        if(!hasLength(str)) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder(str);

            while(sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
                sb.deleteCharAt(0);
            }

            while(sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
                sb.deleteCharAt(sb.length() - 1);
            }

            return sb.toString();
        }
    }

    public static String trimAllWhitespace(String str) {
        if(!hasLength(str)) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder(str);
            int index = 0;

            while(sb.length() > index) {
                if(Character.isWhitespace(sb.charAt(index))) {
                    sb.deleteCharAt(index);
                } else {
                    ++index;
                }
            }

            return sb.toString();
        }
    }

    public static String trimLeadingWhitespace(String str) {
        if(!hasLength(str)) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder(str);

            while(sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
                sb.deleteCharAt(0);
            }

            return sb.toString();
        }
    }

    public static String trimTrailingWhitespace(String str) {
        if(!hasLength(str)) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder(str);

            while(sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
                sb.deleteCharAt(sb.length() - 1);
            }

            return sb.toString();
        }
    }

    public static String trimLeadingCharacter(String str, char leadingCharacter) {
        if(!hasLength(str)) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder(str);

            while(sb.length() > 0 && sb.charAt(0) == leadingCharacter) {
                sb.deleteCharAt(0);
            }

            return sb.toString();
        }
    }

    public static String trimTrailingCharacter(String str, char trailingCharacter) {
        if(!hasLength(str)) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder(str);

            while(sb.length() > 0 && sb.charAt(sb.length() - 1) == trailingCharacter) {
                sb.deleteCharAt(sb.length() - 1);
            }

            return sb.toString();
        }
    }

    public static boolean startsWithIgnoreCase(String str, String prefix) {
        if(str != null && prefix != null) {
            if(str.startsWith(prefix)) {
                return true;
            } else if(str.length() < prefix.length()) {
                return false;
            } else {
                String lcStr = str.substring(0, prefix.length()).toLowerCase();
                String lcPrefix = prefix.toLowerCase();
                return lcStr.equals(lcPrefix);
            }
        } else {
            return false;
        }
    }

    public static boolean endsWithIgnoreCase(String str, String suffix) {
        if(str != null && suffix != null) {
            if(str.endsWith(suffix)) {
                return true;
            } else if(str.length() < suffix.length()) {
                return false;
            } else {
                String lcStr = str.substring(str.length() - suffix.length()).toLowerCase();
                String lcSuffix = suffix.toLowerCase();
                return lcStr.equals(lcSuffix);
            }
        } else {
            return false;
        }
    }

    public static boolean hasLength(CharSequence str) {
        return str != null && str.length() > 0;
    }

    public static String replace(String text, String repl, String with) {
        return replace(text, repl, with, -1);
    }

    public static String replace(String text, String repl, String with, int max) {
        if(!isEmpty(text) && !isEmpty(repl) && with != null && max != 0) {
            int start = 0;
            int end = text.indexOf(repl, start);
            if(end == -1) {
                return text;
            } else {
                int replLength = repl.length();
                int increase = with.length() - replLength;
                increase = increase < 0?0:increase;
                increase *= max < 0?16:(max > 64?64:max);

                StringBuffer buf;
                for(buf = new StringBuffer(text.length() + increase); end != -1; end = text.indexOf(repl, start)) {
                    buf.append(text.substring(start, end)).append(with);
                    start = end + replLength;
                    --max;
                    if(max == 0) {
                        break;
                    }
                }

                buf.append(text.substring(start));
                return buf.toString();
            }
        } else {
            return text;
        }
    }

    public static String[] split(String str, String separatorChars) {
        return splitWorker(str, separatorChars, -1, false);
    }

    private static String[] splitWorker(String str, String separatorChars, int max, boolean preserveAllTokens) {
        if(str == null) {
            return null;
        } else {
            int len = str.length();
            if(len == 0) {
                return ArrayUtils.EMPTY_STRING_ARRAY;
            } else {
                ArrayList list = Lists.newArrayList();
                int sizePlus1 = 1;
                int i = 0;
                int start = 0;
                boolean match = false;
                boolean lastMatch = false;
                if(separatorChars != null) {
                    if(separatorChars.length() != 1) {
                        label87:
                        while(true) {
                            while(true) {
                                if(i >= len) {
                                    break label87;
                                }

                                if(separatorChars.indexOf(str.charAt(i)) >= 0) {
                                    if(match || preserveAllTokens) {
                                        lastMatch = true;
                                        if(sizePlus1++ == max) {
                                            i = len;
                                            lastMatch = false;
                                        }

                                        list.add(str.substring(start, i));
                                        match = false;
                                    }

                                    ++i;
                                    start = i;
                                } else {
                                    lastMatch = false;
                                    match = true;
                                    ++i;
                                }
                            }
                        }
                    } else {
                        char sep = separatorChars.charAt(0);

                        label71:
                        while(true) {
                            while(true) {
                                if(i >= len) {
                                    break label71;
                                }

                                if(str.charAt(i) == sep) {
                                    if(match || preserveAllTokens) {
                                        lastMatch = true;
                                        if(sizePlus1++ == max) {
                                            i = len;
                                            lastMatch = false;
                                        }

                                        list.add(str.substring(start, i));
                                        match = false;
                                    }

                                    ++i;
                                    start = i;
                                } else {
                                    lastMatch = false;
                                    match = true;
                                    ++i;
                                }
                            }
                        }
                    }
                } else {
                    label103:
                    while(true) {
                        while(true) {
                            if(i >= len) {
                                break label103;
                            }

                            if(Character.isWhitespace(str.charAt(i))) {
                                if(match || preserveAllTokens) {
                                    lastMatch = true;
                                    if(sizePlus1++ == max) {
                                        i = len;
                                        lastMatch = false;
                                    }

                                    list.add(str.substring(start, i));
                                    match = false;
                                }

                                ++i;
                                start = i;
                            } else {
                                lastMatch = false;
                                match = true;
                                ++i;
                            }
                        }
                    }
                }

                if(match || preserveAllTokens && lastMatch) {
                    list.add(str.substring(start, i));
                }

                return (String[])((String[])list.toArray(new String[list.size()]));
            }
        }
    }

    public static String replaceAllChineseChar(String str) {
        return str.replaceAll("[^x00-xff]*", "");
    }

    public static String replactSpecialChar(String str) {
        String regEx = "[`~!@#$%^&*()+=|{}\':;\',//[//].<>/?~锛丂#锟�鈥︹�&*锛堬級鈥斺�+|{}銆愩�鈥橈紱锛氣�鈥溾�銆傦紝銆侊紵]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("");
    }

    public static int getNumber(String input) {
        String str = "";
        if(isNotBlank(input)) {
            for(int i = 0; i < input.length(); ++i) {
                if(input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                    str = str + input.charAt(i);
                }
            }
        }

        return isNotBlank(str)?Integer.parseInt(str):0;
    }

    public static String egnoreEmpty(String input) {
        return isEmpty(input)?"":input;
    }

    public static boolean isNumeric(String src) {
        boolean return_value = false;
        if(src != null && src.length() > 0) {
            Matcher m = numericPattern.matcher(src);
            if(m.find()) {
                return_value = true;
            }
        }

        return return_value;
    }

    public static boolean isABC(String src) {
        boolean return_value = false;
        if(src != null && src.length() > 0) {
            Matcher m = abcPattern.matcher(src);
            if(m.find()) {
                return_value = true;
            }
        }

        return return_value;
    }

    public static boolean isFloatNumeric(String src) {
        boolean return_value = false;
        if(src != null && src.length() > 0) {
            Matcher m = floatNumericPattern.matcher(src);
            if(m.find()) {
                return_value = true;
            }
        }

        return return_value;
    }

    public static String joinString(List array, String symbol) {
        String result = "";
        if(array != null) {
            for(int i = 0; i < array.size(); ++i) {
                String temp = array.get(i).toString();
                if(temp != null && temp.trim().length() > 0) {
                    result = result + temp + symbol;
                }
            }

            if(result.length() > 1) {
                result = result.substring(0, result.length() - 1);
            }
        }

        return result;
    }

    public static String joinString(String[] array, String symbol) {
        String result = "";
        if(array != null) {
            for(int i = 0; i < array.length; ++i) {
                String temp = array[i];
                if(temp != null && temp.trim().length() > 0) {
                    result = result + temp + symbol;
                }
            }

            if(result.length() > 1) {
                result = result.substring(0, result.length() - 1);
            }
        }

        return result;
    }

    public static int getStringLen(String SrcStr) {
        int return_value = 0;
        if(SrcStr != null) {
            char[] theChars = SrcStr.toCharArray();

            for(int i = 0; i < theChars.length; ++i) {
                return_value += theChars[i] <= 255?1:2;
            }
        }

        return return_value;
    }

    public static String formatFloat(float f, String format) {
        DecimalFormat df = new DecimalFormat(format);
        return df.format((double)f);
    }

    public static int toInt(String s) {
        if(s != null && !"".equals(s.trim())) {
            try {
                return Integer.parseInt(s);
            } catch (Exception var2) {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static double toDouble(String s) {
        return s != null && !"".equals(s.trim())?Double.parseDouble(s):0.0D;
    }

    public static long toLong(String s) {
        try {
            if(s != null && !"".equals(s.trim())) {
                return Long.parseLong(s);
            }
        } catch (Exception var2) {
            ;
        }

        return 0L;
    }

    public static Float toFloat(String s) {
        try {
            return Float.valueOf(Float.parseFloat(s));
        } catch (NumberFormatException var2) {
            return new Float(0.0F);
        }
    }

    public static String replaceBlank(String str) {
        if(str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            str = m.replaceAll("");
        }

        return str;
    }

    public static String stringReplace(String str, String sr, String sd) {
        Pattern p = Pattern.compile(sr, 2);
        Matcher m = p.matcher(str);
        str = m.replaceAll(sd);
        return str;
    }

    public static String replaceAll(String s, String sf, String sb) {
        int i = 0;
        boolean j = false;
        int l = sf.length();
        boolean b = true;
        boolean o = true;
        String str = "";

        do {
            int j1 = i;
            i = s.indexOf(sf, i);
            if(i > j1) {
                str = str + s.substring(j1, i);
                str = str + sb;
                i += l;
                o = false;
            } else {
                str = str + s.substring(j1);
                b = false;
            }
        } while(b);

        if(o) {
            str = s;
        }

        return str;
    }

    public static boolean isMatch(String str, String pattern) {
        Pattern pattern_hand = Pattern.compile(pattern);
        Matcher matcher_hand = pattern_hand.matcher(str);
        boolean b = matcher_hand.matches();
        return b;
    }

    public static String URLEncode(String src) {
        String return_value = "";

        try {
            if(src != null) {
                return_value = URLEncoder.encode(src, "GBK");
            }
        } catch (UnsupportedEncodingException var3) {
            var3.printStackTrace();
            return_value = src;
        }

        return return_value;
    }

    public static <T> String listTtoString(List<T> list) {
        if(list != null && list.size() >= 1) {
            Iterator i = list.iterator();
            if(!i.hasNext()) {
                return "";
            } else {
                StringBuilder sb = new StringBuilder();

                while(true) {
                    Object e = i.next();
                    sb.append(e);
                    if(!i.hasNext()) {
                        return sb.toString();
                    }

                    sb.append(",");
                }
            }
        } else {
            return "";
        }
    }

    public static String full2Half(String str) {
        if(str != null && !"".equals(str)) {
            StringBuffer sb = new StringBuffer();

            for(int i = 0; i < str.length(); ++i) {
                char c = str.charAt(i);
                if(c >= '！' && c < '｝') {
                    sb.append((char)(c - 'ﻠ'));
                } else {
                    sb.append(str.charAt(i));
                }
            }

            return sb.toString();
        } else {
            return "";
        }
    }

    public static String replaceBracketStr(String str) {
        if(str != null && str.length() > 0) {
            str = str.replaceAll("（", "(");
            str = str.replaceAll("）", ")");
        }

        return str;
    }

    public static Map<String, String> parseQuery(String query, char split1, char split2, String dupLink) {
        if(!isEmpty(query) && query.indexOf(split2) > 0) {
            HashMap result = new HashMap();
            String name = null;
            String value = null;
            String tempValue = "";
            int len = query.length();

            for(int i = 0; i < len; ++i) {
                char c = query.charAt(i);
                if(c == split2) {
                    value = "";
                } else if(c == split1) {
                    if(!isEmpty(name) && value != null) {
                        if(dupLink != null) {
                            tempValue = (String)result.get(name);
                            if(tempValue != null) {
                                value = value + dupLink + tempValue;
                            }
                        }

                        result.put(name, value);
                    }

                    name = null;
                    value = null;
                } else if(value != null) {
                    value = value + c;
                } else {
                    name = name != null?name + c:"" + c;
                }
            }

            if(!isEmpty(name) && value != null) {
                if(dupLink != null) {
                    tempValue = (String)result.get(name);
                    if(tempValue != null) {
                        value = value + dupLink + tempValue;
                    }
                }

                result.put(name, value);
            }

            return result;
        } else {
            return null;
        }
    }

    public static String listToStringSlipStr(List list, String slipStr) {
        StringBuffer returnStr = new StringBuffer();
        if(list != null && list.size() > 0) {
            for(int i = 0; i < list.size(); ++i) {
                returnStr.append(list.get(i)).append(slipStr);
            }
        }

        return returnStr.toString().length() > 0?returnStr.toString().substring(0, returnStr.toString().lastIndexOf(slipStr)):"";
    }

    public static String getMaskStr(String str, int start, int len) {
        if(isEmpty(str)) {
            return str;
        } else if(str.length() < start) {
            return str;
        } else {
            String ret = str.substring(0, start);
            int strLen = str.length();
            if(strLen < start + len) {
                len = strLen - start;
            }

            for(int i = 0; i < len; ++i) {
                ret = ret + "*";
            }

            if(strLen > start + len) {
                ret = ret + str.substring(start + len);
            }

            return ret;
        }
    }

    public static String getHtmlSubString(String str, int len, String tail) {
        if(str != null && str.length() > len) {
            int length = str.length();
            boolean c = true;
            String tag = null;
            String name = null;
            boolean size = false;
            String result = "";
            boolean isTag = false;
            ArrayList tags = new ArrayList();
            int i = 0;
            int i$ = 0;

            for(boolean endTag = false; i < length && len > 0; ++i) {
                char var15 = str.charAt(i);
                if(var15 == 60) {
                    i$ = str.indexOf(62, i);
                }

                if(i$ > 0) {
                    tag = str.substring(i, i$ + 1);
                    int n = tag.length();
                    if(tag.endsWith("/>")) {
                        isTag = true;
                    } else if(tag.startsWith("</")) {
                        name = tag.substring(2, i$ - i);
                        int var16 = tags.size() - 1;
                        if(var16 >= 0 && name.equals(tags.get(var16))) {
                            isTag = true;
                            tags.remove(var16);
                        }
                    } else {
                        int var18 = tag.indexOf(32, 0);
                        var18 = var18 > 0?var18:n;
                        name = tag.substring(1, var18);
                        if(name.trim().length() > 0) {
                            var18 = str.indexOf("</" + name + ">", i$);
                            if(var18 > 0) {
                                isTag = true;
                                tags.add(name);
                            }
                        }
                    }

                    if(!isTag) {
                        if(n >= len) {
                            result = result + tag.substring(0, len);
                            break;
                        }

                        len -= n;
                    }

                    result = result + tag;
                    isTag = false;
                    i = i$;
                    i$ = 0;
                } else {
                    --len;
                    result = result + var15;
                }
            }

            String var19;
            for(Iterator var17 = tags.iterator(); var17.hasNext(); result = result + "</" + var19 + ">") {
                var19 = (String)var17.next();
            }

            if(i < length) {
                result = result + tail;
            }

            return result;
        } else {
            return str;
        }
    }

    public static String getEncodePra(String property) {
        String trem = "";
        if(isNotEmpty(property)) {
            try {
                trem = URLDecoder.decode(property, "UTF-8");
            } catch (UnsupportedEncodingException var3) {
                var3.printStackTrace();
            }
        }

        return trem;
    }

    public boolean isDigit(String strNum) {
        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher = pattern.matcher(strNum);
        return matcher.matches();
    }

    public String getNumbers(String content) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(content);
        return matcher.find()?matcher.group(0):"";
    }

    public String splitNotNumber(String content) {
        Pattern pattern = Pattern.compile("\\D+");
        Matcher matcher = pattern.matcher(content);
        return matcher.find()?matcher.group(0):"";
    }

    public static boolean contains(String[] stringArray, String source) {
        List tempList = Arrays.asList(stringArray);
        return tempList.contains(source);
    }

    public static Object ifNullReturnEmpty(Object obj) {
        return obj == null?"":obj;
    }
}
