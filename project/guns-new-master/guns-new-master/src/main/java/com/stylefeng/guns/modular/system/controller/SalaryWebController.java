package com.stylefeng.guns.modular.system.controller;

import com.stylefeng.guns.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Cherish on 2017/7/5.
 */
@Controller
@RequestMapping("/salaryWeb")
public class SalaryWebController extends BaseController {

    private static String PREFIX = "/Salaryweb/";
    /**
     * 跳转到查看管理员列表的页面
     */
    @RequestMapping("/about")
     public String about() {
        return PREFIX + "about.html";
    }

    @RequestMapping("/services")
    public String services() {
        return PREFIX + "services.html";
    }

    @RequestMapping("/portfolio3col")
    public String portfolio3col() {
        return PREFIX + "portfolio3col.html";
    }

    @RequestMapping("/blog")
    public String blog() {
        return PREFIX + "blog.html";
    }

    @RequestMapping("/blogSingle")
    public String blogSingle() {
        return PREFIX + "blog-single.html";
    }


}
