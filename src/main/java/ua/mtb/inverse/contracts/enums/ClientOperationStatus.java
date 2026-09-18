package ua.mtb.inverse.contracts.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientOperationStatus {
  ACTIVE,
  COMPLETED,
  CANCELLED,
  REVOKED,
  FAILED;

  @JsonValue
  public String getLabel() {
    return switch (this) {
      case ACTIVE -> "Активний";
      case COMPLETED -> "Виконано";
      case CANCELLED -> "Анульовано";
      case REVOKED -> "Кошти повернуто";
      case FAILED -> "Забраковано";
    };
  }

  public static ClientOperationStatus fromStatus(OperationStatus operationStatus) {
    return switch (operationStatus) {
      case INITIATED,
          DOCUMENTS_GENERATED,
          WAITING_FOR_SIGNATURE,
          SIGNED,
          DOCUMENTS_SEND,
          FUNDS_CHARGED,
          AWAITING_SECURITIES_DELIVERY ->
          ACTIVE;
      case COMPLETED, SECURITIES_DELIVERED -> COMPLETED;
      case CANCELLED -> CANCELLED;
      case REVOKED -> REVOKED;
      case FAILED, FAILED_INITIATION -> FAILED;
    };
  }
}
