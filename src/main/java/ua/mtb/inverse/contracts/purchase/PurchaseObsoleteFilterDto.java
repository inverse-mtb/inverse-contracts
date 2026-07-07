package ua.mtb.inverse.contracts.purchase;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseObsoleteFilterDto {

  @NotNull private String contragentId;

  @NotNull private String isin;
}
