package ua.mtb.inverse.contracts.kafka;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.EventType;
import ua.mtb.inverse.contracts.enums.PushNotificationsResult;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PushMessage {
  @NotNull private List<Notification> notifications;

  @Data
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Notification {
    @NotNull private Long requestId;
    @NotNull @Builder.Default private String type = "BondStateEvent";
    private Long clientId;
    private EventType process;
    private PushNotificationsResult result;
  }
}
