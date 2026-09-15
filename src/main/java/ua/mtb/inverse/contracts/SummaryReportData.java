package ua.mtb.inverse.contracts;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.OperationStatus;

@Data
@NoArgsConstructor
@Builder
public class SummaryReportData {
  private static final ZoneId KYIV_ZONE = ZoneId.of("Europe/Kyiv");

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
  private OffsetDateTime paymentReRegistration;
  private OperationStatus status;
  private String operationType;
  private LocalDate refundDate;

  /** Constructor used by BUYBACK queries where Operation.dealCompletedAt is OffsetDateTime. */
  public SummaryReportData(
      Integer agreementNumber,
      String buyerName,
      String identifyCode,
      String purchaseAgreementNumber,
      String purchaseAgreementDate,
      BigDecimal totalPrice,
      String eminentBank,
      String OVDPType,
      String isin,
      BigDecimal purchasePrice,
      Integer quantity,
      LocalDate purchaseBankDate,
      BigDecimal priceBank,
      BigDecimal yieldRate,
      LocalDate maturityDate,
      BigDecimal yieldRateDatePurchase,
      BigDecimal yieldRateDateEndOwnership,
      BigDecimal clearYield,
      String paymentDate,
      OffsetDateTime paymentReRegistration,
      OperationStatus status,
      String operationType,
      LocalDate refundDate) {
    this.agreementNumber = agreementNumber;
    this.buyerName = buyerName;
    this.identifyCode = identifyCode;
    this.purchaseAgreementNumber = purchaseAgreementNumber;
    this.purchaseAgreementDate = purchaseAgreementDate;
    this.totalPrice = totalPrice;
    this.eminentBank = eminentBank;
    this.OVDPType = OVDPType;
    this.isin = isin;
    this.purchasePrice = purchasePrice;
    this.quantity = quantity;
    this.purchaseBankDate = purchaseBankDate;
    this.priceBank = priceBank;
    this.yieldRate = yieldRate;
    this.maturityDate = maturityDate;
    this.yieldRateDatePurchase = yieldRateDatePurchase;
    this.yieldRateDateEndOwnership = yieldRateDateEndOwnership;
    this.clearYield = clearYield;
    this.paymentDate = paymentDate;
    this.paymentReRegistration = paymentReRegistration;
    this.status = status;
    this.operationType = operationType;
    this.refundDate = refundDate;
  }

  /**
   * Constructor used by PURCHASE queries where PurchaseSaga.scheduledTime is LocalDateTime.
   * scheduledTime is interpreted in Europe/Kyiv.
   */
  public SummaryReportData(
      Integer agreementNumber,
      String buyerName,
      String identifyCode,
      String purchaseAgreementNumber,
      String purchaseAgreementDate,
      BigDecimal totalPrice,
      String eminentBank,
      String OVDPType,
      String isin,
      BigDecimal purchasePrice,
      Integer quantity,
      LocalDate purchaseBankDate,
      BigDecimal priceBank,
      BigDecimal yieldRate,
      LocalDate maturityDate,
      BigDecimal yieldRateDatePurchase,
      BigDecimal yieldRateDateEndOwnership,
      BigDecimal clearYield,
      String paymentDate,
      LocalDateTime paymentReRegistration,
      OperationStatus status,
      String operationType,
      LocalDate refundDate) {

    this(
        agreementNumber,
        buyerName,
        identifyCode,
        purchaseAgreementNumber,
        purchaseAgreementDate,
        totalPrice,
        eminentBank,
        OVDPType,
        isin,
        purchasePrice,
        quantity,
        purchaseBankDate,
        priceBank,
        yieldRate,
        maturityDate,
        yieldRateDatePurchase,
        yieldRateDateEndOwnership,
        clearYield,
        paymentDate,
        toKyivOffsetDateTime(paymentReRegistration),
        status,
        operationType,
        refundDate);
  }

  private static OffsetDateTime toKyivOffsetDateTime(LocalDateTime value) {
    return value == null ? null : value.atZone(KYIV_ZONE).toOffsetDateTime();
  }
}
