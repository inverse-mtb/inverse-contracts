package ua.mtb.inverse.contracts.purchase;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class SummaryReportPurchaseDto {
  private String isin;
  private Long summaryAmount;
  private BigDecimal summaryPrice;
}
