package ai.jobiak.lombok;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ai.jobiak.lombok.model.Customer;
import ai.jobiak.lombok.model.Product;

@SpringBootApplication
public class LombokDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LombokDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Product p=Product.builder()
				.productId(101)
				.description("thumsup")
				.build();
		System.out.println(p);
		
		
		Customer cust=new Customer();
		cust.setId(1);
		cust.setName("naga");
		cust.setBalance(3000);
		
		System.out.println(cust.getBalance());
		System.out.println(cust.getName());
		System.out.println(cust.getBalance());
		
		System.out.println(cust);
		
		Customer cust2=new Customer(2,"nikki",4000);
		System.out.println(cust2);
		
		
		boolean result=cust.equals(cust2);
		System.out.println(result);
		
		Customer cust3=new Customer(2,"nikki",4000);
		System.out.println(cust3);
		
		result=cust3.equals(cust2);
		System.out.println(result);
		
		
		
	}

}


