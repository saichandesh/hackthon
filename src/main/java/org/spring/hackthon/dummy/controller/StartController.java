package org.spring.hackthon.dummy.controller;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.spring.hackthon.dummy.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/start")
public class StartController {

	@Autowired
	private StartService startservice;
	
	static final Logger logger = Logger.getLogger(StartController.class);
	
	@RequestMapping(value="/dummy", method = RequestMethod.GET)
    public List<HashMap<String, Object>> dummy(@RequestParam(value="name", defaultValue="World") String name) {
			
		return startservice.getDummyValues();
    }
	
}
