package ua.mtb.inverse.contracts.additionalcontract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdditionalContractNumberOperationRequest {

  private TransactionType operationType;
  private Long operationId;
}
