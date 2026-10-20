package ua.mtb.inverse.contracts.operations;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperationsObsoleteFilterDto {

  @NotNull private String contragentId;

  @NotNull private String isin;
}
