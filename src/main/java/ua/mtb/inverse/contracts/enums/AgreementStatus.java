package ua.mtb.inverse.contracts.enums;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description = "Статус угоди")
public enum AgreementStatus {

    @Schema(description = "Угоду створено")
    CREATED,

    @Schema(description = "Угода знаходиться в обробці")
    IN_PROGRESS,

    @Schema(description = "Кошти списано")
    FUNDS_CHARGED,

    @Schema(description = "Угоду успішно виконано")
    COMPLETED,

    @Schema(description = "Угоду відхилено")
    CANCELED,

    @Schema(description = "Угоду анульовано")
    FAILED;

    public List<OperationStatus> getDocTypes() {
        return switch (this) {
            case  CREATED ->
                    List.of(OperationStatus.INITIATED, OperationStatus.DOCUMENTS_GENERATED, OperationStatus.WAITING_FOR_SIGNATURE);

            case IN_PROGRESS ->
                    List.of(OperationStatus.SIGNED, OperationStatus.DOCUMENTS_SEND);

            case FUNDS_CHARGED ->
                    List.of(OperationStatus.FUNDS_CHARGED);

            case COMPLETED ->
                    List.of(OperationStatus.COMPLETED, OperationStatus.COMPLETED_EXTERNALLY);

            case CANCELED ->
                    List.of(OperationStatus.CANCELLED);

            case FAILED ->
                    List.of(OperationStatus.FAILED);
        };
    }

    public AgreementStatus getAgreementStatus(OperationStatus operationStatus) {
        return switch (operationStatus) {
            case INITIATED, DOCUMENTS_GENERATED, WAITING_FOR_SIGNATURE -> CREATED;

            case SIGNED, DOCUMENTS_SEND -> IN_PROGRESS;

            case FUNDS_CHARGED -> FUNDS_CHARGED;

            case COMPLETED, COMPLETED_EXTERNALLY -> COMPLETED;

            case CANCELLED -> CANCELED;

            case FAILED -> FAILED;
        };
    }
}