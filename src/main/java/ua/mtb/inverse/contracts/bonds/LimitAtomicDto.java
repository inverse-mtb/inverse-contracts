package ua.mtb.inverse.contracts.bonds;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LimitAtomicDto {
  @NotNull @Positive private Long limitId;
  private int quantity;
}
