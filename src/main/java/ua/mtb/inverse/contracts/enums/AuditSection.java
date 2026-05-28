package ua.mtb.inverse.contracts.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AuditSection {
  BOND_DIRECTORY("Довідник облігацій"),
  BOND_LIMITS("Ліміти облігацій");

  private final String label;

  AuditSection(String label) {
    this.label = label;
  }

  /**
   * Returns Ukrainian label for JSON serialization @JsonValue tells Jackson to use this method
   * instead of the enum name
   */
  @JsonValue
  public String getLabel() {
    return switch (this) {
      case BOND_DIRECTORY -> "Довідник облігацій";
      case BOND_LIMITS -> "Ліміти";
    };
  }
}
