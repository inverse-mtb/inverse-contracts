package ua.mtb.inverse.contracts.payment;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.Data;
import ua.mtb.inverse.contracts.enums.OperationStatus;

@Data
public class PaymentPageDto {
  private Long purchaseId;
  private OffsetDateTime purchaseDateTime;
  private String clientName;
  private String clientIdentifyCode;
  private String clientIban;
  private BigDecimal totalPrice;
  private OperationStatus status;
}
