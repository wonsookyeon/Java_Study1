package practice;
// 두 개의 주사위 눈의 합이 6이 되는 모든 경우의 수

public class Exam4_6 {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++)
				if((i+j)==6)
					System.out.println("num1: "+ i + " num2: " + j);
		}
	}
}
