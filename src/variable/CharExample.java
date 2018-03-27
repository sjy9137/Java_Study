package variable;

/*변수명 설정법

알파벳 숫자(첫번쨰 X) 한글가능(X)
특수문자 요것만 ($ _)
class 대문자로 시작
method 소문자로 시작
예약어(X)  색깔이 있는 언어
길이 제한이 없음
대소문자 구분
*/


public class CharExample {

	public static void main(String[] args) {
	
		char c1 = 'A';
		char c2= 65;
		char c3 = '\u0041';
		
		
		
		System.out.println(c1 +" "+ c2 + " " + c3);
	}
}
