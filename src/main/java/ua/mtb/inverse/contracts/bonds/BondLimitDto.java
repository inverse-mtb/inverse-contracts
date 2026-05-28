package ua.mtb.inverse.contracts.bonds;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BondLimitDto {
  private Long id;
  private Integer version;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private BigDecimal askPrice;
  private Integer sellAmount;
  private LocalDate tradeDate;
  private OffsetDateTime manuallyUpdatedAt;
  private LocalDateTime validTill;
  private Long bondId;
}
