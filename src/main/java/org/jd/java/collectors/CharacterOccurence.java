package org.jd.java.collectors;

import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/*
 * Find the First Occurrence of non-repeating character in the input string.
 */
public class CharacterOccurence {

	public static final Logger log = Logger.getLogger("CharacterOccurence");
	
	public void stringOccurence(String input) {
		
		var tempList = input.chars()
				.mapToObj(x -> (char)x)
				.collect(Collectors.toList());
						
		var result = tempList.stream()
				.map(x -> {
							var count = Collections.frequency(tempList, (char) x);
							return new CharRecord( (char) x,count);
				})
				.filter(x -> (x.count <= 1) ).findFirst();
		
		log.log(Level.INFO, "First Occurrence of non-repeating character in the string-{0} is \n {1}",new Object[] {input,result.get().beautify()});
	}
}

class CharRecord{
	char ch;
	int count;
	public CharRecord(char ch, int count) {
		super();
		this.ch = ch;
		this.count = count;
	}
	
	public String beautify() {
		return "{value:"+ch + "," + "count:" + count + "}";
	}
}