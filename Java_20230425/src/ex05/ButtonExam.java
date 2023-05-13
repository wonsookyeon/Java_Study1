package ex05;

public class ButtonExam {

	public static void main(String[] args) {
		
		Button btnOk = new Button(); // 1. 객체생성
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() { // 8. 출력
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}
		
		btnOk.setClickListener(new OkListener()); // 4
		btnOk.click(); // 5
		
		
		
		Button bntCancel = new Button();
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		bntCancel.setClickListener(new CancelListener());
		bntCancel.click();
		
		
		
		Button DoubleBntOk = new Button();
		
		class DoubleListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("더블 클릭했습니다.");
			}
		}
		
		DoubleBntOk.setClickListener(new DoubleListener());
		DoubleBntOk.click();
		
	}

}
