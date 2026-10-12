package ua.mtb.inverse.contracts.purchase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.diia.ErrorData;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralAgreementResponse {
  private ErrorData error;
  private Response response;

  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  @EqualsAndHashCode(callSuper = true)
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Response extends ResponseErrorData {
    @JsonProperty("brokeragreement")
    private BrokerAgreement brokerAgreement;
  }

  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class BrokerAgreement {
    @JsonProperty("dealid")
    private int dealId;

    @JsonProperty("dealno")
    private String dealNo;
  }
}
