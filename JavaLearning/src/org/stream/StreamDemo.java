package org.stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) throws IOException {
//		List<Integer> numbers =Arrays.asList(11,13,2,3,4,5,6,7,21);
//		Stream.of(2,3,4,5,68,9,0,7,6);//other way to create stream,without creating list
//		Stream<Integer> numberStream =numbers.stream();
//		numberStream.parallel().forEach(null);//parallel stream co
//		
		//numbers.stream().filter(n->n%2!=0).map(n->n*n).sorted().forEach(System.out::println);//lambda expresion-which is a predicate
		//List<Integer> oddNumers = numberStream.filter(n->n%2!=0).map(n->n*n).sorted().collect(Collectors.toList());
//		Integer maxNum = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println("Greatest Number:  "+maxNum);
//		numberStream.close();//always in finally block if you have
		File fileName = new File("data.txt");
		Stream<String> data = Files.lines(fileName.toPath());
		data.parallel().forEach(System.out::println);
		
//		
//		List<String> names =Arrays.asList("anu","bani","citra","madhu","hema","mohan","sri","manju","kai","mitra");
//
//		//Stream<String> nameStream =names.stream();
//		names.stream().filter(n->n.startsWith("m")).map(x->x+"jai").forEach(System.out::println);
		
	
		
		
		
		
		
		
		
		
	}

}
