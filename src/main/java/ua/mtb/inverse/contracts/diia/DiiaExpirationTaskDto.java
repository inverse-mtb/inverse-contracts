package ua.mtb.inverse.contracts.diia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.EventType;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiiaExpirationTaskDto {
  private Long id;
  private String requestId;
  private EventType eventType;
  private LocalDateTime executeAt;
  private boolean processed;
}
