package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest03 {
   public static void main(String[] args) {
      //Stream 최종 연산
      int[] ar = {6, 3, 2, 1, 5, 7, 9, 4};
      
      List<Integer> list = new ArrayList<>();
      for(int i = 0; i < ar.length; i++) {
         list.add(ar[i]);
      }
      System.out.println(list);

      //forEach() : 각각의 요소를 소모하는 연산
      Arrays.stream(ar).forEach(i -> System.out.print(i + " "));
      // 매개변수 i의 타입은 int, i는 스트림의 각 요소를 나타낼 때 사용됨
      System.out.println();
      //count() : 요소의 개수를 세는 메소드
      long count = list.stream().count();
      System.out.println("요소의 개수 : " + count);
      
      //sum() : 요소의 합을 구한다(기본타입 스트림만 가능하므로 Integer는 언박싱해야한다)
      int sum = list.stream().mapToInt(i -> i).sum();
      System.out.println("최종 합 : " + sum);
      
      //collect(Collectors.toList()) : 최종 반환을 리스트로 해준다. 박싱을 항상 주의 해야한다
      List<Integer> list2 = Arrays.stream(ar).boxed().collect(Collectors.toList());
      //Collectors.toList() : 스트림 요소를 리스트로 모으는 컬렉터
      // list2 => List<Integer>
      System.out.println(list2);
      
      Map<String, Integer> map = Arrays.stream(ar)
            .boxed()
            .collect(Collectors.toMap(i -> i + "번째", i -> i * 10));
      System.out.println(map);
      
      //toArray() : 최종 반환을 배열로 해준다. 언박싱을 주의해야한다
      int[] ar3 = list.stream().mapToInt(i -> i).toArray();
      System.out.println(ar3);
      System.out.println(Arrays.toString(ar3));
   }
}

