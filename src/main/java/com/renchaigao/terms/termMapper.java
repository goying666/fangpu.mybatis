package com.renchaigao.terms;

import java.util.List;

public interface termMapper {

    Integer addEverdayTerms(everdayTerms everdayTerms);

    List<everdayTerms> getEverdayTermByDate(String todayDate);

    List<everdayTerms> getEverdayTermByState(String state);
}
