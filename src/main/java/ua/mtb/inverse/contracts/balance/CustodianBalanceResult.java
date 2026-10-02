package ua.mtb.inverse.contracts.balance;

public record CustodianBalanceResult(
    Long clientId,
    String isin,
    Long internalQuantity,
    Long custodianBalance,
    boolean success,
    String error) {
  public static CustodianBalanceResult success(
      BalanceReconciliationItem item, Long custodianBalance) {

    return new CustodianBalanceResult(
        item.clientId(), item.isin(), item.internalQuantity(), custodianBalance, true, null);
  }

  public static CustodianBalanceResult failed(BalanceReconciliationItem item, String error) {

    return new CustodianBalanceResult(
        item.clientId(), item.isin(), item.internalQuantity(), null, false, error);
  }
}
