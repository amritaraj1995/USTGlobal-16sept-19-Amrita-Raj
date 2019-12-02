package com.ustglobal.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {

	private String msg;
	
	private Map<String, Integer> map;

	public Map<String, Integer> getMap() {
		return map;
	}


	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}


	public Hello() {
		System.out.println("hello object created uhuhhuhu");
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	@PostConstruct
	public void init() {
		System.out.println("Init method excuting from Hello");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method excuting from Hello");
	}

}
