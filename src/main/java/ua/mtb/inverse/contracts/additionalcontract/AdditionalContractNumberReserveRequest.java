package ua.mtb.inverse.contracts.additionalcontract;

import lombok.*;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdditionalContractNumberReserveRequest {

  private String mainContractNumber;
  private TransactionType operationType;
  private Long operationId;
}
