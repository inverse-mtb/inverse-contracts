package ua.mtb.inverse.contracts.purchase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseErrorData {
  @JsonProperty("errorcode")
  private Integer errorCode;

  @JsonProperty("errortext")
  private String errorText;
}
