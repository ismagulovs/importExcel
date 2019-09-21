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

        item.setFld145DlgAktvNchl(CheckInt.cellToInt(row.getCell(147)));
        item.setFld146DlgAktvKnc(CheckInt.cellToInt(row.getCell(148)));
        item.setFld147DlgFinInvNchl(CheckInt.cellToInt(row.getCell(149)));
        item.setFld148DlgFinInvKnc(CheckInt.cellToInt(row.getCell(150)));
        item.setFld149DlgDbtZdlNchl(CheckInt.cellToInt(row.getCell(151)));
        item.setFld150DlgDbtZdlKnc(CheckInt.cellToInt(row.getCell(152)));
        item.setFld151OsnSrdNchl(CheckInt.cellToInt(row.getCell(153)));
        item.setFld152OsnSrdKnc(CheckInt.cellToInt(row.getCell(154)));
        item.setFld153BioAktNchl(CheckInt.cellToInt(row.getCell(155)));
        item.setFld154BioAktKnc(CheckInt.cellToInt(row.getCell(156)));
        item.setFld155NematAktNchl(CheckInt.cellToInt(row.getCell(157)));
        item.setFld156NematAktKnc(CheckInt.cellToInt(row.getCell(158)));
        item.setFld157PrAktvNchl(CheckInt.cellToInt(row.getCell(159)));
        item.setFld158PrAktvKnc(CheckInt.cellToInt(row.getCell(160)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
