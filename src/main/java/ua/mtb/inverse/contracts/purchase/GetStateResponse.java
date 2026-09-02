package ua.mtb.inverse.contracts.purchase;

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
public class GetStateResponse {
  private String errorCode;
  private String errorMessage;
  private String requestState;
  private Boolean filePresent;
  private String reportErrorMessage;
  private String incidentId;
}
