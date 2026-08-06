package ua.mtb.inverse.contracts.kafka.trading;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TradingSessionFileDto {
  private String fileName;

  /** S3 object key. */
  private String objectKey;

  /** MIME type. */
  private String contentType;

  /** Розмір файлу. */
  private Long size;
}
