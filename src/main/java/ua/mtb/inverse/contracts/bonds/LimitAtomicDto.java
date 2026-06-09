package ua.mtb.inverse.contracts.bonds;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LimitAtomicDto {
  private Long limitId;
  private int quantity;
}
