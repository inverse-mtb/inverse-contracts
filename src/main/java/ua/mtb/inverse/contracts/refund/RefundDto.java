package ua.mtb.inverse.contracts.refund;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.RefundStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefundDto {
  private Long purchaseId;
  private LocalDate refundDate;
  private String refundReason;
  private String agreementNumber;
  private String payer;
  private String payerIban;
  private String beneficiary;
  private String beneficiaryIban;
  private String beneficiaryIdentifyCode;
  private String executor;
  private BigDecimal totalPrice;
  private RefundStatus status;
}
