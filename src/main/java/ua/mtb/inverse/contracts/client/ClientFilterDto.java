package ua.mtb.inverse.contracts.client;

import lombok.Data;
import ua.mtb.inverse.contracts.enums.ClientStatus;

@Data
public class ClientFilterDto {
  private String query;
  private ClientStatus status;
}
