package ua.mtb.inverse.contracts.bonds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "Інформація про окрему виплату за облігацією")
public class Coupon {

  @Schema(description = "Дата виплати", example = "2026-07-16")
  private LocalDate date;

  @Schema(description = "Сума виплати на одну облігацію", example = "40.87")
  private BigDecimal value;

  @Schema(
      description =
          """
                Тип виплати.

                Можливі значення:
                - 1 — виплата відсотків;
                - 2 — погашення облігації.
                """,
      example = "1")
  private Integer type;
}
