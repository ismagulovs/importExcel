package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl08ObshRashPredp;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl08 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl08ObshRashPredp item = new StcTbl08ObshRashPredp();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld028Vsego(CheckInt.cellToBigDecimal(row.getCell(30)));
        item.setFld029PrzvRhd(CheckInt.cellToBigDecimal(row.getCell(31)));
        item.setFld030MatZatr(CheckInt.cellToBigDecimal(row.getCell(32)));
        item.setFld031AmrtOsnSr(CheckInt.cellToBigDecimal(row.getCell(33)));
        item.setFld032AmrtNemat(CheckInt.cellToBigDecimal(row.getCell(34)));
        item.setFld033FondZpr(CheckInt.cellToBigDecimal(row.getCell(35)));
        item.setFld034DenPsbRab(CheckInt.cellToBigDecimal(row.getCell(36)));
        item.setFld035PrZtr(CheckInt.cellToBigDecimal(row.getCell(37)));
        item.setFld036NeprzvRsh(CheckInt.cellToBigDecimal(row.getCell(38)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
