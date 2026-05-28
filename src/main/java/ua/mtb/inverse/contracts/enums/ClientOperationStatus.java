package ua.mtb.inverse.contracts.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientOperationStatus {
  ACTIVE,
  COMPLETED,
  CANCELLED,
  FAILED;

  @JsonValue
  public String getLabel() {
    return switch (this) {
      case ACTIVE -> "Активний";
      case COMPLETED -> "Виконано";
      case CANCELLED -> "Анульовано";
      case FAILED -> "Забраковано";
    };
  }

  public static ClientOperationStatus fromStatus(OperationStatus operationStatus) {
    return switch (operationStatus) {
      case INITIATED,
              DOCUMENTS_GENERATED,
              WAITING_FOR_SIGNATURE,
              SIGNED_BY_CLIENT,
              SIGNED_BY_BANK,
              DOCUMENTS_SEND,
              AWAITING_CUSTODIAN,
              FUNDS_CHARGED ->
          ACTIVE;
      case COMPLETED, COMPLETED_EXTERNALLY -> COMPLETED;
      case CANCELLED -> CANCELLED;
      case FAILED -> FAILED;
    };
  }
}
