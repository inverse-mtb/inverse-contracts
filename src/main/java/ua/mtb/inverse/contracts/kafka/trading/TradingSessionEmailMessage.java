package ua.mtb.inverse.contracts.kafka.trading;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TradingSessionEmailMessage {
  /** ID запису з trading_session_operations */
  private Long operationId;

  /** Дата вкладання договору з trading_session_operations */
  private String operationAgreementDate;

  /** Номер договору з trading_session_operations */
  private String operationAgreementNumber;

  private String clientName;

  private String diiaId;

  /** Повна інформація по торговій сесії. */
  private TradingSessionDetailsDto session;

  /** Список файлів. */
  private List<TradingSessionFileDto> files;
}
