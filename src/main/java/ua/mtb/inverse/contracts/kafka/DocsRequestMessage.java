package ua.mtb.inverse.contracts.kafka;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.DocumentCategory;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocsRequestMessage {
  @NotBlank(message = "email is required")
  @Email(message = "email must be valid")
  private String email;

  @NotBlank(message = "contragentId is required")
  private String contragentId;

  @NotNull(message = "category is required")
  private DocumentCategory category;

  private String firstName;
  private String patronymicName;

  @NotBlank(message = "agreementDate is required")
  private String agreementDate;

  private String agreementNumber;

  @NotNull(message = "requestId is required")
  private String requestId;
}
