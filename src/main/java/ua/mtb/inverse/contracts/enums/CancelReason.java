package ua.mtb.inverse.contracts.enums;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Schema(
        description =
                """
                Причина скасування купівлі облігацій.
        
                Можливі значення:
                - CHANGED_MIND — передумав купувати;
                - CHANGE_AMOUNT_OR_QUANTITY — хочу змінити суму або кількість;
                - CHANGE_BONDS — хочу обрати інші облігації;
                - UNSATISFIED_WITH_CONDITIONS — не влаштовують умови;
                - BUY_LATER — хочу купити пізніше.
                """
)
public enum CancelReason {

    CHANGED_MIND("Передумав купувати"),

    CHANGE_AMOUNT_OR_QUANTITY("Хочу змінити суму або кількість"),

    CHANGE_BONDS("Хочу обрати інші облігації"),

    UNSATISFIED_WITH_CONDITIONS("Не влаштовують умови"),

    BUY_LATER("Хочу купити пізніше");

    private final String description;
}