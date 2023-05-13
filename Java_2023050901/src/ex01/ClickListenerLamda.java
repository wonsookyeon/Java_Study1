package ex01;

import ex01.Button.ClickListener;

//ClickListener 람다식

class Button{
	@FunctionalInterface
	public static interface ClickListener{
		void onclick();
	}
	
	private ClickListener clickListener;  // private라서 =구현클래스만 올수 있음

	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onclick();;
	}
}

public class ClickListenerLamda {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		
		btnOk.setClickListener( new ClickListener() {
			@Override
			public void onclick() {
				System.out.println("ok 버튼을 클릭했습니다.");
			}
		});
		
//		btnOk.setClickListener( ()-> System.out.println("Ok 버튼을 클릭했습니다."));
		btnOk.click();
		
		Button btnCancel = new Button();
		//람다식
		btnCancel.setClickListener( ()-> System.out.println("Cancle 버튼을 클릭했습니다."));
		btnCancel.click();
		

	}

}
