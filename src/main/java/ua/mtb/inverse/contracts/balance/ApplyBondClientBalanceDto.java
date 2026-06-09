package ua.mtb.inverse.contracts.balance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplyBondClientBalanceDto {
  private Long clientId;
  private String isin;
  private Long delta;
  private String operation;
  private Long referenceId;
  private Boolean buyInApp;
}
