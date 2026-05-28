package ua.mtb.inverse.contracts.client;

import lombok.Builder;
import lombok.Data;
import ua.mtb.inverse.contracts.enums.OperationStatus;
import ua.mtb.inverse.contracts.enums.SessionType;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@Builder
public class CustodialActivityDto {
  private Long id;
  private Long operationId;
  private SessionType sessionType;
  private TransactionType transactionType;
  private String clientName;
  private String identifyCode;
  private String custodianAccountNumber;
  private OperationStatus status;
}
