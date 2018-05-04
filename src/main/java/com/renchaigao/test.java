package com.renchaigao;

import com.renchaigao.answer.answerMapper;
import com.renchaigao.answer.oneAnswer;
import com.renchaigao.merge.merge;
import com.renchaigao.terms.everdayTerms;
import com.renchaigao.terms.termMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class test {

//    public static void main(String[] args) {
////        SpringApplication.run(DemoApplication.class, args);
//        mybatisInit batisinit = new mybatisInit();
//        System.out.println("*************begin**************");
////        SpringApplication.run(DemoApplication.class, args);
////        创建一个sql的会议，标准格式；
//        SqlSession sqlSession = batisinit.getSessionFactory().openSession();
//        //创建pojo的接口类，并用sql会议赋值，标准格式；
//        answerMapper answermapper = sqlSession.getMapper(answerMapper.class);
//        termMapper usmapper = sqlSession.getMapper(termMapper.class);
//        everdayTerms todayTerms = new everdayTerms();
//        oneAnswer oneanswer = new oneAnswer();
//        oneanswer = answermapper.getOneAnswerRecordingById(1);
//        System.out.println("oneanswer.path is : " + oneanswer.getPath());
//
////        oneanswer.setPath("d://adcdg");
////        answermapper.addOneAnswer(oneanswer);
////        Calendar todayCalendar;
////        Date todayDate = new Date();
////        todayTerms.setAddDay(merge.dateToString(new Date()));
////        todayTerms.setState("none2");
////        usmapper.addEverdayTerms(todayTerms);
////        List<everdayTerms> listEverTerms = usmapper.getEverdayTermByState("none");
////        List<everdayTerms> listEverTermsDate = usmapper.getEverdayTermByDate(merge.dateToString(new Date()));
//
////        System.out.println(listEverTermsDate.size());
////        System.out.println(listEverTermsDate.size() + listEverTermsDate.get(0).getState().toString());
//        sqlSession.commit();
//        System.out.println("**************end***************");
//    }



}
