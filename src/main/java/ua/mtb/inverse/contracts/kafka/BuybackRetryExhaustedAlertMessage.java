package ua.mtb.inverse.contracts.kafka;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuybackRetryExhaustedAlertMessage {
  String sourceService;
  String operation;
  OffsetDateTime eventDateTime;

  Long buybackId;
  String custodianRequestId;
  String contragentId;
  String clientId;

  String isin;
  String agreementNumber;
  String currency;
  BigDecimal quantity;
  BigDecimal price;
  String ibanToReceive;
  String status;

  Integer retryAttempt;
  String errorMessage;
}
