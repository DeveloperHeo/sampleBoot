/**
 * @author heo97
 *
 */
package com.example.sample.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sample.boot.service.SampleBootService;
import com.example.sample.boot.vo.SampleBootVO;


@Controller
public class SampleBootController {
	
	@Autowired
	private SampleBootService sampleBootService;
	
    @RequestMapping("/")
    public String root_test() throws Exception{
        return "main";
    }
 
    @RequestMapping("/sample2")
    public @ResponseBody List<SampleBootVO> demo_test() throws Exception{
        return sampleBootService.getAll();
    }


}