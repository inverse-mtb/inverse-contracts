package ua.mtb.inverse.contracts.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Статус угоди")
public enum AgreementStatus {

    @Schema(description = "Угода знаходиться в обробці")
    IN_PROGRESS,

    @Schema(description = "Угоду успішно виконано")
    COMPLETED,

    @Schema(description = "Угоду відхилено")
    REJECTED,

    @Schema(description = "Угоду анульовано")
    CANCELED
}