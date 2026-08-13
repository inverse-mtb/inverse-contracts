package ua.mtb.inverse.contracts;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SummaryErrorReportData {
    private Integer agreementNumber;
    private String purchaseAgreementDate;
    private String operationType;
    private String identifyCode;
    private String isin;
    private BigDecimal totalPrice;
    private Integer quantity;
}
