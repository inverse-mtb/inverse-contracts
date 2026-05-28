package ua.mtb.inverse.contracts.enums;

public enum RefundStatus {
  REFUNDED,
  PENDING,
  IN_PROGRESS;

  public RefundStatus getNextStatus() {
    return switch (this) {
      case PENDING -> IN_PROGRESS;
      default -> REFUNDED;
    };
  }
}
