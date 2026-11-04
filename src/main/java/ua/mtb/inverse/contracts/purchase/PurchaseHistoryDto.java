package ua.mtb.inverse.contracts.purchase;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.ClientOperationStatus;
import ua.mtb.inverse.contracts.enums.DocumentCategory;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseHistoryDto {
  private Long id;
  private OffsetDateTime date;
  private String operationType;
  private DocumentCategory documentCategory;
  private BigDecimal amount;
  private ClientOperationStatus status;
  private String isin;
  private Integer quantity;
  private String agreementNumber;
  private String agreementDate;

  public String getOperationType() {
    if (documentCategory == null) {
      return "Невідомо";
    }

    return switch (documentCategory) {
      case PURCHASE_FIRST, PURCHASE_FIRST_CURRENCY -> "Документи першої покупки";
      case PURCHASE, PURCHASE_CURRENCY -> "Документи повторної покупки";
      case PURCHASE_IBAN_TO_PAY_CHANGES, PURCHASE_IBAN_TO_PAY_CHANGES_CURRENCY ->
          "Документи повторної покупки зміна айбану оплати";
      case PURCHASE_IBAN_TO_RECEIVE_CHANGES, PURCHASE_IBAN_TO_RECEIVE_CHANGES_CURRENCY ->
          "Документи повторної покупки зміна айбану отримання";
      case PURCHASE_USER_CHANGES, PURCHASE_USER_CHANGES_CURRENCY ->
          "Документи повторної покупки зміна полів користувача";
      case CANCEL_PURCHASE, CANCEL_BUYBACK -> "Документи скасування";
      case BUYBACK, BUYBACK_CURRENCY -> "Договір купівлі-продажу (зворотній викуп)";
      case BUYBACK_USER_CHANGES, BUYBACK_USER_CHANGES_CURRENCY ->
          "Договір купівлі-продажу (зворотній викуп з додатком зміна полів користувача)";
      case BUYBACK_IBAN_TO_RECEIVE_CHANGES, BUYBACK_IBAN_TO_RECEIVE_CHANGES_CURRENCY ->
          "Договір купівлі-продажу (зворотній викуп з додатком зміна айбану отримання)";
    };
  }
}
