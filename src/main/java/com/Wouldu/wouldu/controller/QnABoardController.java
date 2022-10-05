package com.Wouldu.wouldu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QnABoardController {
    @RequestMapping("/qna_board")
    public String qna_board() {
        return "qna_board";
    }


}
