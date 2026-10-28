package ua.mtb.inverse.contracts.buyback;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RetryOperationDto {

  @NotNull @Positive private Long operationId;

  @NotNull private OffsetDateTime nextRetryTime;

  @NotNull private TransactionType transactionType;
}
