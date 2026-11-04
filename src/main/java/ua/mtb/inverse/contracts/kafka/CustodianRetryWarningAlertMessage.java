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
public class CustodianRetryWarningAlertMessage {

  String sourceService;
  String operation;
  OffsetDateTime eventDateTime;

  Long operationId;

  String diiaRequestId;
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

  Integer custodianStatusCode;
  String custodianStatusMessage;
}
