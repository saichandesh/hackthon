package org.spring.hackthon.dummy.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StartService {
	
	public List<HashMap<String, Object>> getDummyValues();
}
