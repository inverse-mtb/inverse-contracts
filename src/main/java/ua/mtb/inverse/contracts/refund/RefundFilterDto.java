package ua.mtb.inverse.contracts.refund;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import ua.mtb.inverse.contracts.enums.RefundStatus;

@Data
@AllArgsConstructor
public class RefundFilterDto {
  private String beneficiary;
  private String identifyCode;
  private String executor;
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private List<RefundStatus> statuses;
}
