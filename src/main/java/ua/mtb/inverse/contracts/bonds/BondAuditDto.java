package ua.mtb.inverse.contracts.bonds;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.AuditAction;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BondAuditDto {
  private Long id;
  private Long bondId;
  private String bondIsin;
  private AuditAction action;
  private String fieldName;
  private String oldValue;
  private String newValue;
  private Long changedBy;
  private String changedByName;
  private OffsetDateTime changedAt;
  private String comment;
}
