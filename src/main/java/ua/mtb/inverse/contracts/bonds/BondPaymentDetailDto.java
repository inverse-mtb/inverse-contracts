package ua.mtb.inverse.contracts.bonds;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BondPaymentDetailDto {
  private LocalDate date;
  private BigDecimal value;
  private Integer type;
  private BigDecimal totalValue; // value × purchase quantity
}
