package ua.mtb.inverse.contracts;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.OperationStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SummaryReportData {
  private Integer agreementNumber;
  private String buyerName;
  private String identifyCode;
  private String purchaseAgreementNumber;
  private String purchaseAgreementDate;
  private BigDecimal totalPrice;
  private String eminentBank;
  private String OVDPType;
  private String isin;
  private BigDecimal purchasePrice;
  private Integer quantity;
  private LocalDate purchaseBankDate;
  private BigDecimal priceBank;
  private BigDecimal yieldRate;
  private LocalDate maturityDate;
  private BigDecimal yieldRateDatePurchase;
  private BigDecimal yieldRateDateEndOwnership;
  private BigDecimal clearYield;
  private String paymentDate;
  private LocalDateTime paymentReRegistration;
  private OperationStatus status;
  private String operationType;
  private LocalDate refundDate;
}
