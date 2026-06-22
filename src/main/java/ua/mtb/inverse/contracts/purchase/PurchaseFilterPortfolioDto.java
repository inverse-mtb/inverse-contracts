package ua.mtb.inverse.contracts.purchase;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.IssueCurrency;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Параметри фільтрації портфеля придбаних облігацій")
public class PurchaseFilterPortfolioDto {

    @NotNull
    @Schema(
        description = "Ідентифікатор контрагента клієнта",
        example = "123456789")
    private String contragentId;

    @Schema(
        description =
            """
            Валюта облігацій.
  
            Можливі значення:
            - UAH — гривня;
            - USD — долар США;
            - EUR — євро.
            """,
        example = "[\"UAH\", \"USD\"]")
    private List<IssueCurrency> currency;

    @Schema(
        description = "Початкова дата періоду придбання облігацій",
        example = "2026-01-01")
    private LocalDate startDate;

    @Schema(
        description = "Кінцева дата періоду придбання облігацій",
        example = "2026-12-31")
    private LocalDate endDate;
}
