package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl32KrtSrObz;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl32 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl32KrtSrObz item = new StcTbl32KrtSrObz();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld159KrtObzNchl(CheckInt.cellToBigDecimal(row.getCell(161)));
        item.setFld160KrtObzKnc(CheckInt.cellToBigDecimal(row.getCell(162)));
        item.setFld161KrtFinObzNchl(CheckInt.cellToBigDecimal(row.getCell(163)));
        item.setFld162KrtFinObzKnc(CheckInt.cellToBigDecimal(row.getCell(164)));
        item.setFld163KrtBnkZaimNchl(CheckInt.cellToBigDecimal(row.getCell(165)));
        item.setFld164KrtBnkZaimKnc(CheckInt.cellToBigDecimal(row.getCell(166)));
        item.setFld165ObzNlgNchl(CheckInt.cellToBigDecimal(row.getCell(167)));
        item.setFld166ObzNlgKnc(CheckInt.cellToBigDecimal(row.getCell(168)));
        item.setFld167KrtKrdZdlNchl(CheckInt.cellToBigDecimal(row.getCell(169)));
        item.setFld168KrtKrdZdlKnc(CheckInt.cellToBigDecimal(row.getCell(170)));
        item.setFld169PrObzNchl(CheckInt.cellToBigDecimal(row.getCell(171)));
        item.setFld170PrObzKnc(CheckInt.cellToBigDecimal(row.getCell(172)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
