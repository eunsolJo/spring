package com.studyolle.account;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/sign-up")
    public String signUp(Model model) {
        model.addAttribute(new SignUpForm()); // attribute name 생략시, 클래스명을 카멜케이스로 자동 매핑
        return "account/sign-up";
    }
}
