package ua.mtb.inverse.contracts;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClaimBatchDto {
  @NotBlank private String workerId;

  @Min(1)
  @Max(100)
  private int batchSize;

  @Min(30)
  @Max(3600)
  private int leaseSeconds;
}
