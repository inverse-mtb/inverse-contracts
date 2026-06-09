package ua.mtb.inverse.contracts.purchase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.client.ClientDto;
import ua.mtb.inverse.contracts.enums.DiiaStatus;
import ua.mtb.inverse.contracts.enums.DocumentCategory;
import ua.mtb.inverse.contracts.enums.OperationStatus;
import ua.mtb.inverse.contracts.enums.SessionType;
import ua.mtb.inverse.contracts.refund.RefundDataDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseDto {
  private Long id;
  private Integer version;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private ClientDto client;
  private String isin;
  private String clientAccountId;
  private String clientIbanShortToPay;
  private String clientIbanToPay;
  private Integer quantity;
  private BigDecimal purchasePrice;
  private BigDecimal totalPrice;
  private SessionType sessionType;
  private OperationStatus status;
  private String purchaseAgreementNumber;
  private String purchaseAgreementDate;
  private String diiaRequestId;
  private String contragentId;
  private LocalDateTime purchaseValidTill;
  private LocalDateTime snapshotTakenAt;
  private Long limitId;
  private String dealDate;
  private DocumentCategory documentCategory;
  private RefundDataDto refundData;
  private String ibanToReceive;
  private Map<String, String> clientChanges;
  private DiiaStatus diiaStatus;
}
