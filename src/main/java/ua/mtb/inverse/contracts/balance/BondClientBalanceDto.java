package ua.mtb.inverse.contracts.balance;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BondClientBalanceDto {
  private Long clientId;
  private String isin;
  private Long quantity;
  private Long quantityBuyInApp;
  private LocalDateTime updatedAt;
}
