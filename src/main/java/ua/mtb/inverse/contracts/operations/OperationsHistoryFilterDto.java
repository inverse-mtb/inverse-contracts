package ua.mtb.inverse.contracts.operations;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.AgreementStatus;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Фільтр для пошуку операцій клієнта")
public class OperationsHistoryFilterDto {

  @Schema(description = "Ідентифікатор контрагента клієнта", example = "1234567890")
  @NotNull
  private String contragentId;

  @Schema(
      description =
          """
            Тип операції:
            PURCHASE - купівля облігацій;
            BUYBACK - продаж облігацій.

            Якщо поле пусте - вважаємо що потрібно віддати всі операції.
            """)
  private TransactionType type;

  @Schema(
      description =
          """
            Статус угоди:
            CREATED - створено;
            IN_PROGRESS - в обробці;
            FUNDS_CHARGED - кошти списано;
            AWAITING_SECURITIES_DELIVERY - розпочато переоформлення документів;
            COMPLETED - виконано;
            CANCELED - відхилено;
            FAILED - анульовано.
            """)
  private List<AgreementStatus> status;

  @Schema(description = "Початкова дата періоду пошуку операцій", example = "2026-03-01")
  private LocalDate startDate;

  @Schema(description = "Кінцева дата періоду пошуку операцій", example = "2026-06-01")
  private LocalDate endDate;

  @Hidden private boolean forAnalytics;
}
