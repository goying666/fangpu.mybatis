package com.renchaigao.merge;

import java.util.Calendar;
import java.util.Date;

public class merge {

    public String strArgToStr(String[] strArg){
        String retString = "";
        for (String i : strArg){
            retString = retString + "\t" + i;
        }
        return retString;
    }

//    专门为每日十条开发的每日时间转换函数，功能就是将当天（取词条）的日子转换成“2018-0-01”这种格式；
    public static String dateToString(Date todayDate){
        String ret = null;
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(todayDate);

        System.out.println("现在时间是："+new Date());

        String year=String.valueOf(calendar.get(Calendar.YEAR));
        String month=String.valueOf(calendar.get(Calendar.MONTH));
        String day=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
//        String week=String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)-1);
        ret = year +"-"+ month +"-"+ day;
//        System.out.println("现在时间是："+year+"年"+month+"月"+day+"日，星期"+week);
//        long year2009=calendar.getTimeInMillis();
//        calendar.set(1989,9,26);//这里与真实的月份之间相差1
//        long year1989=calendar.getTimeInMillis();
//        long days=(year2009-year1989)/(1000*60*60*24);
//        System.out.println("今天和1989年10月26日相隔"+days+"天，"+"也就是说我在这个美丽的星球上已经幸福的生活了"+days+"天。");
        return ret;
    }

    public String[] strAllToStrArg(String strAll , String cutStr){
        return strAll.split(cutStr);
    }
}
