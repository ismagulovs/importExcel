package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl26KrtSrAktv;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl26 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl26KrtSrAktv item = new StcTbl26KrtSrAktv();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld119KrtAktvNchl(CheckInt.cellToBigDecimal(row.getCell(121)));
        item.setFld120KrtAktvKnc(CheckInt.cellToBigDecimal(row.getCell(122)));
        item.setFld121DnzhSrdNchl(CheckInt.cellToBigDecimal(row.getCell(123)));
        item.setFld122DnzhSrdKnc(CheckInt.cellToBigDecimal(row.getCell(124)));
        item.setFld123DnzhKssNchl(CheckInt.cellToBigDecimal(row.getCell(125)));
        item.setFld124DnzhKssKnc(CheckInt.cellToBigDecimal(row.getCell(126)));
        item.setFld125KrtFinInvNchl(CheckInt.cellToBigDecimal(row.getCell(127)));
        item.setFld126KrtFinInvKnc(CheckInt.cellToBigDecimal(row.getCell(128)));
        item.setFld127KrtDbtZdlNchl(CheckInt.cellToBigDecimal(row.getCell(129)));
        item.setFld128KrtDbtZdlKnc(CheckInt.cellToBigDecimal(row.getCell(130)));
        item.setFld129ZpsNchl(CheckInt.cellToBigDecimal(row.getCell(131)));
        item.setFld130ZpsKnc(CheckInt.cellToBigDecimal(row.getCell(132)));
        item.setFld131PrAktvNchl(CheckInt.cellToBigDecimal(row.getCell(133)));
        item.setFld132PrAktvKnc(CheckInt.cellToBigDecimal(row.getCell(134)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
