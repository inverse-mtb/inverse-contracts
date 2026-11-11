package ua.mtb.inverse.contracts.buyback;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RetryBuybackDto {
  private LocalDateTime nextRetryTime;
  @NotNull @Positive private Long buybackId;
}
