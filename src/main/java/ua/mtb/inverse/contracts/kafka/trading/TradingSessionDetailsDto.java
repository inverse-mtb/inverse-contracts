package ua.mtb.inverse.contracts.kafka.trading;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.OperationStatus;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TradingSessionDetailsDto {
  private String isin;

  private TransactionType operationType;

  private OperationStatus operationStatus;

  private String generalAgreementNumber;

  private String generalAgreementDate;

  private BigDecimal totalPrice;

  private String contragentId;
}
