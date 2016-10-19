package com.lb.ssm.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 日期转换工具类
 * @author liubin
 *
 */
public class DateUtil {
	
	/**
	 * 获得当前系统的时间yyyy-MM-dd
	 * 
	 * @return
	 */
	public static String getSystemDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");// 设置日期格式
		return df.format(new Date());
	}

	/**
	 * 
	 * @Description: 将yyyy-MM-dd转成long
	 * @param date
	 *            yyyy-MM-dd字符串
	 * @return
	 */
	public static long getDateLong(String date) {
		long dateLong = 0;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date newDate = df.parse(date);
			dateLong = newDate.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateLong;
	}

	/**
	 * 获得当前系统的时间yyyy-MM-dd hh:mm:ss
	 * 
	 * @return
	 */
	public static String getSystemDate1() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		return df.format(new Date());
	}

	/**
	 * 获得当前系统的时间yyyy-MM-dd
	 * 
	 * @return
	 */
	public static String getSystemDate2() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");// 设置日期格式
		return df.format(new Date());
	}

	/**
	 * 获得当前系统的时间yyyy-MM-dd
	 * 
	 * @return
	 */
	public static String getSystemDate3() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");// 设置日期格式
		return df.format(new Date());
	}
	
	
	/**
	 * @Description: 获取指定时间的MM/dd
	 * @param time
	 * @return
	 */
	public static String getMMDD(String yyyyMMDD) {
		return yyyyMMDD.substring(5, 7) + "月" + yyyyMMDD.substring(8, 10);
	}

	/**
	 * @Description: 获取指定时间的MM/dd
	 * @param time
	 * @return
	 */
	public static String getMMMonthDD(String yyyyMMDD) {
		return yyyyMMDD.substring(5, 7) + "月" + yyyyMMDD.substring(8, 10) + "日";
	}

	/**
	 * @Description: 获取指定时间的MM-dd
	 * @param time
	 * @return
	 */
	public static String getMM_DD(String  MMMonthDD) {
		if(MMMonthDD.length()>5 && MMMonthDD.matches("^[0-9]{2}月[0-9]{2}日$")){
			return MMMonthDD.substring(0, 2) + "-" + MMMonthDD.substring(3, 5);
		}else {
			return MMMonthDD;
		}
	}
	
	/**
	 * @Description: 获取系统时间的 小时和分钟
	 * @return
	 */
	public static String getCurrTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		return calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.SECOND);
	}

	/**
	 * @Description: 获取周
	 * @return
	 */
	public static String getCurrWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int weekNum = calendar.get(Calendar.DAY_OF_WEEK);
		if (weekNum == Calendar.SUNDAY) {
			return "周日";
		} else if (weekNum == Calendar.MONDAY) {
			return "周一";
		} else if (weekNum == Calendar.TUESDAY) {
			return "周二";
		} else if (weekNum == Calendar.WEDNESDAY) {
			return "周三";
		} else if (weekNum == Calendar.THURSDAY) {
			return "周四";
		} else if (weekNum == Calendar.FRIDAY) {
			return "周五";
		} else {
			return "周六";
		}
	}
	
	public static int getWeekLong(String str) throws Exception {
		long time = Long.parseLong(str);
	    Date date = new Date(time);
	    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
	    String date1 = sd.format(date);
		Date date2 = sd.parse(date1);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date2);
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}
	
	/**
	 * 将日期转化成周数 （本年度第几周）
	 * 
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static int getWeekCount(String str) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}
	

	/**
	 * 将日期转化成周数 （本年度第几周）
	 * 
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static int getWeekCount2(String str) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}

	
	/**
	 * 获得本周一0点时间
	 * 
	 * @return
	 */
	public static Date getTimesWeekmorning() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return cal.getTime();
	}

	/**
	 * 获得本周日24点时间
	 * 
	 * @return
	 */
	public static Date getTimesWeeknight() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getTimesWeekmorning());
		cal.add(Calendar.DAY_OF_WEEK, 7);
		return cal.getTime();
	}

	
}
