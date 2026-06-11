package ua.mtb.inverse.contracts.docs;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenerateDocRequestB2 {
  @NonNull
  @NotBlank
  private String univId;
  private String reportParamValues;
}
