package listTest;

import java.util.Arrays;
import java.util.List;

public class ListTest {
   public static void main(String[] args) {
      
      //리스트에 있는 숫자들(1~10) 중에서 짝수만 골라서 제곱한 후 그 합 출력하기
      //로직구성!!!
      //1. 리스트 객체 생성과 동시에 1~10 값 넣기
      //2. 값 출력
      //3. 짝수 총합 구할 변수
      //4. 반복문(for-each문)
      //5. {조건문(짝수일때){
      //6. 제곱할 변수 선언
      //7. 총합구할 변수 += 제곱할 변수}}
      //8. 결과 출력
      
      
      List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      System.out.println(num);
      
      int even = 0;
      for(int i : num) {
         System.out.println(i);
         if(i % 2 == 0) {
            int square = i * i;
            even += square;
         }
      }
      System.out.println(even);
   }
}
