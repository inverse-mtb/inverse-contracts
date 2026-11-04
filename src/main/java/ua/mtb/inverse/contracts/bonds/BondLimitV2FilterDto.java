package ua.mtb.inverse.contracts.bonds;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.IssueCurrency;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BondLimitV2FilterDto {
  private OffsetDateTime validFromFrom;
  private OffsetDateTime validFromTo;

  private OffsetDateTime validToFrom;
  private OffsetDateTime validToTo;

  private BigDecimal priceFrom;
  private BigDecimal priceTo;

  private List<TransactionType> transactionTypes;

  private List<IssueCurrency> issueCurrencies;

  private String isin;
}
