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
public class GetDocBytesRequest {
  @NonNull
  @NotBlank
  private String requestId;
  private Integer kep;
}
