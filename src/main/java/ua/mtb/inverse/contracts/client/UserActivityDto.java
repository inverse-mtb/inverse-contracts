package ua.mtb.inverse.contracts.client;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.AuditAction;
import ua.mtb.inverse.contracts.enums.AuditSection;

/** DTO for user activity history (all operations by specific admin) */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserActivityDto {

  private Long id;

  private AuditSection section;

  private String entityId; // ISIN

  private AuditAction action;

  private String title; // "Додано UA1234567897" or "Редагування UA1234567897"

  private String details; // "Ставка доходності: змінено з 3.00 на 3" (nullable for CREATE/DELETE)

  private OffsetDateTime changedAt;

  // Raw values for frontend if needed
  private String fieldName;
  private String oldValue;
  private String newValue;
}
