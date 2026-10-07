package ua.mtb.inverse.contracts.enums;

public enum ContractType {
  GENERAL_AGREEMENT("БОМ"),
  PURCHASE_AGREEMENT("ДДМ");

  public final String prefix;

  ContractType(String prefix) {
    this.prefix = prefix;
  }
}
