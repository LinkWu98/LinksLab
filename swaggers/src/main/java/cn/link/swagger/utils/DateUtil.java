package cn.link.swagger.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/**
 * @author Link50
 * @version 1.0
 * @date 2020/11/16 16:18
 */
public class DateUtil {

    /**
     * 年月日时分秒
     */
    public static final String COMMON_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 年月日
     */
    public static final String PATTERN1 = "yyyy-MM-dd";

    /**
     * 年月日时分
     */
    public static final String PATTERN2 = "yyyy-MM-dd HH:mm";

    /**
     * 年月日时分
     */
    public static final String PATTERN3 = "yyyy/MM/dd HH:mm";

    /**
     * 年月日时分
     */
    public static final String PATTERN4 = "yyyy/MM/dd";

    private static Calendar initCalendar() {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        return calendar;
    }

    public static SimpleDateFormat initFormat(String formatPattern) {

        SimpleDateFormat format;
        if (formatPattern == null || "".equals(formatPattern)) {
            format = new SimpleDateFormat(COMMON_PATTERN);
        } else {
            format = new SimpleDateFormat(formatPattern);
        }
        return format;

    }

    public static SimpleDateFormat commonPattern() {
        return new SimpleDateFormat(COMMON_PATTERN);
    }


    /**
     * 日期转为指定字符串格式
     *
     * @param formatPattern
     * @param date
     * @return
     */
    public static String formatToStr(String formatPattern, Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat format = initFormat(formatPattern);
        return format.format(date);
    }

    /**
     * date 转为指定格式 date
     *
     * 本质是重置时分秒为 0
     *
     * @param formatPattern
     * @param date
     * @return
     */
    public static Date formatToDate(String formatPattern, Date date) throws ParseException {

        if (date == null) {
            return null;
        }

        SimpleDateFormat format = initFormat(formatPattern);

        return format.parse(format.format(date));

    }

    /**
     * 指定指定格式日期字符串转为 date
     * @param formatPattern
     * @param dateTimeStr
     * @return
     */
    public static Date getDateByDateTimeStr(String formatPattern, String dateTimeStr) throws ParseException {

        if (dateTimeStr == null || "".equals(dateTimeStr)) {
            return null;
        }

        SimpleDateFormat format = initFormat(formatPattern);

        return format.parse(dateTimeStr);

    }

    /**
     * 获取本周周一的最早的时间
     *
     * @return
     */
    public static Date getEarliestDateTimeOfThisWeek() {

        Calendar calendar = initCalendar();
        setEarliestDateTime(calendar);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return calendar.getTime();

    }

    /**
     * 获取本周周日的最晚的时间
     *
     * @return
     */
    public static Date getLatestDateTimeOfThisWeek() {

        Calendar calendar = initCalendar();
        setLatestDateTime(calendar);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return calendar.getTime();

    }

    /**
     * 获取本月最早的时间
     *
     * @return
     */
    public static Date getEarliestDateTimeOfThisMonth() {

        Calendar calendar = initCalendar();
        setEarliestDateTime(calendar);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();

    }

    /**
     * 获取本月最晚的时间
     *
     * @return
     */
    public static Date getLatestDateTimeOfThisMonth() {

        Calendar calendar = initCalendar();
        setLatestDateTime(calendar);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();

    }

    /**
     * 获取一天最早的时间
     *
     * @param date param
     * @return
     */
    public static Date getEarliestTimeOfDay(Date date) {

        if (date == null) {
            return null;
        }

        Calendar calendar = initCalendar();
        calendar.setTime(date);
        setEarliestDateTime(calendar);
        return calendar.getTime();

    }

    /**
     * 获取一天最晚的时间
     *
     * @param date param
     * @return
     */
    public static Date getLatestTimeOfDay(Date date) {

        Calendar calendar = initCalendar();
        calendar.setTime(date);
        setLatestDateTime(calendar);
        return calendar.getTime();

    }

