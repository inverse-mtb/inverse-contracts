package ua.mtb.inverse.contracts.kafka.trading;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TradingSessionDetailsDto {
  private Long operationId;

  private String isin;

  private String operationType;

  private String operationStatus;

  private LocalDate operationDate;

  private BigDecimal quantity;

  private BigDecimal price;

  private BigDecimal amount;
}
