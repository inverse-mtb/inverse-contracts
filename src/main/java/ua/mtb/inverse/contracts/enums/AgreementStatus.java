package ua.mtb.inverse.contracts.enums;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description = "Статус угоди")
public enum AgreementStatus {

    @Schema(description = "Угода знаходиться в обробці")
    IN_PROGRESS,

    @Schema(description = "Угоду успішно виконано")
    COMPLETED,

    @Schema(description = "Угоду відхилено")
    CANCELED,

    @Schema(description = "Угоду анульовано")
    FAILED;

    public List<OperationStatus> getDocTypes() {
        return switch (this) {
            case IN_PROGRESS ->
                    List.of(OperationStatus.INITIATED, OperationStatus.DOCUMENTS_GENERATED, OperationStatus.WAITING_FOR_SIGNATURE,
                            OperationStatus.SIGNED_BY_CLIENT, OperationStatus.SIGNED_BY_BANK, OperationStatus.DOCUMENTS_SEND,
                            OperationStatus.AWAITING_CUSTODIAN, OperationStatus.FUNDS_CHARGED, OperationStatus.COMPLETED_EXTERNALLY);
            case COMPLETED ->
                    List.of(OperationStatus.COMPLETED);

            case CANCELED ->
                    List.of(OperationStatus.CANCELLED);

            case FAILED ->
                    List.of(OperationStatus.FAILED);
        };
    }
}