package team5.ourstore.Store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("home-page");
        return mv;
    }
}
