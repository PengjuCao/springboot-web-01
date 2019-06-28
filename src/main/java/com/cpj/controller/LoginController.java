package com.cpj.controller;

import com.cpj.entities.User;
import com.cpj.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author PengjuCao
 */
@Slf4j
@Controller
public class LoginController {

    @Resource
    LoginService loginService;

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){

      if(username != null){

            User user = loginService.loginUser(username, password);
             session.setAttribute("LoginUser",user);
             session.setAttribute("username",username);
          //登录成功，防止表单重复提交，可以重定向到主页
            return "redirect:/dashboard.html";
      }
      else {
          map.put("msg","用户名密码错误");
          return "login";
      }


    }

}
