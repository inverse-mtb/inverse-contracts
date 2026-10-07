package ua.mtb.inverse.contracts.buyback;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RetryOperationDto {
  private OffsetDateTime nextRetryTime;
  @NotNull @Positive private Long operationId;
}
