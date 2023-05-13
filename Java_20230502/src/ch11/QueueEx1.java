package ch11;
//자바의 정석 611p
//history 명령어를 Queue를 이용해 구현

import java.util.*;

public class QueueEx1 {
	
	static Queue q = new LinkedList();  // 리스트 생성

	static final int MAX_SIZE = 5;  //Queue 에 최대 5개까지만 저장되도록 한다.

	public static void main(String[] args) {
		System.out.println("help 를 입력하면 도움말을 볼 수 있습니다.");

		while (true) {
			System.out.print(">>");
			try {
				// 화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); // trim : 공백제거, 앞에 공백이 있으면 제거해줌

				if ("".equals(input))
					continue; // " " 빈칸 입력하면 계속

				if (input.equalsIgnoreCase("q")) { // equalsIgnoreCase : 대소문자 구분없이 비교
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					save(input); // 입력받은 명령어를 저장하고,

					// LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();

					while (it.hasNext())
						System.out.println(++i + "." + it.next());
				} else {
					save(input);
					System.out.println(input);
				} // if (input.equalsIgnoreCase("q")) {
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		} // while(true)

	}

	public static void save(String input) {
		if (!"".equals(input))
			q.offer(input); // q에 저장한다.

		if (q.size() > MAX_SIZE) // queue 의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
			q.remove(); // size() 는 Collections인터페이스에 정의
	}

}
