package ua.mtb.inverse.contracts.operations;

import jakarta.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.client.ClientDto;
import ua.mtb.inverse.contracts.enums.DiiaStatus;
import ua.mtb.inverse.contracts.enums.DocumentCategory;
import ua.mtb.inverse.contracts.enums.IssueCurrency;
import ua.mtb.inverse.contracts.enums.OperationStatus;
import ua.mtb.inverse.contracts.enums.SessionType;
import ua.mtb.inverse.contracts.enums.TransactionType;
import ua.mtb.inverse.contracts.refund.RefundDataDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperationDto {

  private Long id;
  private Integer version;

  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;

  @Valid private ClientDto client;

  private TransactionType transactionType;

  private String isin;

  private Integer quantity;
  private Integer actualQuantity;

  private BigDecimal price;
  private BigDecimal totalPrice;

  private OperationStatus status;
  private SessionType sessionType;

  private String operationAgreementNumber;
  private String operationAgreementDate;

  private String diiaRequestId;
  private String contragentId;

  private Long limitId;

  private DocumentCategory documentCategory;

  private Map<String, String> clientChanges;

  private DiiaStatus diiaStatus;

  private IssueCurrency currency;
  private LocalDate maturityDate;

  private OffsetDateTime snapshotTakenAt;
  private OffsetDateTime snapshotCancelTakenAt;

  private OffsetDateTime diiaCallbackReceivedAt;

  private OffsetDateTime deliveryDate;
  private OffsetDateTime completedAt;

  private String ibanToReceive;

  private RefundDataDto refundData;

  /*
   * PURCHASE-specific fields.
   */

  private String clientAccountId;
  private String ibanToPay;
  private BigDecimal calcRate;

  /*
   * Temporary BUYBACK-specific fields.
   *
   * TODO: move to operation saga.
   */

  private Integer dealId;
  private String custodianRequestId;
  private OffsetDateTime dealCompletedAt;

  /*
   * Temporary retry fields.
   *
   * TODO: move retry state to separate saga/retry DTO.
   */

  private OffsetDateTime nextRetryAt;
  private OffsetDateTime retryClaimedAt;
  private String retryClaimedBy;
  private int retryAttempt;
}
