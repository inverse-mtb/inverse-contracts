package ua.mtb.inverse.contracts.deal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CancelDealRequest {
  @JsonProperty("dealid")
  private String dealId;

  @JsonProperty("platpurpose")
  private String platPurpose;
}
