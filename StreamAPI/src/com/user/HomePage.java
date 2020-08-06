package com.user;

import java.util.Arrays;
import java.util.List;

import com.service.Filter;
import com.service.Mapper;

public class HomePage {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah",
				"allessandra", "allianna", "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle",
				"annebelle");
		names.stream()
		.filter(Filter.nameStartingWithPrefix("aa"))
		.map(Mapper.getDistinctCharactersCount())
		.forEachOrdered(System.out::println);
		}
	}

