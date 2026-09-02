package ua.mtb.inverse.contracts.client;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseAddress {
  @JsonAlias("Addresstypeid")
  private String addressTypeId;

  @JsonAlias("countryid")
  private Integer countryId;

  private String postcode;

  @JsonAlias("Region")
  private String region;

  @JsonAlias("District")
  private String district;

  @JsonAlias("City")
  private String city;

  @JsonAlias("Street")
  private String street;

  @JsonAlias({"Houseno", "houseno"})
  private String houseNumber;

  @JsonAlias("Building")
  private String building;

  @JsonAlias("Flat")
  private String flat;
}
