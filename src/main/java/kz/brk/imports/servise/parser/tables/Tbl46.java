package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl46ValiutPozc;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl46 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl46ValiutPozc item = new StcTbl46ValiutPozc();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld245AktvInostrVlt(CheckInt.cellToInt(row.getCell(247)));
        item.setFld246KrtAktvInostrVlt(CheckInt.cellToInt(row.getCell(248)));
        item.setFld247DlgAktvInostrVlt(CheckInt.cellToInt(row.getCell(249)));
        item.setFld248ObzInostrVlt(CheckInt.cellToInt(row.getCell(250)));
        item.setFld249KrtObzInostrVlt(CheckInt.cellToInt(row.getCell(251)));
        item.setFld250DlgObzInostrVlt(CheckInt.cellToInt(row.getCell(252)));
        item.setFld251ChstPzcInostrVlt(CheckInt.cellToInt(row.getCell(253)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
