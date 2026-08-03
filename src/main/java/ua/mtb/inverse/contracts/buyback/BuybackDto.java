package ua.mtb.inverse.contracts.buyback;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuybackDto {
  @NotNull @Positive private Long id;
  private Integer version;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private ClientDto client;
  private String isin;
  private Integer quantity;
  private BigDecimal sellPrice;
  private BigDecimal totalPrice;
  private String sellAgreementNumber;
  private String sellAgreementDate;
  private String diiaRequestId;
  private DocumentCategory documentCategory;
  private OperationStatus status;
  private Map<String, String> clientChanges;
  private String ibanToReceive;
  private Long limitId;
  private LocalDateTime snapshotTakenAt;
  private LocalDateTime buybackValidTill;
  private String custodianRequestId;
  private LocalDateTime nextRetryAt;
  private int retryAttempt;
  private DiiaStatus diiaStatus;
  private IssueCurrency currency;
  private LocalDate maturityDate;
  private LocalDateTime dealCompletedAt;
  private String contragentId;
  private OffsetDateTime diiaCallbackBuybackReceivedAt;
}
