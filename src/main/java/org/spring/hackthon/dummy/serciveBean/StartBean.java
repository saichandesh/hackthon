package org.spring.hackthon.dummy.serciveBean;

import java.util.HashMap;
import java.util.List;

import org.spring.hackthon.dummy.repository.StartRepository;
import org.spring.hackthon.dummy.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartBean implements StartService{
	
	@Autowired
	private StartRepository startRepository;
	
	public List<HashMap<String, Object>> getDummyValues(){
		
		return startRepository.getDummyValues();
	}
}
