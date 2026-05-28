package ua.mtb.inverse.contracts.bonds;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class BondLimitBuybackResponseDto extends BaseBondLimitResponseDto {

  private BigDecimal sellPrice;

  private Integer buyAmount;

  private BigDecimal pitRate;

  private BigDecimal militaryLevy;
}
