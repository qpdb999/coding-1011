/*
 * # Java StringBuffer와 Math 함수 활용 복습
 * 
 * 오늘 배운 내용
 * 
 * 오늘은 Java에서 문자열을 변경할 때 사용하는
 * StringBuffer와 수학 계산에 활용하는 Math 함수를
 * 복습했다.
 * 
 * 문자열을 추가하거나 수정하는 방법과
 * 숫자의 최댓값, 최솟값, 절댓값 등을 구하는 방법을
 * 실제 코드와 함께 정리했다.
 * 
 * StringBuffer 활용
 * 
 * StringBuffer는 문자열을 추가하거나 삭제하고
 * 수정할 때 활용할 수 있는 클래스이다.
 * 
 * 문자열을 반복해서 변경해야 하는 상황에서
 * append(), insert(), delete(), reverse() 등의
 * 메서드를 사용할 수 있다.
 * 
 * 예시:
 * 
 * StringBuffer sb = new StringBuffer("Java");
 * 
 * sb.append(" Programming");
 * System.out.println(sb);
 * 
 * 실행 결과:
 * Java Programming
 * 
 * append()는 기존 문자열 뒤에 내용을 추가한다.
 * 
 * StringBuffer 주요 메서드
 * 
 * append()
 * 
 * 기존 문자열 뒤에 내용을 추가한다.
 * 
 * StringBuffer sb = new StringBuffer("Hello");
 * sb.append(" Java");
 * 
 * 결과: Hello Java
 * 
 * 
 * insert()
 * 
 * 지정한 위치에 내용을 삽입한다.
 * 
 * StringBuffer sb = new StringBuffer("Java");
 * sb.insert(0, "Hello ");
 * 
 * 결과: Hello Java
 * 
 * 
 * delete()
 * 
 * 지정한 범위의 문자를 삭제한다.
 * 마지막 인덱스는 포함하지 않는다.
 * 
 * StringBuffer sb = new StringBuffer("Hello Java");
 * sb.delete(0, 6);
 * 
 * 결과: Java
 * 
 * 
 * reverse()
 * 
 * 문자열의 순서를 반대로 바꾼다.
 * 
 * StringBuffer sb = new StringBuffer("Java");
 * sb.reverse();
 * 
 * 결과: avaJ
 * 
 * 
 * 주의할 점:
 * StringBuffer의 메서드는 원래 객체의 내용을
 * 직접 변경하는 방식으로 동작한다.
 * 
 * Math 함수 활용
 * 
 * Math 클래스는 수학 계산에 필요한 기능을 제공한다.
 * 객체를 생성하지 않고 Math.함수() 형태로
 * 사용할 수 있다.
 * 
 * Math.max()
 * 
 * 두 값 중 큰 값을 반환한다.
 * 
 * System.out.println(Math.max(10, 20));
 * 
 * 결과: 20
 * 
 * 
 * Math.min()
 * 
 * 두 값 중 작은 값을 반환한다.
 * 
 * System.out.println(Math.min(10, 20));
 * 
 * 결과: 10
 * 
 * 
 * Math.abs()
 * 
 * 숫자의 절댓값을 반환한다.
 * 
 * System.out.println(Math.abs(-15));
 * 
 * 결과: 15
 * 
 * 
 * Math.round()
 * 
 * 소수점 첫째 자리에서 반올림한 정수 값을 반환한다.
 * 
 * System.out.println(Math.round(3.6));
 * 
 * 결과: 4
 * 
 * 
 * Math.pow()
 * 
 * 거듭제곱한 값을 반환한다.
 * 
 * System.out.println(Math.pow(2, 3));
 * 
 * 결과: 8.0
 * 
 * StringBuffer와 Math 함께 활용하기
 * 
 * import java.lang.Math;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * 
 * StringBuffer message = new StringBuffer("점수: ");
 * int score1 = 85;
 * int score2 = 92;
 * 
 * int maxScore = Math.max(score1, score2);
 * int minScore = Math.min(score1, score2);
 * 
 * message.append(maxScore);
 * System.out.println(message);
 * 
 * System.out.println("높은 점수: " + maxScore);
 * System.out.println("낮은 점수: " + minScore);
 * System.out.println("점수 차이: "
 * + Math.abs(score1 - score2));
 * }
 * }
 * 
 * 실행 결과:
 * 
 * 점수: 92
 * 높은 점수: 92
 * 낮은 점수: 85
 * 점수 차이: 7
 * 
 * StringBuffer로 출력할 문자열을 구성하고,
 * Math 함수로 점수의 최댓값과 최솟값,
 * 두 점수의 차이를 계산했다.
 * 
 * 참고:
 * Math는 java.lang 패키지에 포함되어 있으므로
 * 별도의 import 없이 사용할 수 있다.
 * 
 * 복습하면서 알게 된 점
 * 
 * StringBuffer는 문자열의 내용을 추가하거나
 * 삭제하는 등 직접 변경할 때 활용할 수 있다.
 * 
 * Math 함수는 숫자의 크기를 비교하거나
 * 절댓값과 거듭제곱 등을 계산할 때 유용하다.
 * 
 * 각 기능의 사용 방법을 이해하면
 * 문자열 처리와 수학 계산을 함께 사용하는
 * 프로그램을 작성할 수 있다는 것을 확인했다.
 * 
 * 📌 AI 활용 복습 문제
 * 
 * 1. StringBuffer에서 문자열을 추가하는 메서드는?
 * 
 * 1. insert()
 * 2. append()
 * 3. delete()
 * 4. reverse()
 * 
 * 정답: 2
 * 
 * 2. 다음 코드의 결과는?
 * 
 * StringBuffer sb = new StringBuffer("Java");
 * sb.reverse();
 * System.out.println(sb);
 * 
 * 1. Java
 * 2. avaJ
 * 3. J ava
 * 4. 오류
 * 
 * 정답: 2
 * 
 * 
 * 3. insert()의 역할은?
 * 
 * 1. 문자열 삭제
 * 2. 문자열 반전
 * 3. 지정한 위치에 문자열 삽입
 * 4. 숫자 반올림
 * 
 * 정답: 3
 * 
 * 
 * 4. Math.max(10, 20)의 결과는?
 * 
 * 1. 10
 * 2. 20
 * 3. 30
 * 4. 0
 * 
 * 정답: 2
 * 
 * 
 * 5. Math.min(5, 8)의 결과는?
 * 
 * 1. 5
 * 2. 8
 * 3. 13
 * 4. 3
 * 
 * 정답: 1
 * 
 * 
 * 6. Math.abs(-12)의 결과는?
 * 
 * 1. -12
 * 2. 0
 * 3. 12
 * 4. 24
 * 
 * 정답: 3
 * 
 * 
 * 7. Math.pow(2, 3)의 결과는?
 * 
 * 1. 5.0
 * 2. 6.0
 * 3. 8.0
 * 4. 9.0
 * 
 * 정답: 3
 * 
 * 
 * 8. StringBuffer의 특징으로 올바른 것은?
 * 
 * 1. 내용을 변경할 수 없다.
 * 2. 문자열 내용을 직접 변경할 수 있다.
 * 3. 숫자 계산만 가능하다.
 * 4. 배열에서만 사용할 수 있다.
 * 
 * 정답: 2
 */
