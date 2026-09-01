package ua.mtb.inverse.contracts.bonds;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BondLimitV2ResponseDto {

  private Long id;

  private Integer version;

  private OffsetDateTime createdAt;

  private OffsetDateTime updatedAt;

  private Long bondId;

  private TransactionType transactionType;

  private BigDecimal price;

  private Integer amount;

  private BigDecimal pitRate;

  private BigDecimal militaryLevy;

  private OffsetDateTime validFrom;

  private OffsetDateTime validTo;

  private OffsetDateTime manuallyUpdatedAt;
}
