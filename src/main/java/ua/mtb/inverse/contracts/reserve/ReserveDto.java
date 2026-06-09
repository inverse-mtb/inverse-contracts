package ua.mtb.inverse.contracts.reserve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.LimitType;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReserveDto {
  private Long id;
  private Integer version;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private Long ownerId;
  private Long clientId;
  private LimitType limitType;
  private Long limitId;
  private Integer quantity;
  private LocalDateTime expireAt;
  private boolean released = false;
}
