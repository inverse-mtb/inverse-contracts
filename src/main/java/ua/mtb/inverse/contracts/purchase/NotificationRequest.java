package ua.mtb.inverse.contracts.purchase;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {
  @JsonProperty("dealid")
  private Integer dealId;

  @JsonProperty("callpoint")
  private Integer callPoint;

  @JsonProperty("idbusprocess")
  private Integer idBusProcess;
}
