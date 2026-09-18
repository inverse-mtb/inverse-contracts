package ua.mtb.inverse.contracts.balance;

public record BalanceReconciliationItem(
    Long clientId, String isin, String custodianAccountNumber, Long internalQuantity) {}
