package ex03;

//아래 point클래스와 Rectangle클래스 내용 비교를 위한 equals 메소드를 각각 삽입하다.
//그리고 정의한 equals메소드의 확인을 위한 main메소드 직접 구현하자.

class Point{
	private int xPos;
	private int yPos;
	
	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	@Override
	public String toString() {
		return "Point [xPos=" + xPos + ", yPos=" + yPos + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Point po = (Point)obj;
	if(this.xPos == po.xPos && this.yPos == po.yPos)
			return true;
		else
			return false;
	}
	
	
	
}

	

class Rectangle{
	private Point upperLeft; //좌측상단 좌표
	private Point lowerRight; //우측하단 좌표
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1,y1);
		lowerRight = new Point(x2,y2);
	}

	@Override
	public String toString() {
		return "Rectangle [upperLeft=" + upperLeft + ", lowerRight=" + lowerRight + "]";
	}
	
	
	
	
	
}



public class Exam {

	public static void main(String[] args) {
		
		
		Rectangle rec = new Rectangle(50,50,10,10);
		Rectangle rec2 = new Rectangle(50,50,10,10);
		Point p1 = new Point(10,10);
		Point p2 = new Point(20,10);
		
		
		System.out.println(rec);
		System.out.println(rec2);
		
		
		System.out.println("p1==p2 : " + (p1==p2));
		System.out.println("p1.equals(p2) : " + p1.equals(p2));

	}
}

