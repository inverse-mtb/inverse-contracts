package ua.mtb.inverse.contracts.bonds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.IssueCurrency;
import ua.mtb.inverse.contracts.enums.YieldType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BondDto {
  private Long id;
  private String isin;
  private YieldType yieldType;
  private BigDecimal calcRate;
  private BigDecimal yieldRate;
  @Builder.Default private BigDecimal nominalPrice = new BigDecimal("1000.00");
  private BigDecimal askPrice;
  private Integer sellAmount;
  private IssueCurrency currencyCode;
  private String issueCurrency;
  private LocalDate releaseDate;
  private LocalDate maturityDate;
  @Builder.Default private List<Coupon> payments = new ArrayList<>();
  private String imagePath;
  private String bondName;
  private Boolean isVisible;
}
