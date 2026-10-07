package ua.mtb.inverse.contracts.bonds;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LockBatchDto {
  private OffsetDateTime now;
  private int batchSize;
}
