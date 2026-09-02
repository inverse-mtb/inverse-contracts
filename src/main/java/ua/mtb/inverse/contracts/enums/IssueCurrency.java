package ua.mtb.inverse.contracts.enums;

import io.swagger.v3.oas.annotations.media.Schema;

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
  UAH,
  USD,
  EUR
}
