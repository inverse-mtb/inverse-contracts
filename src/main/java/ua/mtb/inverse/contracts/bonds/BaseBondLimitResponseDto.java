package ua.mtb.inverse.contracts.bonds;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import lombok.Data;
import ua.mtb.inverse.contracts.enums.IssueCurrency;

@Data
public class BaseBondLimitResponseDto {

  private Long id;

  private String isin;

  private IssueCurrency issueCurrency;

  private LocalDate tradeDate;

  private LocalDateTime validTill;

  private OffsetDateTime manuallyUpdatedAt;
}
