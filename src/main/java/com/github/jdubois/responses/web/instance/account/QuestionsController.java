package com.github.jdubois.responses.web.instance.account;

import com.github.jdubois.responses.web.instance.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Julien Dubois
 */
@Controller
public class QuestionsController extends BaseController {

    @RequestMapping("/account/questions")
    public ModelAndView homepage() {
        ModelAndView mv = new ModelAndView();
        this.putUserInModel(mv);
        return mv;
    }
}