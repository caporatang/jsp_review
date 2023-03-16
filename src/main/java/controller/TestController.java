package controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * packageName : controller
 * fileName : TestController
 * author : taeil
 * date : 2023/03/16
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2023/03/16        taeil                   최초생성
 */
@Controller
@Slf4j
public class TestController {

//    @RequestMapping("/")
//    public String indexTest(Model model) {
//        System.out.println("나는 jspTest");
//        String name = "taeil";
//        model.addAttribute("name", name);
//
//        return "index";
//    }

    @RequestMapping("/memberLogin")
    public String testJsp(Model model) {
        System.out.println("나는 jspTest");
        String name = "taeil";
        model.addAttribute("name", name);

        return "memberLogin";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        System.out.println("인덱스");
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate );
        System.out.println("나는 model.getAttribute" + model.getAttribute("serverTime"));
        return "index";
    }
}