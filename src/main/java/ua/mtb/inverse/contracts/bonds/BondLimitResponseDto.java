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
public class BondLimitResponseDto extends BaseBondLimitResponseDto {

  private BigDecimal askPrice;

  private Integer sellAmount;
}
