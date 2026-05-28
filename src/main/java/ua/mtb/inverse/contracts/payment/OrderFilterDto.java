package ua.mtb.inverse.contracts.payment;

import java.util.List;
import lombok.Data;
import ua.mtb.inverse.contracts.enums.OperationStatus;
import ua.mtb.inverse.contracts.enums.SessionType;

@Data
public class OrderFilterDto {
  private String isin;
  private String clientName;
  private String identifyCode;
  private String custodianAccountNumber;
  private List<SessionType> sessionTypes;
  private List<OperationStatus> statuses;
}
