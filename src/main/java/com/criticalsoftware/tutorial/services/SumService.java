package com.criticalsoftware.tutorial.services;

import com.criticalsoftware.tutorial.pojo.SumPOJO;

public class SumService {

    public static Integer sum(SumPOJO object) {
        return object.getNumA() + object.getNumB();
    }

}
