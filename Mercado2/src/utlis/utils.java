package utlis;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class utils {

    public static final String Utils = null;
    static NumberFormat numberFormat =
        new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(Locale.of("pt", "BR")));

    public static String doubleToString(Double value) {
        return numberFormat.format(value);
    }
}