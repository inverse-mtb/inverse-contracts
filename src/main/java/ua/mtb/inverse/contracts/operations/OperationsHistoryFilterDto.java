package ua.mtb.inverse.contracts.operations;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.AgreementStatus;
import ua.mtb.inverse.contracts.enums.TransactionType;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Фільтр для пошуку операцій клієнта")
public class OperationsHistoryFilterDto {

    @Schema(
        description = "Ідентифікатор контрагента клієнта",
        example = "1234567890")
    private String contragentId;

    @Schema(
        description = """
            Тип операції:
            PURCHASE - купівля облігацій;
            BUYBACK - продаж облігацій.
            """)
    private TransactionType type;

    @Schema(
        description = """
            Статус угоди:
            IN_PROGRESS - в обробці;
            COMPLETED - виконано;
            REJECTED - відхилено;
            CANCELED - анульовано.
            """)
    private AgreementStatus status;

    @Schema(
        description = "Початкова дата періоду пошуку операцій",
        example = "2026-03-01")
    private LocalDate startDate;

    @Schema(
        description = "Кінцева дата періоду пошуку операцій",
        example = "2026-06-01")
    private LocalDate endDate;
}