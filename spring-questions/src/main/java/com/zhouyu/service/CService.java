package com.zhouyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： li
 * @date： 2024/9/11 16:34
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
@Component
public class CService {
    @Autowired
    private AService aService;
}
