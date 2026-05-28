package ua.mtb.inverse.contracts.enums;

/**
 * Client account status
 *
 * @author Oleksandr Pavliuk
 */
public enum ClientStatus {
  ACTIVE,
  BLOCKED,
  DELETED;

  public String getLabel() {
    return switch (this) {
      case ACTIVE -> "Активний";
      case BLOCKED -> "Заблокований";
      case DELETED -> "Видалений";
    };
  }
}
