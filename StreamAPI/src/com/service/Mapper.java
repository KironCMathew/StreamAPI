package com.service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.bean.CharactersCount;

public class Mapper {
	public static Function<String, CharactersCount> getDistinctCharactersCount(){
		return c->{
			long count = c.chars().distinct().count();
			
			
		return new CharactersCount(c,count);
			
		};
		/*return c->{
			List<String> names = Arrays.asList(c);
			long count = names.stream().distinct().count();
			
			return count; 
		}; */
		
	}
}
