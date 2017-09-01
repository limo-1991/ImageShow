package studio.limo.image.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import studio.limo.image.entity.User;
import studio.limo.image.mapper.UserMapper;

@Controller
public class IndexController {

    private static Logger logger = Logger.getLogger(IndexController.class);

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/index")
    public String index(Model model){
        logger.debug("--->index");
        User user = userMapper.getUserById(1);
        model.addAttribute("user", user);
        return "index";
    }
}
