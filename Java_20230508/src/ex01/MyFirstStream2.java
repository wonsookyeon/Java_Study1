package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Stream

class ToyPriceInfo{
	private String model;
	private int price;
	
	public ToyPriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
}

public class MyFirstStream2 {

	public static void main(String[] args) {
		
		List<ToyPriceInfo> list = new ArrayList<>();
		
		list.add(new ToyPriceInfo("GUN_LR_45",200));
		list.add(new ToyPriceInfo("GUN_LR_55",600));
		list.add(new ToyPriceInfo("TEDDY_BEAR_S_014",350));
		list.add(new ToyPriceInfo("CAR_TRANSFORM_VAR_778",550));
		
		
		//1. 장난감 가격이 500 이상 제품의 합은 얼마인가?
//		Stream<ToyPriceInfo> stream = list.stream();      
//		int sum = stream.filter(n->n.getPrice()>=500).mapToInt(n->n.getPrice()).sum();
		        //생략하고 ↓                                 //가격을 숫자로 인지시킴(스트림 요소변환)
		int sum = list.stream().filter(n->n.getPrice()>=500).mapToInt(n->n.getPrice()).sum();
		                              //가격이 500이상인 제품의 가격                //제품의 값 // 합
		System.out.println("sum : " + sum);
		
		
	}
		
	

}
