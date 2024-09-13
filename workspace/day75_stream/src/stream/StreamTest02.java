package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest02 {
   public static void main(String[] args) {

//      //중간연산 : 스트림을 변환하거나 필터링 하는 연산
//      //      반환타입은 항상 스트림이며 여러번 연결해서 사용할 수 있다
//      //      지연연산이므로 최종 연산이 호출될 때 까지 실행되지 않는다
//      // filter(), map(), sorted(), distinct()
//      
//      //map() : 각 요소를 변환한다(연산)
//      IntStream.range(0, 5).map(i -> i + 10).forEach(i -> System.out.print(i + "\t"));
//      System.out.println();
//      
//      //sorted() : 정렬
//      int[] ar = {6, 3, 2, 1, 5, 7, 9, 4};
//      System.out.println(ar);
////      for(int i : ar) {
////         System.out.print(i);
////      }
//      Arrays.stream(ar).forEach(i -> System.out.print(i + "\t"));
//      System.out.println();
//      Arrays.stream(ar).sorted().forEach(i -> System.out.print(i + "\t"));
//      System.out.println();
//      //boxed() : 박싱
//      //sorted(Collections.reverseOrder()) : 역정렬, 단 일반 자료형 요소는 박싱이 필요하다
//      Arrays.stream(ar).boxed().sorted(Collections.reverseOrder()).forEach(i -> System.out.print(i + "\t"));
//      System.out.println();
//      //distinct() : 중복 제거
//      List<Integer> ar2 = new ArrayList<>();
//      ar2.add(1);
//      ar2.add(1);
//      ar2.add(2);
//      ar2.add(2);
//      ar2.add(3);
//      ar2.add(3);
//      System.out.println(ar2);
//      
//      ar2.stream().distinct().forEach(i -> System.out.print(i + "\t"));
//      System.out.println();
//      
//      //mapToInt() : 요소를 기본 자료형 int로 변환한다(언박싱), mapToDouble(), mapToLong()
//      ar2.stream().mapToInt(i -> i).forEach(i -> System.out.print(i + " "));
//      System.out.println();
//      
//      //filter() : 요소를 조건에 맞게 걸러낸다
//      ar2.stream().filter(i -> i % 2 == 1).forEach(i -> System.out.print(i + " "));
//      System.out.println();
//      
//      //중복제거한 짝수 요소만 출력하기
//      ar2.stream().distinct().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
//      
      // peek() : 요소 조회, 중간중간 요소를 확인할 때 사용하기 좋다
      // 일반적으로 중간 연산이 출력하게 되면 반한되는 값이 없으므로 오류가 발생하게 된다
      // peek()는 출력을 해도 오류가 발생하지 않는다
      // 요소를 소모하지 않는다
      String[] arStr = { "a", "b", "c" };
      System.out.println();
      Arrays.stream(arStr).map(i -> i + "번").peek(i -> System.out.print(i + " ")).map(i -> i + "**")
            .forEach(i -> System.out.println(i));

   }

}

