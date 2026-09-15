package ua.mtb.inverse.contracts.balance;

public record BalanceCorrectionResult(int requested, int applied, int skipped) {}
