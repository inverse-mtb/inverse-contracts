package ua.mtb.inverse.contracts.purchase;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import ua.mtb.inverse.contracts.enums.ExportFormat;
import ua.mtb.inverse.contracts.enums.OperationStatus;

@Data
public class SummaryReportPurchaseFilterDto {
  private String isin;
  private List<OperationStatus> statuses =
      List.of(
          OperationStatus.COMPLETED,
          OperationStatus.COMPLETED_EXTERNALLY,
          OperationStatus.FUNDS_CHARGED,
          OperationStatus.CANCELLED,
          OperationStatus.FAILED);
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private ExportFormat exportFormat = ExportFormat.XLSX;
}
