package com.infore.csep.common.service;

import com.infore.csep.pojo.entity.*;

import java.util.List;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/23 18:08
 * Copyright (c) 2018 github.com/cnbzzz
 */
public interface IJsWorker {

    List<Factleachalarm> gainFactleachalarmArray(Factleach factleach);

    List<Factsewaalarm> gainFactsewaalarmArray(Factsewa factsewa);

    List<Gpssewaalarm> gainGpssewaalarmArry(Gpssewa gpssewa);
}
