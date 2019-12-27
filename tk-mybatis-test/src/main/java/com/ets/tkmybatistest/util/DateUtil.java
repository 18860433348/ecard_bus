package com.ets.tkmybatistest.util;

import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 日期公共类
 *
 * @author JiC
 * @date 2019-07-02 11:29
 */
public final class DateUtil {

    public static final String PATTERN_STANDARD = "yyyy-MM-dd HH:mm:ss";

    public static final String PATTERN_STANDARD1 = "yyyyMMddHHmmss";

    public static final String PATTERN_DATE = "yyyy-MM-dd";

    public static final String PATTERN_DATE1 = "yyyyMMdd";

    public static final String PATTERN_TIME = "HH:mm:ss";

    public static final String PATTERN_DATE_MOUNTH = "yyyy-MM";

    public static final String SYS_DEFAUL_MXTIME = "2099-12-31 23:59:59";

    // 时间正则校验HHmm格式
    private static final Pattern pattern = Pattern.compile("^(0\\d{1}|1\\d{1}|2[0-3])([0-5]\\d{1})$");

    /**
     * 根据正则表达式校验时间格式
     * @param time 时间HHmm
     * @return true表示格式正确，false表示格式错误
     */
    public static boolean patternFormat(String time){
        return pattern.matcher(time).matches();
    }

    /**
     * @param date    日期
     * @param pattern 格式
     * @Description: 日期转字符串
     * @author JiC
     * @date 2019/3/1
     */
    public static String dateToString(Date date, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }

    /**
     * @Description: 当前时间转字符串
     * @author JiC
     * @date 2019/7/2
     */
    public static String currentDateTime() {
        return dateToString(LocalDateTime.now(), PATTERN_STANDARD);
    }

    /**
     * @Description: 日期转字符串
     * temporal: 实现类
     * LocalDate： 本地日期 -> 2019-04-10
     * LocalTime： 本地时间 -> 23:14:42.994
     * LocalDateTime： 本地日期时间 -> 2019-04-10T23:14:42.994
     * @author JiC
     * @date 2019/7/2
     */
    public static String dateToString(Temporal temporal) {
        String formatter;
        if (temporal instanceof LocalDateTime) {
            formatter = PATTERN_STANDARD;
        } else if (temporal instanceof LocalDate) {
            formatter = PATTERN_DATE;
        } else if (temporal instanceof LocalTime) {
            formatter = PATTERN_TIME;
        } else {
            throw new RuntimeException("时间类型错误");
        }
        return dateToString(temporal, formatter);
    }

    /**
     * @Description: 日期转字符串
     * @author JiC
     * @date 2019/7/2
     */
    public static String dateToString(Temporal temporal, String formatter) {
        return dateToString(temporal, DateTimeFormatter.ofPattern(formatter));
    }

    /**
     * @Description: 日期转字符串
     * @author JiC
     * @date 2019/7/2
     */
    public static String dateToString(Temporal temporal, DateTimeFormatter formatter) {
        return formatter.format(temporal);
    }

    //字符串转日期
    public static Date stringToDate(String time, String formatter) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(formatter);
            date = sdf.parse(time);
        } catch (Exception e) {
            throw new RuntimeException("时间类型错误");
        }
        return date;
    }

    /**
     * 时间戳转date
     *
     * @param timestamp System.currentTimeMillis()
     * @return
     */
    public static Date timestampToDate(long timestamp) {
        Timestamp ts = new Timestamp(timestamp);
        Date date = new Date();
        try {
            date = ts;
        } catch (Exception e) {
            e.printStackTrace();
            date = null;
        }
        return date;
    }

    private DateUtil() {
        throw new IllegalAccessError();
    }

    public static boolean validTimePattern(String timeStr, String pattern){
        boolean convertSuccess = true;
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        if(StringUtils.isEmpty(timeStr) || StringUtils.isEmpty(pattern)){
            throw new IllegalAccessError();
        }
        try {
            // 设置lenient为false.
            // 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(true);
            format.parse(timeStr);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }

    /**
     * 获得指定日期的前一天
     *
     * @param specifiedDay
     * @return
     * @throws Exception
     */
    public static String getSpecifiedDayBefore(String specifiedDay) {
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day - 1);

        String dayBefore = new SimpleDateFormat("yyyy-MM-dd").format(c
                .getTime());
        return dayBefore;
    }

    /**
     * 获得指定日期的后一天
     *
     * @param specifiedDay
     * @return
     */
    public static String getSpecifiedDayAfter(String specifiedDay) {
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day + 1);

        String dayAfter = new SimpleDateFormat("yyyy-MM-dd")
                .format(c.getTime());
        return dayAfter;
    }

    /**
     * 说明：计算月份前后几个月
     *
     * @param date ：待计算月份
     * @param n ：正负数表示往后、往前计算n个月
     *
     * */
    public static String getPrevMonthDateYYYYMM(Date date,int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + n);
        return new SimpleDateFormat("yyyy-MM").format(calendar.getTime());
    }

    /**
     * 说明：计算日期前后几个月
     *
     * @param date ：待计算日期
     * @param n ：正负数表示往后、往前计算n个月
     *
     * */
    public static String getPrevMonthDateYYYYMMDD(Date date,int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + n);
        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }

    public static void main(String[] args) throws ParseException {
        String time = "20190924135215";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(stringToDate(time,DateUtil.PATTERN_STANDARD1));
    }


}
