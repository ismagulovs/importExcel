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

        item.setFld119KrtAktvNchl(CheckInt.cellToInt(row.getCell(121)));
        item.setFld120KrtAktvKnc(CheckInt.cellToInt(row.getCell(122)));
        item.setFld121DnzhSrdNchl(CheckInt.cellToInt(row.getCell(123)));
        item.setFld122DnzhSrdKnc(CheckInt.cellToInt(row.getCell(124)));
        item.setFld123DnzhKssNchl(CheckInt.cellToInt(row.getCell(125)));
        item.setFld124DnzhKssKnc(CheckInt.cellToInt(row.getCell(126)));
        item.setFld125KrtFinInvNchl(CheckInt.cellToInt(row.getCell(127)));
        item.setFld126KrtFinInvKnc(CheckInt.cellToInt(row.getCell(128)));
        item.setFld127KrtDbtZdlNchl(CheckInt.cellToInt(row.getCell(129)));
        item.setFld128KrtDbtZdlKnc(CheckInt.cellToInt(row.getCell(130)));
        item.setFld129ZpsNchl(CheckInt.cellToInt(row.getCell(131)));
        item.setFld130ZpsKnc(CheckInt.cellToInt(row.getCell(132)));
        item.setFld131PrAktvNchl(CheckInt.cellToInt(row.getCell(133)));
        item.setFld132PrAktvKnc(CheckInt.cellToInt(row.getCell(134)));

        em.persist(item);
    }
}
