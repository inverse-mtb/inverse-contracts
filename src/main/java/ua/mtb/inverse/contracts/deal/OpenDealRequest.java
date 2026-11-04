package ua.mtb.inverse.contracts.deal;

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
public class OpenDealRequest {
  @JsonProperty("ticketno")
  private String ticketNo;

  private String account;

  private String isin;

  private Integer count;

  // Цена покупки одной единицы ЦБ
  private BigDecimal amount;

  @JsonProperty("deliverydate")
  private String deliveryDate;
}
