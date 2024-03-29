package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl34DlgSrObz;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl34 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl34DlgSrObz item = new StcTbl34DlgSrObz();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld171DlgObzNchl(CheckInt.cellToBigDecimal(row.getCell(173)));
        item.setFld172DlgObzKnc(CheckInt.cellToBigDecimal(row.getCell(174)));
        item.setFld173DlgFinObzNchl(CheckInt.cellToBigDecimal(row.getCell(175)));
        item.setFld174DlgFinObzKnc(CheckInt.cellToBigDecimal(row.getCell(176)));
        item.setFld175DlgBnkZaimNchl(CheckInt.cellToBigDecimal(row.getCell(177)));
        item.setFld176DlgBnkZaimKnc(CheckInt.cellToBigDecimal(row.getCell(178)));
        item.setFld177DlgKrdZdlNchl(CheckInt.cellToBigDecimal(row.getCell(179)));
        item.setFld178DlgKrdZdlKnc(CheckInt.cellToBigDecimal(row.getCell(180)));
        item.setFld179PrObzNchl(CheckInt.cellToBigDecimal(row.getCell(181)));
        item.setFld180PrObzKnc(CheckInt.cellToBigDecimal(row.getCell(182)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
