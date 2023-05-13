package ex03;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
		
		Optional<String> os1 = Optional.of( new String("Toy1") );
		Optional<String> os2 = Optional.of( new String("Toy2") );
		
		if(os1.isPresent())
			System.out.println(os1.get());  //os1만 쓰면 주소값을 , get을 쓰면 값을 나타내줌.
		else
			System.out.println(os1.orElse("no...")); // 참조하는 값이 없으면
		
		

	}

}
