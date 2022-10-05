package com.Wouldu.wouldu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MateBoardController {

    @RequestMapping("/mate_board_list")
    public String mate_board_list() {
        return "mate_board_list";
    }

    @RequestMapping("/mate_detail_board")
    public String mate_detail_board() {
        return "mate_detail_board";
    }

}
