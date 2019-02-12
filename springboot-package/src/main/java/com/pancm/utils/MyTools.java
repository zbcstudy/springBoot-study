package main.java.com.pancm.utils;

import java.util.List;
import java.util.Map;

/**
 * @Author zbc
 * @Date 17:18-2019/2/12
 */
public class MyTools {
    public MyTools() {
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static boolean isEmpty(List<?> list) {
        return list == null || list.size() == 0;
    }

    public static boolean isNotEmpty(List<?> list) {
        return !isEmpty(list);
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.size() == 0;
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }
}
