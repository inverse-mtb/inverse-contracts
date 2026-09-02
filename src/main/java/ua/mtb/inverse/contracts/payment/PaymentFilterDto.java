package ua.mtb.inverse.contracts.payment;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import ua.mtb.inverse.contracts.enums.OperationStatus;

@Data
public class PaymentFilterDto {
  private String clientName;
  private String identifyCode;
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private List<OperationStatus> statuses;
  private String operationAgreementDate;
}
