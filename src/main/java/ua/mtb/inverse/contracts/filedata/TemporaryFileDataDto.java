package ua.mtb.inverse.contracts.filedata;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.DocumentCategory;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemporaryFileDataDto {
  private Long id;
  private Integer version;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private String diiaId;
  private byte[] data;
  private String contragentId;
  private DocumentCategory documentCategory;
  private String signedByClient;
  private String signedByBank;
}
