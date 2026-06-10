package ua.mtb.inverse.contracts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClaimBatchDto {
  private String workerId;
  private int batchSize;
  private int leaseSeconds;
}
