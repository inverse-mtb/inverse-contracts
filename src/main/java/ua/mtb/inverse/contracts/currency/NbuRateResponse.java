package ua.mtb.inverse.contracts.currency;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NbuRateResponse {
  private ErrorData error;
  private ResponseData response;

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class ErrorData {
    private Integer code;
    private String message;
  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class ResponseData {
    private Integer errorcode;
    private String errortext;

    @JsonAlias("nbu_rates")
    private List<NbuRateData> nbuRates;
  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class NbuRateData {
    private LocalDateTime arcdate;
    private Integer currencyid;
    private String symbolcode;
    private BigDecimal rate;
    private Integer base;
  }
}
