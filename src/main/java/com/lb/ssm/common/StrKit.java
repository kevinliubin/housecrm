package com.lb.ssm.common;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;

import com.google.common.collect.Lists;

/**
 * @auth jzx
 * @desc 字符操作工具类
 * @date 2016.6.9
 */
public  class StrKit {
	public static String random(int bit) {
		if (bit == 0)
			bit = 6; // 默认6位
		// 因为o和0,l和1很难区分,所以,去掉大小写的o和l
		String str = "";
		str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkmnpqrstuvwxyz";// 初始化种子
		return RandomStringUtils.random(bit, str);// 返回6位的字符串
	}
	/**
	 * 首字母变小写
	 */
	public static String firstCharToLowerCase(String str) {
		char firstChar = str.charAt(0);
		if (firstChar >= 'A' && firstChar <= 'Z') {
			char[] arr = str.toCharArray();
			arr[0] += ('a' - 'A');
			return new String(arr);
		}
		return str;
	}
	
	 /**
     * 判断对象是否不为null
     *
     * @param object 需要判断的对象
     * @return 是否不为null
     */
    public static boolean nonNull(Object object) {
        return null != object;
    }
    
	public static boolean isEmpty(String str) {
		return str == null || "".equals(str);
	}

	public static boolean notEmpty(String str) {
		return str != null && !"".equals(str);
	}

	public static String trimStr(String str) {
		return str.trim();
	}

	public static String[] trimStr(String... args) {
		List<String> array = Lists.newArrayList();
		for (int i = 0; i < args.length; i++) {
			array.add(args[i].trim());
		}
		return converStr(array);
	}

	public static String[] trimStr(Collection<String> collection) {
		return trimStr(converStr(collection));
	}

	public static String[] converStr(Collection<String> collection) {
		String[] o = new String[collection.size()];
		collection.toArray(o);
		return o;
	}

	/**
	 * 在集合中拿到指定字段，并转换成String 数组
	 * 
	 * @param map
	 * @param getKey
	 * @return
	 */
	public static String[] converStr(List<Map<String, Object>> map, String getKey) {
		List<String> array = Lists.newArrayList();
		for (Map<String, Object> m : map) {
			array.add((String) m.get(getKey));
		}
		return converStr(array);
	}

	/**
	 * 输入起始位置直接截取到最后
	 */
	public static String strSubstringEnd(String str, int beginIndex) {
		return strSubstringBetween(str, beginIndex, str.length() - 1);
	}

	public static String strSubstringBetween(String str, int beginIndex, int endIndex) {
		return str.substring(beginIndex, endIndex);
	}

	public static char getCharAt(String str, int index) {
		return str.charAt(index);
	}
	
	public static char [] getCharArray(String str) {
		return str.toCharArray();
	}
	
	public static String[] spilt(String str, String pattern) {
		return str.split(pattern);
	}
	
	public static String getYear() {
		return commonTime("%tY");
	}
	
	public static String getMonth() {
		return commonTime("%tm");
	}
	
	public static String getDay() {
		return commonTime("%td");
	}
	
	// 2016-7-7 新加入方法
	public static String getHour() {
		return commonTime("%tH");
	}
	
	private static String commonTime(String timeType) {
		Date date = new Date();
		Locale form = Locale.CHINA;
		String time = String.format(form, timeType, date);
		return time;
	} 
	
	public static String getNowTime() {
		Date date = new Date();
		Locale form = Locale.CHINA;
		String now = String.format(form, "%tY-%tm-%td %tH:%tM:%tS", date,date,date,date,date,date);
		return now;
	}
	
	public static void mapValue(Map<String,String> map) {
		for(Map.Entry<String, String> m : map.entrySet()) {
			if(map.get(m.getKey()) == null) {
				map.put(m.getKey(), "");
			}
		}
	}

	public static String[] spilt(String str, String... patterns) {
		List<String[]> strList = Lists.newArrayList();
		String[] temp = str.split(patterns[0]);
		String[] t = null;
		if (patterns.length > 2) {
			for (int j = 0; j < temp.length; j++) {
				for (int i = 1; i < patterns.length; i++) {
					t = temp[j].split(patterns[i]);
				}
				strList.add(t);
			}
		}
		return temp;
	}

	/**
	 * 对象NULL处理
	 */
	public static String null2Blank(Object o) {
		String result = "";
		if (o == null || "null".equals(o)) {
			result = "";
		} else {
			if (o instanceof Integer ||o instanceof Double ) {
				result = String.valueOf(o);
			} else if (o instanceof Timestamp || o instanceof Date) {
				Timestamp ts = (Timestamp) o;
				DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				try {
					result = sdf.format(ts);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else{
				result = (String) o;
			}
		}

		return result;
	}
	
}
