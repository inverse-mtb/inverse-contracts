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
public class CloseDealRequest {
  @JsonProperty("dealid")
  private String dealId;
}
