package com.example.sample.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sample.boot.mapper.SampleBootMapper;
import com.example.sample.boot.vo.SampleBootVO;

@Service
public class SampleBootService {

	@Autowired
	SampleBootMapper sampleBootMapper;
	
	public List<SampleBootVO> getAll() throws Exception{
		return sampleBootMapper.getAll();
	}
}
