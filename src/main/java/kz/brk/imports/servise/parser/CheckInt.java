package kz.brk.imports.servise.parser;

import org.apache.poi.ss.usermodel.Cell;

import javax.ejb.Stateless;
import java.math.BigDecimal;
import java.text.DecimalFormatSymbols;

@Stateless
public class CheckInt {
    public static boolean isNumeric(String str) {
        try {
            DecimalFormatSymbols currentLocaleSymbols = DecimalFormatSymbols.getInstance();
            char localeMinusSign = currentLocaleSymbols.getMinusSign();

            if ( !Character.isDigit( str.charAt( 0 ) ) && str.charAt( 0 ) != localeMinusSign ) return false;

            boolean isDecimalSeparatorFound = false;
            char localeDecimalSeparator = currentLocaleSymbols.getDecimalSeparator();

            for ( char c : str.substring( 1 ).toCharArray() )
            {
                if ( !Character.isDigit( c ) )
                {
                    if ( c == localeDecimalSeparator && !isDecimalSeparatorFound )
                    {
                        isDecimalSeparatorFound = true;
                        continue;
                    }
                    return false;
                }
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static int cellToInt(Cell cell){
        if(cell == null)
        {
            return 0;
        }else {
            switch (cell.getCellType()) {
                case NUMERIC:
                    return (int) cell.getNumericCellValue();
                case STRING: {
                    try {
                        return Integer.parseInt(cell.getStringCellValue());
                    } catch (Exception e) {
                        return 0;
                    }
                }
                default:
                    return 0;
            }
        }
    }

    public static BigDecimal cellToBigDecimal(Cell cell){
        if(cell == null)
        {
            return BigDecimal.valueOf(0);
        }else {
            switch (cell.getCellType()) {
                case NUMERIC:
                    return BigDecimal.valueOf(cell.getNumericCellValue());
                case STRING: {
                    try {
                        return BigDecimal.valueOf(Long.parseLong(cell.getStringCellValue().replaceAll("\\s+", "")));
                    } catch (Exception e) {
                        return BigDecimal.valueOf(0);
                    }
                }
                default:
                    return BigDecimal.valueOf(0);
            }
        }
    }
}

