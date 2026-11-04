package ua.mtb.inverse.contracts.kafka;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OpenDealBuybackAlertMessage {
  private String sourceService;

  private String operation;

  private OffsetDateTime eventDateTime;

  private Long buybackId;

  private String custodianRequestId;

  private String contragentId;

  private String clientId;

  private String isin;

  private String agreementNumber;

  private String currency;

  private Integer quantity;

  private BigDecimal price;

  private String ibanToReceive;

  private String status;

  private String errorMessage;
}
