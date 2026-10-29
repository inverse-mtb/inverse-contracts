package ua.mtb.inverse.contracts.bonds;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.LimitUpdateSource;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BondLimitV2RequestDto {
  @NotNull private TransactionType transactionType;

  @NotNull @PositiveOrZero private BigDecimal price;

  @NotNull @PositiveOrZero private Integer amount;

  private BigDecimal pitRate;

  private BigDecimal militaryLevy;

  @NotNull private OffsetDateTime validFrom;

  @NotNull private OffsetDateTime validTo;

  @NotNull private LimitUpdateSource updateSource;
}
