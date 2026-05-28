package ua.mtb.inverse.contracts.bonds;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import ua.mtb.inverse.contracts.enums.IssueCurrency;
import ua.mtb.inverse.contracts.enums.YieldType;

@Data
public class BaseBondLimitFilterDto {

  private LocalDate tradeDateFrom;

  private LocalDate tradeDateTo;

  private LocalDate validTillFrom;

  private LocalDate validTillTo;

  private List<IssueCurrency> issueCurrencies;

  private List<YieldType> yieldTypes;

  private String isin;
}
