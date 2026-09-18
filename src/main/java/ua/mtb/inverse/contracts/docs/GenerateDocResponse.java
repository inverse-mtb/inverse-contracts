package ua.mtb.inverse.contracts.docs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenerateDocResponse {
  private String requestId;
  private String errorMessage;
  private String errorCode;
  private String incidentId;
}
