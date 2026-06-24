package ua.mtb.inverse.contracts.purchase;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.IssueCurrency;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseReduceQuantityDto {

    @NotNull
    private String contragentId;

    private List<IssueCurrency> currency;

    private String isin;

    private Integer quantity;
}