    /**
     * 获取本周每天日期的字符串
     *
     * @param formatPattern 格式
     * @return 本周每天日期的字符串
     */
    public static List<String> getEveryDayStrOfThisWeek(String formatPattern) {

        Calendar begin = initCalendar();
        begin.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        Calendar end = initCalendar();
        end.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);

        return getEveryDayStrBetweenRequiredDate(formatPattern, begin.getTime(), end.getTime());

    }

    /**
     * 获取一个月中的每一天的日期字符串
     *
     * @param formatPattern
     * @return
     */
    public static List<String> getEveryDayStrOfThisMonth(String formatPattern) {

        List<String> dateStrList = new ArrayList<>();

        SimpleDateFormat format = initFormat(formatPattern);

        Calendar calendar = initCalendar();
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= maxDayOfMonth; i++) {

            calendar.set(Calendar.DAY_OF_MONTH, i);
            dateStrList.add(format.format(calendar.getTime()));

        }

        return dateStrList;

    }

    /**
     * 获取指定时间范围内的每一天日期字符串
     *
     * @param formatPattern 格式
     * @param startDate     开始时间
     * @param endDate       结束时间
     * @return 日期字符串
     */
    public static List<String> getEveryDayStrBetweenRequiredDate(String formatPattern, Date startDate, Date endDate) {

        SimpleDateFormat format = initFormat(formatPattern);

        List<String> dateStrList = new ArrayList<>();

        Calendar begin = initCalendar();
        begin.setTime(startDate);
        Calendar end = initCalendar();
        end.setTime(endDate);

        while (!begin.getTime().after(end.getTime())) {
            String dateStr = format.format(begin.getTime());
            dateStrList.add(dateStr);
            begin.add(Calendar.DAY_OF_MONTH, 1);
        }

        return dateStrList;

    }

    /**
     * 起止日期是否合法校验
     * <p>
     * 一旦其中一个为空直接 false
     *
     * @param startDateTime
     * @param endDateTime
     * @return true - valid
     */
    public static boolean checkStartEndValidation(Date startDateTime, Date endDateTime) {

        if (startDateTime == null || endDateTime == null) {
            return false;
        }

        return endDateTime.after(startDateTime);

    }

    private static void setEarliestDateTime(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
    }

    private static void setLatestDateTime(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
    }

    /**
     * 返回的格式为 自定义
     */
    public static String getCurrTime(String formatStr) {
        Calendar calendar = Calendar.getInstance();
        return TimeParse(calendar.getTime(), formatStr);
    }

    /**
     * 返回的格式为自定义
     *
     * @param time
     * @return
     */
    public static String TimeParse(Date time, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(time);
    }

    public static Date getYearMonthFirst(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        if (Objects.isNull(month) || Objects.isNull(year)) {
            return null;
        } else {
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,month-1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.clear(Calendar.MINUTE);
            calendar.clear(Calendar.SECOND);
            return calendar.getTime();
        }
    }

    public static Date getYearMonthLast(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        if (Objects.isNull(month) || Objects.isNull(year)) {
            return null;
        } else {
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,month);
            calendar.set(Calendar.DAY_OF_MONTH, 0);
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.clear(Calendar.MINUTE);
            calendar.clear(Calendar.SECOND);
            return calendar.getTime();
        }
    }


    public static Integer getYearMonthDays(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        if (Objects.isNull(month) || Objects.isNull(year)) {
            return null;
        } else {
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,month-1);
            return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        }
    }

    /**
     * 获取指定：年、月的最后一天最后一分钟的时间
     */
    public static Date getLatestDateTimeOfMonthByConditions(Integer year, Integer month) {

        Calendar calendar = initCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        setLatestDateTime(calendar);
        return calendar.getTime();

    }

    /**
     * 获取指定：年、月的的第一天0点时间
     */
    public static Date getEarliestDateTimeOfMonthByConditions(Integer year, Integer month) {

        Calendar calendar = initCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        setEarliestDateTime(calendar);
        return calendar.getTime();

    }

    public static Date addDayOfDate(Date date, int addDay) {

        Calendar calendar = initCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, addDay);

        return calendar.getTime();

    }
}
