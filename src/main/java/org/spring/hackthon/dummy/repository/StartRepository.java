package org.spring.hackthon.dummy.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StartRepository {
	
	public List<HashMap<String, Object>> getDummyValues(){
			
			List<HashMap<String, Object>> dummyValues = new ArrayList<HashMap<String, Object>>();
				HashMap<String, Object> city1 = new HashMap<String, Object>();
				city1.put("city", "chennai");
					List<HashMap<String, Object>> places1 = new ArrayList<HashMap<String, Object>>();
						HashMap<String, Object> place1 = new HashMap<String, Object>();
						place1.put("name", "guindy");
						List<String> restaurants1 = new ArrayList<String>(Arrays.asList(new String[] {"sarvana","seashell"}));
						place1.put("restaurants", restaurants1);
					places1.add(place1);
						HashMap<String, Object> place2 = new HashMap<String, Object>();
						place2.put("name", "tambaram");
						List<String> restaurants2 = new ArrayList<String>(Arrays.asList(new String[] {"bbq","amul"}));
						place1.put("restaurants", restaurants2);
					places1.add(place2);
				city1.put("places", places1);
			dummyValues.add(city1);
				HashMap<String, Object> city2 = new HashMap<String, Object>();
				city2.put("city", "bangalore");
					List<HashMap<String, Object>> places2 = new ArrayList<HashMap<String, Object>>();
						HashMap<String, Object> place3 = new HashMap<String, Object>();
						place3.put("name", "whitefield");
						List<String> restaurants3 = new ArrayList<String>(Arrays.asList(new String[] {"ccd","subway"}));
						place3.put("restaurants", restaurants3);
					places2.add(place3);
						HashMap<String, Object> place4 = new HashMap<String, Object>();
						place4.put("name", "majestic");
						List<String> restaurants4 = new ArrayList<String>(Arrays.asList(new String[] {"mcd","chipotle"}));
						place4.put("restaurants", restaurants4);
					places2.add(place4);
				city2.put("places", places2);
			dummyValues.add(city2);
			
			return dummyValues;
	}
}
