package ua.mtb.inverse.contracts.refund;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.CancelReason;
import ua.mtb.inverse.contracts.enums.RefundStatus;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefundDataDto {
  private RefundStatus refundStatus;
  private LocalDate refundDate;
  private String executorName;
  private String refundReason;
  private CancelReason cancelReason;
}
