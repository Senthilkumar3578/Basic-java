package Basicajava;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class Stream {

	public static void main(String[] args) {
		 
		List<Integer> number=Arrays.asList(2,3,4,5);
		
		   List<Integer> square = number.stream().map(x -> x*x). collect(Collectors.toList());
		   System.out.println(square);
		   
		   List<String> names =Arrays.asList("Reflection","Collection","Stream,senthil");
		   List<String> result = names.stream().filter(s->s.startsWith("C")).collect(Collectors.toList());
           System.out.println(result);
            
           List<String> show = names.stream().sorted().collect(Collectors.toList());
           System.out.println(show);
           
           number.stream().map(x->x*x).forEach(y->System.out.println(y));
           

	}

}
