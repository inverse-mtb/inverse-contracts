package ua.mtb.inverse.contracts.purchase;

import jakarta.validation.constraints.NotEmpty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationTransactionRequests {
  @NotEmpty private List<NotificationRequest> requestList;
}
