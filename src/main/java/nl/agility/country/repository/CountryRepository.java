package nl.agility.country.repository;

import nl.agility.country.domain.Country;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryRepository extends MongoRepository<Country, String> {
}
