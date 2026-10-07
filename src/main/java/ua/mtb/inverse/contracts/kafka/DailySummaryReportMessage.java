package ua.mtb.inverse.contracts.kafka;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailySummaryReportMessage {
  /** S3 object key */
  private String objectKey;

  private String fileName;

  /** Дата формування звіту */
  private LocalDate reportDate;
}
