package ua.mtb.inverse.contracts.currency;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public record NbuRateDto(
    Integer currencyId, String symbolCode, BigDecimal rate, OffsetDateTime currencyDate) {}
