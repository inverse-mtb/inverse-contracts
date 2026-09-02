package ua.mtb.inverse.contracts.reserve;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.LimitType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReserveDto {
  private Long id;
  private Integer version;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  @NotNull @Positive private Long ownerId;
  @NotNull @Positive private Long clientId;
  private LimitType limitType;
  @NotNull @Positive private Long limitId;
  @NotNull private Integer quantity;
  private LocalDateTime expireAt;
  @Builder.Default private boolean released = false;
}
