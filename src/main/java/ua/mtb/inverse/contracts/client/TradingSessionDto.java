package ua.mtb.inverse.contracts.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.OperationStatus;
import ua.mtb.inverse.contracts.enums.SessionType;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TradingSessionDto {
  private Long id;
  private Long operationId;
  private SessionType sessionType;
  private String clientName;
  private String identifyCode;
  private TransactionType transactionType;
  private String isin;
  private Integer isinQuantity;
  private OperationStatus status;
  private String operationAgreementDate;
}
