package ua.mtb.inverse.contracts.deal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.diia.ErrorData;
import ua.mtb.inverse.contracts.purchase.ResponseErrorData;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloseDealResponse {
  private ErrorData error;
  private ResponseErrorData response;
}
