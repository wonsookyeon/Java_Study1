package ex03;

public class Exam01 {

	public static void main(String[] args) {
		
		String[] arr = {"kor", "200", "300"};
		
		for (int i = 0; i < arr.length+1; i++) {  // 배열의 크기 [3] +1=4개라서 4번 돌아야한다.
			try {            //
				int value = Integer.parseInt(arr[i]);
				System.out.println(value);
			
			} catch (ArrayIndexOutOfBoundsException e) {   // 배열의 크기 벗어나는 오류
				e.printStackTrace();
				System.out.println("배열 크기를 벗어났습니다."); // 배열의 크기는 3이지만 4번 돈다.
			} catch (NumberFormatException e) {  // 숫자로 변환불가 오류
				e.printStackTrace();
				System.out.println("숫자가 아닌 문자는 숫자로 변환불가입니다.");   // kor
				
			} catch (Exception e) {   // Exception이 맨 위로 올라가면 ↑ 위의 기능들을 다 처리해주기때문에 에러가 남.
				                      //Exception 은 모든 예외를 처리한다.
				System.out.println("모든 예외 처리는 내가한다.");
				
				
			} finally {  //finally 블력 : 예외 상관없이 무조건 실행해야하는 것
				System.out.println("예외가 발생하든 발생하지않든 무조건 처리해야 되는 문장은 여기다 기입");
			}
		}
		
		System.out.println("프로그램 종료");
			
		
		
//		for(int i=0; i<arr.length; i++) {
//			int value = Integer.parseInt(arr[i]);  // 100은 int로 바꿀수 있지만 나머지는 바꾸지 못해서 오류
//			System.out.println(value);
//		}
		
		
	}
}