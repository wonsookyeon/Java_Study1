package ex01;

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		
		
		int[] arrNum= {10,20,30,40,50}; // arrNum 배열은 5개
		System.out.println(Arrays.toString(arrNum));
		
		int[] arrNum2 = new int[10];  // arrNum2 배열은 10개
		
		for(int i=0; i<arrNum.length; i++) // for문을 이용하여 arrNum의 길이만큼(전체를)
			arrNum2[i] = arrNum[i];  //arrNum 배열안의 내용을 arrNum2 배열로 복사해서 넣음. 
		
		System.out.println(Arrays.toString(arrNum2));
		
		
		// arrNum 배열크기가 5개라서 부족, 10개로 증가하고 싶다.
		arrNum = arrNum2; //arrNum 의 배열[5] 자체가 arrNum2 의 배열인 10개 [10] 으로 바뀜. 
		System.out.println(Arrays.toString(arrNum));
		
		System.out.println("---------------------------------");
//-----------------------------------------------------------------------------------		
		int[] tmp = new int[10];  // tmp 의 방(배열) 10개 생성
		
		tmp=arrNum;    // arrNum 주소값을 tmp에게 복사, 따라서 arrNum와 tmp는 같은 배열 공간을 참조한다.(갖는다.)
		               // arrNum의 주소값이 tmp의 주소값으로 입력됨.(arrNum에 있는 값들을 통으로 복사)

		System.out.println(Arrays.toString(tmp));

		
		arrNum[3] = 100; // arrNum [3]번째 방(배열)에 100 입력
		
		System.out.println(Arrays.toString(arrNum));
		System.out.println(Arrays.toString(tmp));
		System.out.println("---------------------------------");
//------------------------------------------------------------------------------------
		
		int[] arr= {10,20,30,40,50};
		int[] arr2= new int [10];  // arr2에 방(배열) 10개 생성
		
		System.arraycopy(arr, 0, arr2, 2, arr.length);   // 배열 복사할때 for 대신 arraycopy 써도됨. 더 편리함.
		// (복사할 곳, 어디서부터 복사해서,붙여넣기할 곳,어디서부터 넣을것인지, 얼마나 넣을것인지)
		//                                                  변수이름.length 하면 끝까지
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		

	}

}
