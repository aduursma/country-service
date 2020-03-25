package nl.agility.country.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.agility.country.repository.CountryRepository;
import nl.agility.country.domain.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<Country> retrieveCountries() {
        log.info("Fetching all countries");
        return this.countryRepository.findAll();
    }

}
