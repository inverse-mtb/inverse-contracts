package ua.mtb.inverse.contracts.kafka;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OpenDealPurchaseAlertMessage {
  String sourceService;
  String operation;
  String eventDateTime;

  Long purchaseId;
  String diiaRequestId;
  String contragentId;

  String isin;
  String agreementNumber;
  String quantity;
  BigDecimal price;

  Integer b2ErrorCode;
  String b2ErrorMessage;

  Integer b2ResponseErrorCode;
  String b2ResponseErrorText;

  String responseBody;
}
