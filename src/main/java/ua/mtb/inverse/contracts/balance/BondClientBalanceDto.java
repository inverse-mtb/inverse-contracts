package ua.mtb.inverse.contracts.balance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
