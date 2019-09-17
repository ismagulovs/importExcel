package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl28Zapasy;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl28 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl28Zapasy item = new StcTbl28Zapasy();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld133ZpsNchl(CheckInt.isNumeric(row.getCell(135).getStringCellValue())? Integer.parseInt(row.getCell(135).getStringCellValue()) : 0 );
        item.setFld134ZpsKnc(CheckInt.isNumeric(row.getCell(136).getStringCellValue())? Integer.parseInt(row.getCell(136).getStringCellValue()) : 0 );
        item.setFld135SrMtrlNchl(CheckInt.isNumeric(row.getCell(137).getStringCellValue())? Integer.parseInt(row.getCell(137).getStringCellValue()) : 0 );
        item.setFld136SrMtrlKnc(CheckInt.isNumeric(row.getCell(138).getStringCellValue())? Integer.parseInt(row.getCell(138).getStringCellValue()) : 0 );
        item.setFld137GtvPrdNchl(CheckInt.isNumeric(row.getCell(139).getStringCellValue())? Integer.parseInt(row.getCell(139).getStringCellValue()) : 0 );
        item.setFld138GtvPrdKnc(CheckInt.isNumeric(row.getCell(140).getStringCellValue())? Integer.parseInt(row.getCell(140).getStringCellValue()) : 0 );
        item.setFld139TvrNchl(CheckInt.isNumeric(row.getCell(141).getStringCellValue())? Integer.parseInt(row.getCell(141).getStringCellValue()) : 0 );
        item.setFld140TvrKnc(CheckInt.isNumeric(row.getCell(143).getStringCellValue())? Integer.parseInt(row.getCell(142).getStringCellValue()) : 0 );
        item.setFld141NzvrPrzvNchl(CheckInt.isNumeric(row.getCell(143).getStringCellValue())? Integer.parseInt(row.getCell(143).getStringCellValue()) : 0 );
        item.setFld142NzvrPrzvKnc(CheckInt.isNumeric(row.getCell(144).getStringCellValue())? Integer.parseInt(row.getCell(144).getStringCellValue()) : 0 );
        item.setFld143PrZpsNchl(CheckInt.isNumeric(row.getCell(145).getStringCellValue())? Integer.parseInt(row.getCell(145).getStringCellValue()) : 0 );
        item.setFld144PrZpsKnc(CheckInt.isNumeric(row.getCell(146).getStringCellValue())? Integer.parseInt(row.getCell(146).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
