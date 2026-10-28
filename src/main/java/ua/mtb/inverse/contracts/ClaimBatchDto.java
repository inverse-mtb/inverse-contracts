package ua.mtb.inverse.contracts;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.OperationStatus;
import ua.mtb.inverse.contracts.enums.TransactionType;

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

  @NotNull private TransactionType transactionType;

  @NotNull private OperationStatus status;

  @Min(1)
  @Max(100)
  private int maxAttempts;
}
