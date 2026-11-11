package ua.mtb.inverse.contracts.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountNumReserveDto {
  private String nssmcClientTypeCode;
  private String cnum;
  private String clientTypeCode;
  private String country;
}
