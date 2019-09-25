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

        item.setFld105BlsAktvNchl(CheckInt.cellToBigDecimal(row.getCell(107)));
        item.setFld106BlsAktvKnc(CheckInt.cellToBigDecimal(row.getCell(108)));
        item.setFld107KrtAktvNchl(CheckInt.cellToBigDecimal(row.getCell(109)));
        item.setFld108KrtAktvKnc(CheckInt.cellToBigDecimal(row.getCell(110)));
        item.setFld109DlgAktvNchl(CheckInt.cellToBigDecimal(row.getCell(111)));
        item.setFld110DlgAktvKnc(CheckInt.cellToBigDecimal(row.getCell(112)));
        item.setFld111BlsObzNchl(CheckInt.cellToBigDecimal(row.getCell(113)));
        item.setFld112BlsObzKnc(CheckInt.cellToBigDecimal(row.getCell(114)));
        item.setFld113KrtObzNchl(CheckInt.cellToBigDecimal(row.getCell(115)));
        item.setFld114KrtObzKnc(CheckInt.cellToBigDecimal(row.getCell(116)));
        item.setFld115DlgObzNchl(CheckInt.cellToBigDecimal(row.getCell(117)));
        item.setFld116DlgObzKnc(CheckInt.cellToBigDecimal(row.getCell(118)));
        item.setFld117KptlNchl(CheckInt.cellToBigDecimal(row.getCell(119)));
        item.setFld118KptlKnc(CheckInt.cellToBigDecimal(row.getCell(120)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
