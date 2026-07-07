package ua.mtb.inverse.contracts.reserve;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.LimitType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReserveMarkedDto {
  @NotNull @Positive private Long ownerId;
  private LimitType type;
}
