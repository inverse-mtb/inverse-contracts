package ua.mtb.inverse.contracts.diia;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class B2Response {
  @JsonProperty("errorcode")
  private Integer errorCode;

  @JsonProperty("errortext")
  private String errorText;
}
