package com.wjj.controller;

import com.wjj.domain.Discuss;
import com.wjj.repository.DiscussRepository;
import jakarta.annotation.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

/**
 * @author :wjj
 * @date : 2023/3/20
 * @Description :
 */
@Controller
public class DiscussController {

    @Resource
    private DiscussRepository discussRepository;

    @GetMapping("/discuss")
    public String getDiscuss(ModelMap map){
        Pageable pageable = PageRequest.of(0,2);
        List<Discuss> list = discussRepository.getDiscussesByPage(pageable);
        map.put("list",list);
        map.put("title","hello");
        return "index.html";
    }

    @GetMapping("/indexByAId")
    public String getComment(ModelMap map, @RequestParam(value = "AId")Integer AId){

        List<Discuss> list = discussRepository.findByAIdEquals(AId);
        map.put("list",list);
        return "index.html";

    }



}
