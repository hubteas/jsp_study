package listTest;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(num);
		
//		스트림 연산 사용한 로직 구성
//		1) 리스트를 스트림으로 변환(.StreamTest())//스트림 생성
//		2) 짝수만 걸러냄(.filter(n->n%2==0))//중간연산1
//		3) 각 숫자를 제곱해서 스트림요소로 변환(.mapToInt(n->n*n))//중간연산2
//		4) 변환된 요소들의 합계를 계산(.sum())// 최종연산
		int result = num.stream().filter(n -> n % 2 ==0).mapToInt(n-> n*n).sum();
		System.out.println(result);
	}

}
