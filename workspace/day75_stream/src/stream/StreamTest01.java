package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest01 {

	public static void main(String[] args) {
//		스트림 생성하기
		IntStream is = IntStream.range(0, 5);//0~4
		System.out.println(is);
		is.forEach(System.out::println);
		
//		java.util.stream.IntPipeline$Head@2401f4c3
//		intPipeline의 첫번째 요소인 Head를 나타냄
//		@2401f4c3 객체의 해시코드를 나타냄
		
		IntStream is2 = IntStream.rangeClosed(0, 5);//0~5
		is2.forEach(System.out::println);
		
//		2)Arrays를 사용한 IntStream 생성
		int[] ar = {1,2,3,4};
		System.out.println(ar[0]);
		IntStream is3 = Arrays.stream(ar);
		System.out.println(is3);
		
//		3) Collection 을 사용한 Stream<T> 생성
		List<Integer> list = new ArrayList<>();
		Stream<Integer> s1 = list.stream();
		
		Set<Integer> set = new HashSet<>();
		
		Map<String, Integer> map = new HashMap<>();
		//map자체로는 stream을 만들 수 없다
		//map.stream(); (x)
//		Stream<String, Integer> s4 = map.stream();
		//key, value를 각각 만들어야 한다
		Stream<String> s4 = map.keySet().stream();
		Stream<Integer> s5 = map.values().stream();
	}
	

}
