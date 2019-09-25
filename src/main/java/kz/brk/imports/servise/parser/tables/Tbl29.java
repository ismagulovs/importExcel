package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl29DlgSrAktv;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl29 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl29DlgSrAktv item = new StcTbl29DlgSrAktv();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld145DlgAktvNchl(CheckInt.cellToBigDecimal(row.getCell(147)));
        item.setFld146DlgAktvKnc(CheckInt.cellToBigDecimal(row.getCell(148)));
        item.setFld147DlgFinInvNchl(CheckInt.cellToBigDecimal(row.getCell(149)));
        item.setFld148DlgFinInvKnc(CheckInt.cellToBigDecimal(row.getCell(150)));
        item.setFld149DlgDbtZdlNchl(CheckInt.cellToBigDecimal(row.getCell(151)));
        item.setFld150DlgDbtZdlKnc(CheckInt.cellToBigDecimal(row.getCell(152)));
        item.setFld151OsnSrdNchl(CheckInt.cellToBigDecimal(row.getCell(153)));
        item.setFld152OsnSrdKnc(CheckInt.cellToBigDecimal(row.getCell(154)));
        item.setFld153BioAktNchl(CheckInt.cellToBigDecimal(row.getCell(155)));
        item.setFld154BioAktKnc(CheckInt.cellToBigDecimal(row.getCell(156)));
        item.setFld155NematAktNchl(CheckInt.cellToBigDecimal(row.getCell(157)));
        item.setFld156NematAktKnc(CheckInt.cellToBigDecimal(row.getCell(158)));
        item.setFld157PrAktvNchl(CheckInt.cellToBigDecimal(row.getCell(159)));
        item.setFld158PrAktvKnc(CheckInt.cellToBigDecimal(row.getCell(160)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
