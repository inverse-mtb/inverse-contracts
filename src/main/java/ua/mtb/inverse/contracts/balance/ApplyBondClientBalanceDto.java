package ua.mtb.inverse.contracts.balance;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplyBondClientBalanceDto {
  @NotNull @Positive private Long clientId;
  @NotBlank @NonNull private String isin;
  @NotNull private Long delta;
  private String operation;
  @Positive private Long referenceId;
  private Boolean buyInApp;
}
