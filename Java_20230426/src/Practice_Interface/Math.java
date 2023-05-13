package Practice_Interface;

public interface Math {   //메서드가 1개 -> 람다식 가능
	int math(int x, int y);
}



class 더하기 implements Math{
	@Override
	public int math(int x, int y) {
		return x+y;
	}
}


class 빼기 implements Math{
	@Override
	public int math(int x, int y) {
		return x-y;
	}
}


class 곱하기 implements Math{

	@Override
	public int math(int x, int y) {
		return x*y;
	}
}


class 나누기 implements Math{
	@Override
	public int math(int x, int y) {
		return x/y;
	}
}







