package ua.mtb.inverse.contracts.balance;

public record BalanceCorrection(
    Long clientId, String isin, Long expectedQuantity, Long custodianQuantity, Long delta) {}
