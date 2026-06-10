package ua.mtb.inverse.contracts.purchase;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ua.mtb.inverse.contracts.enums.SagaState;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseSagaDto {
  private Long id;
  @NotNull
  private Integer version;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  @NotBlank
  @NonNull
  private String diiaRequestId;
  private SagaState state;
  private LocalDateTime scheduledTime;
  @NotNull
  private Integer dealId;
  private String custodianRequestId;
  private int phase2RetryCount;
}
