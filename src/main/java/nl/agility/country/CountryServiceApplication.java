package nl.agility.country;

import nl.agility.country.domain.Country;
import nl.agility.country.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class CountryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoData(CountryRepository countryRepository) {
		return args -> {
			countryRepository.saveAll(getCountries());
		};
	}

	private List<Country> getCountries() {
		Country nl = new Country();
		nl.setAlpha2Code("NL");
		nl.setAlpha3Code("NLD");
		nl.setName("Netherlands");
		nl.setCapital("Amsterdam");

		Country de = new Country();
		de.setAlpha2Code("DE");
		de.setAlpha3Code("DEU");
		de.setName("Germany");
		de.setCapital("Berlin");

		Country be = new Country();
		be.setAlpha2Code("BE");
		be.setAlpha3Code("BEL");
		be.setName("Belgium");
		be.setCapital("Brussels");

		return List.of(nl, de, be);
	}

}
