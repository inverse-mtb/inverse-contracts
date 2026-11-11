package ua.mtb.inverse.contracts.buyback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenDealBuybackRequest {
  @JsonProperty("ticketno")
  private String ticketNo;

  @JsonProperty("acc2620")
  private String account;

  @JsonProperty("securitiesisin")
  private String isin;

  @JsonProperty("securitiescount")
  private Integer count;

  @JsonProperty("securitiesamount")
  private BigDecimal amount;
}
