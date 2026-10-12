package ua.mtb.inverse.contracts.diia;

import java.time.OffsetDateTime;
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
  private String contragentId;
  private String requestId;
  private EventType eventType;
  private OperationStatus operationStatus;
  private OffsetDateTime executeAt;
  private boolean processed;
}
