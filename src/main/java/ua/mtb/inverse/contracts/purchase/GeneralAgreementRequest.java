package ua.mtb.inverse.contracts.purchase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralAgreementRequest {

  @JsonProperty("contragentid")
  private Integer contragentId;

  @JsonProperty("mfpackageid")
  private Integer mfPackageId;

  private String operator;

  @JsonProperty("depositaryaccountno")
  private String depositaryAccountNo;

  @JsonProperty("addagreementinfo")
  private String addAgreementInfo;

  private String description;

  private String iban;

  @JsonProperty("dealno")
  private String dealNo;
}
