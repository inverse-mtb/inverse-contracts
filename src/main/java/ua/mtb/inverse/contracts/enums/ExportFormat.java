package ua.mtb.inverse.contracts.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExportFormat {
  PDF(".pdf"),
  XML(".xml"),
  XLSX(".xlsx"),
  CSV(".csv");

  private final String extension;
}
