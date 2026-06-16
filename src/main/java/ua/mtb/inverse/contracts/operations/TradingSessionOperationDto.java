package ua.mtb.inverse.contracts.operations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.IssueCurrency;
import ua.mtb.inverse.contracts.enums.OperationStatus;
import ua.mtb.inverse.contracts.enums.SessionType;
import ua.mtb.inverse.contracts.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradingSessionOperationDto {
  private Long id;
  private TransactionType transactionType;
  private Long operationId;
  private OffsetDateTime createdAt;
  private String clientName;
  private String identifyCode;
  private String isin;
  private Integer isinQuantity;
  private OperationStatus status;
  private SessionType sessionType;
  private BigDecimal price;
  private BigDecimal totalPrice;
  private String operationAgreementNumber;
  private String operationAgreementDate;
  private String generalAgreementNumber;
  private String generalAgreementDate;
  private String custodianAccountNumber;
  private String contragentId;
  private String diiaId;
  private IssueCurrency currency;
  private LocalDate maturityDate;
}
