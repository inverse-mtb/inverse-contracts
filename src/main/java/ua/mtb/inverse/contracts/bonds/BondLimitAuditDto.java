package ua.mtb.inverse.contracts.bonds;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.AuditAction;
import ua.mtb.inverse.contracts.enums.TransactionType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BondLimitAuditDto {
  private Long id;
  private Long bondLimitId;
  private String bondIsin;
  private AuditAction action;
  private TransactionType type;
  private String fieldName;
  private String oldValue;
  private String newValue;
  private Long changedBy;
  private String changedByName;
  private OffsetDateTime changedAt;
  private String comment;
}
