package ua.mtb.inverse.contracts.deal;

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
public class OpenDealResponse {
  private ErrorData error;
  private Response response;

  @Data
  @EqualsAndHashCode(callSuper = true)
  @AllArgsConstructor
  @NoArgsConstructor
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Response extends ResponseErrorData {
    private Deal deal;
  }

  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Deal {
    @JsonProperty("dealid")
    private Integer dealId;
  }
}
