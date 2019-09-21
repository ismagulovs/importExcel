package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl24BalancePrdp;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl24 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl24BalancePrdp item = new StcTbl24BalancePrdp();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld105BlsAktvNchl(CheckInt.cellToInt(row.getCell(107)));
        item.setFld106BlsAktvKnc(CheckInt.cellToInt(row.getCell(108)));
        item.setFld107KrtAktvNchl(CheckInt.cellToInt(row.getCell(109)));
        item.setFld108KrtAktvKnc(CheckInt.cellToInt(row.getCell(110)));
        item.setFld109DlgAktvNchl(CheckInt.cellToInt(row.getCell(111)));
        item.setFld110DlgAktvKnc(CheckInt.cellToInt(row.getCell(112)));
        item.setFld111BlsObzNchl(CheckInt.cellToInt(row.getCell(113)));
        item.setFld112BlsObzKnc(CheckInt.cellToInt(row.getCell(114)));
        item.setFld113KrtObzNchl(CheckInt.cellToInt(row.getCell(115)));
        item.setFld114KrtObzKnc(CheckInt.cellToInt(row.getCell(116)));
        item.setFld115DlgObzNchl(CheckInt.cellToInt(row.getCell(117)));
        item.setFld116DlgObzKnc(CheckInt.cellToInt(row.getCell(118)));
        item.setFld117KptlNchl(CheckInt.cellToInt(row.getCell(119)));
        item.setFld118KptlKnc(CheckInt.cellToInt(row.getCell(120)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
