package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloBeetlController {

    private static Logger logger = LoggerFactory.getLogger(HelloBeetlController.class);

    /**
     * 测试beetl模板
     *
     * @return
     */
    @RequestMapping("/add")
    public ModelAndView home() {

        ModelAndView modelAndView = new ModelAndView();
        logger.info("add request");
        modelAndView.addObject("email", "apk2sf@163.com");
        modelAndView.setViewName("index");

        return modelAndView;
    }

    @RequestMapping("/house_list")
    public ModelAndView list() {

        ModelAndView modelAndView = new ModelAndView();
        logger.info("add request");
        modelAndView.addObject("email", "apk2sf@163.com");
        modelAndView.setViewName("house_list");

        return modelAndView;
    }

    @RequestMapping("/loupanchart")
    public ModelAndView loupanchart() {

        ModelAndView modelAndView = new ModelAndView();
        logger.info("add request");
        modelAndView.addObject("email", "apk2sf@163.com");
        modelAndView.setViewName("loupanchart");

        return modelAndView;
    }

    @RequestMapping("/logout")
    public ModelAndView logout() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");

        return modelAndView;
    }


}