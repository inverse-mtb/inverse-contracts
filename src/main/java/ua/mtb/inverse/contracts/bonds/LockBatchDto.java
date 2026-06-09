package ua.mtb.inverse.contracts.bonds;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LockBatchDto {
  private LocalDateTime now;
  private int batchSize;
}
