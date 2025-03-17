package com.example.login_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 로그인 페이지
 * - 인증 없이 접근 가능
 *   - 로그인 및 회원가입 가능 버튼
 * - 인증 후 접근 가능
 *   - 로그아웃
 * - 로그인 전 -> 로그인 및 회원가입 페이지 -> 로그인 성공시 홈 화면 -> 로그아웃 성공시 로그인 페이지 이동
 */
@Controller
public class UserController {

    // 로그인 API
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // 회원 가입 API
    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}
