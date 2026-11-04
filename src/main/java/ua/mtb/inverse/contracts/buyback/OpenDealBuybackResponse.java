package ua.mtb.inverse.contracts.buyback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.diia.ErrorData;
import ua.mtb.inverse.contracts.purchase.ResponseErrorData;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenDealBuybackResponse {
  private ErrorData error;
  private Response response;

  @Data
  @EqualsAndHashCode(callSuper = true)
  @AllArgsConstructor
  @NoArgsConstructor
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Response extends ResponseErrorData {
    @JsonProperty("dealid")
    private Integer dealId;
  }
}
