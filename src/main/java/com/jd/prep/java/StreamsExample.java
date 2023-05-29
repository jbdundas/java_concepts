package com.jd.prep.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class StreamsExample {

	public static final Logger log = Logger.getLogger("Streams1");
	
	/*
	 * @author jitesh dundas
	 * When given a map, use the flatMap streams method to 
	 */
	public void testFlatMap() {
		
		Map<String, List<String>> map1 = new HashMap<>();
		map1.put("HR",Arrays.asList(new String[] {"ABC","DEF"}));
		map1.put("Marketing",Arrays.asList(new String[]{"EFG","HIJ"}));
		
		var list1 = map1.values().stream().flatMap( x-> x.stream()).collect(Collectors.toList());
		
		log.log(Level.INFO, "Result--{0}",list1.toString() );
	}
}

