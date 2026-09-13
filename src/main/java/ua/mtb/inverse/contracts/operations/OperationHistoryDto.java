package ua.mtb.inverse.contracts.operations;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.IssueCurrency;
import ua.mtb.inverse.contracts.enums.OperationStatus;
import ua.mtb.inverse.contracts.enums.SessionType;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperationHistoryDto {

  private Long id;

  private TransactionType transactionType;

  private OffsetDateTime createdAt;

  private String clientName;
  private String identifyCode;

  private String isin;

  private Integer quantity;
  private Integer actualQuantity;

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
  private String diiaRequestId;

  private IssueCurrency currency;
  private LocalDate maturityDate;
}
