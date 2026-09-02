package ua.mtb.inverse.contracts.balance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BalanceV2Request {
  private String isin;
  private String custodianAccount;
}
