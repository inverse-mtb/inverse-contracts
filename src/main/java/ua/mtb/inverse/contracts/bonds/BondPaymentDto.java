package ua.mtb.inverse.contracts.bonds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BondPaymentDto {
  private Long id;
  private LocalDate date;
  private BigDecimal value;
  private Integer type;
  private Long bondId;
}
