package ch11;
//자바의 정석 610p
//입력한 수식의 괄호가 올바른지 체크하는 예제

import java.util.*;

public class ExpvalidCheck {

	public static void main(String[] args) {
		
		if(args.length!=1) {  //args 에 내용을 입력하지 않으면 ↓ 출력
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack(); // 스택 생성
		String expression = args[0];  // expression 에 args 에 적은 내용을 입력
		
		System.out.println("expression: " + expression);;
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i); // ch에 expression의 i번째 문자하나를 넣어준다.
				
				if(ch=='(') {         // ch의 문자가 ( 이면 ↓ 동작
					st.push(ch+"");   // Stack에 ch ( 를 넣어준다.
				}else if (ch==')') { // ch의 문자가 ) 이면 ↓ 동작
					st.pop();        // Stack 에서 ch를 꺼내준다.
				}
			}
			if (st.isEmpty()) {     // Stack이 비어있으면 ↓ 출력
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		}catch(EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}

	}

}
