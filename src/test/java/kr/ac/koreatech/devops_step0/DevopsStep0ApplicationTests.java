package kr.ac.koreatech.devops_step0;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsStep0ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void addTest1(){
		int result = add(10, 20);
		assertEquals(30, result);
	}

	int add(int x, int y){
		return x + y;
	}
}
