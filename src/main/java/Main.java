import pl.allegro.finance.tradukisto.MoneyConverters;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(getAmountInWords(new BigDecimal(530642)));
    }
    public static String getAmountInWords(BigDecimal decimal)
    {
        MoneyConverters converters = MoneyConverters.ENGLISH_BANKING_MONEY_VALUE;
        return converters.asWords(decimal).split("£")[0].trim();
    }


}
