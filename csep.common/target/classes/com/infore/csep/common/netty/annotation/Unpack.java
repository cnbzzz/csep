package com.infore.csep.common.netty.annotation;

import java.lang.annotation.*;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/3/29 10:10
 * Copyright (c) 2018 github.com/cnbzzz
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Unpack {
    int index() default -1;
    String idxRef() default "";
    int length() default -1;
    String lenRef() default "";
}
