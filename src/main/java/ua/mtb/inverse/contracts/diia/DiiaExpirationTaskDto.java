package ua.mtb.inverse.contracts.diia;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.EventType;
import ua.mtb.inverse.contracts.enums.OperationStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiiaExpirationTaskDto {
  private Long id;
  private String requestId;
  private EventType eventType;
  private OperationStatus operationStatus;
  private LocalDateTime executeAt;
  private boolean processed;
}
