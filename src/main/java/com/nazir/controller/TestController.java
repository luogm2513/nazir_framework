package com.nazir.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nazir.controller.base.BaseController;
import com.nazir.model.User;
import com.nazir.service.TestService;

/**
 * @Type TestController
 * @Desc 测试
 * @author luogm
 * @date 2016年8月03日
 * @Version V1.0
 */
@Controller
@RequestMapping("/user")
public class TestController extends BaseController{
	
	private final static Logger logger = LoggerFactory.getLogger(TestController.class);
			
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public User test(String test) {
        logger.info("logback 成功了");
        logger.error("logback 成功了");
        User user = testService.getById(1L);
        return user;
    }
}
