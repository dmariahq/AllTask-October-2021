package qaautomation.october2021;




import org.testng.annotations.Test;

import com.github.javafaker.Faker;



public class Tugas5APITest {
	String token = "";

	

	@Test
	public void fakerTest() {
		Faker faker = new Faker();
		System.out.println(faker.name().username() + "@gmail.com");
	}
	
}
