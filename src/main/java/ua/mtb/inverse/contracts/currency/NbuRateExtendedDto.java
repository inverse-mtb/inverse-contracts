package ua.mtb.inverse.contracts.currency;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NbuRateExtendedDto {
  private Long id;
  private Integer currencyId;
  private String symbolCode;
  private BigDecimal rate;
  private OffsetDateTime currencyDate;
}
