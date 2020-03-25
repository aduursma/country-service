package nl.agility.country.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Country {

    @Id
    private String id;
    private String alpha2Code;
    private String alpha3Code;
    private String name;
    private String capital;
}
