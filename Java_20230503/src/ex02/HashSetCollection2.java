package ex02;

import java.util.HashSet;
import java.util.Set;

class Num{
	private int num;
	public Num(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return String.valueOf(num);  // "10" num +"";  ""로 감싸서 나타내줌
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return num%3;
	}
	
	@Override
	public boolean equals(Object obj) {
		
//		if(num == ((Num)obj).num)
//			return true;
//		else return false;
		
		return num == ((Num)obj).num ? true : false;
	}
}

public class HashSetCollection2 {

	public static void main(String[] args) {
		
		Set<Num> set = new HashSet();  // HashSet : 순서x, 중복x
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(20));
		set.add(new Num(20));
		
		for(Num s : set)
			System.out.println(s);
		
		System.out.println("-------------------");
		
		Set<Integer> set2 = new HashSet();
		for(int i=0; set2.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		
		for(int s : set2)
			System.out.print(s+", ");
		

	}

}
