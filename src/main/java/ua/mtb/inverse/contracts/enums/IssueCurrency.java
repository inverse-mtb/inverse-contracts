package ua.mtb.inverse.contracts.enums;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;

@Getter
@Schema(
    description =
        """
                Валюта випуску облігації.

                Можливі значення:
                - UAH — гривня;
                - USD — долар США;
                - EUR — євро.
                """)
public enum IssueCurrency {
  UAH(980),
  USD(840),
  EUR(978);

  private final int code;

  IssueCurrency(int code) {
    this.code = code;
  }

  public static List<Integer> getCodes() {
    return Arrays.stream(values()).map(IssueCurrency::getCode).toList();
  }

  public static IssueCurrency fromCode(int code) {
    return Arrays.stream(values())
        .filter(currency -> currency.code == code)
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Unknown currency code: " + code));
  }
}
