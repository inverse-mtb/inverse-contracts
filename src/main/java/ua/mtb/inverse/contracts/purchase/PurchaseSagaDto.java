package ua.mtb.inverse.contracts.purchase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.SagaState;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseSagaDto {
  private Long id;
  private Integer version;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private String diiaRequestId;
  private SagaState state;
  private LocalDateTime scheduledTime;
  private Integer dealId;
  private String custodianRequestId;
  private int phase2RetryCount;
}
