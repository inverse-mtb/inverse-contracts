package ua.mtb.inverse.contracts.buyback;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RetryBuybackDto {
  private LocalDateTime nextRetryTime;
  private Long buybackId;
}
