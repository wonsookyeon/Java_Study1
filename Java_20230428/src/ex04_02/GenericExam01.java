package ex04_02;

class Box<T> {
	private T ob;
	
	public T getOb() {
		return ob;
	}
	
	public void setOb(T ob) {
		this.ob = ob;
	}
}




public class GenericExam01 {

	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		box1.setOb(99);
		Box<Integer> box2 = new Box<>();
		box2.setOb(55);
		
		System.out.println(box1.getOb() + "&" + box2.getOb());
		swapBox(box1,box2);
		//SwapBox.swapBox(box1,box2);
		System.out.println(box1.getOb() + "&" + box2.getOb());
		
		Box<Double> box3 = new Box();
		Box<Double> box4 = new Box();
		swapBox(box3,box4);
		
		
		
	}
	static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
		            // Number로 제한을 줄 수 있음.
		Box<T> tmp = new Box<T>();
		
		tmp.setOb(box1.getOb());
		box1.setOb(box2.getOb());
		box2.setOb(tmp.getOb());
		
		
//	static <T> void swapBox(Box<T> box1, Box<T> box2) {
//	     //<T> 쓰지않아도 <?> 를 써주면 더 간편(와일드카드)
//	static void swapBox(Box<?> box1, Box<?> box2) {
//		
//		System.out.println(box1.getOb());
//		System.out.println(box2.getOb());
		
	}
	




}
