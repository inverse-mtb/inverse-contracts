package ua.mtb.inverse.contracts.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Тип операції")
public enum TransactionType {

  @Schema(description = "Купівля облігацій")
  PURCHASE,

  @Schema(description = "Продаж облігацій")
  BUYBACK
}