package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/userList")
    public ModelAndView userList() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User(1001,"ray","张三那","123456","test@qq.com");
        modelAndView.addObject("user",user);
        modelAndView.setViewName("userList");
        return modelAndView;
    }


    @RequestMapping("/my")
    public ModelAndView userEdit() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("chart");
        return modelAndView;
    }

    @GetMapping("/checkTempChart")
    @ResponseBody
    public Person getPerson(Integer id) {
         Person person = new Person();
        person.setUsername("Ray");
        List<Weight> weights= new ArrayList<>();
        weights.add(new Weight(60, "5"));
        weights.add(new Weight(61, "6"));
        weights.add(new Weight(62, "7"));
        person.setWeights(weights);

        return person;
    }

    @GetMapping("/currentTemp")
    public ModelAndView currentTemp(Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("currentTempChart");
        return modelAndView;
    }

    @GetMapping("/tempInfoList")
    @ResponseBody
    public ModelAndView tempInfoList(Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tempInfoList");
        return modelAndView;
    }

    @GetMapping("/tempInfoChart")
    @ResponseBody
    public ModelAndView tempInfoChart() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tempInfoChart");
        return modelAndView;
    }

    @GetMapping("/checkCurrentTemp")
    @ResponseBody
    public List<Transducer> checkCurrentTemp(Integer id) {
        List<Transducer> transducers = new ArrayList<>();
        transducers.add(new Transducer(1L,"1",22.3));
        transducers.add(new Transducer(2L,"2",23.3));
        transducers.add(new Transducer(3L,"3",30));
        transducers.add(new Transducer(4L,"4",35));
        transducers.add(new Transducer(5L, "5", 12));
        return transducers;
    }

    @GetMapping("/transducerInfoChart")
    public ModelAndView transducerInfo() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("transducerInfoChart");
        return modelAndView;
    }

    @GetMapping("/checkTransducerInfo")
    @ResponseBody
    public List<Transducer> checkTransducerInfo() {

        return null;
    }


}