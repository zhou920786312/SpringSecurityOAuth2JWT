package io.spring2go.jwtresourceserver.api;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {

    @RequestMapping("/api/userinfo")
    public String getUerInfo() {
    	String userName = (String) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        return "已经获取到资源：用户名"+userName;
    }

}
