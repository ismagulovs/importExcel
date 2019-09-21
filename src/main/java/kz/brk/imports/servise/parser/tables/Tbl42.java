package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl42DvzhDenSrdInvstDtlt;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl42 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl42DvzhDenSrdInvstDtlt item = new StcTbl42DvzhDenSrdInvstDtlt();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld213PstpDenzhSr(CheckInt.cellToInt(row.getCell(215)));
        item.setFld214RlzcFinAktv(CheckInt.cellToInt(row.getCell(216)));
        item.setFld215RlzcAkcDl(CheckInt.cellToInt(row.getCell(217)));
        item.setFld216RlzcDlgInstr(CheckInt.cellToInt(row.getCell(218)));
        item.setFld217PgshZaimDrOrg(CheckInt.cellToInt(row.getCell(219)));
        item.setFld218PstpFfoDgv(CheckInt.cellToInt(row.getCell(220)));
        item.setFld219PrPstp(CheckInt.cellToInt(row.getCell(221)));
        item.setFld220VbtDenSrds(CheckInt.cellToInt(row.getCell(222)));
        item.setFld221PrbFinAktv(CheckInt.cellToInt(row.getCell(223)));
        item.setFld222PrbAkcDl(CheckInt.cellToInt(row.getCell(224)));
        item.setFld223PrbDlgInstr(CheckInt.cellToInt(row.getCell(225)));
        item.setFld224PrdsZaimDrOrg(CheckInt.cellToInt(row.getCell(226)));
        item.setFld225KrtSrch(CheckInt.cellToInt(row.getCell(227)));
        item.setFld226DlgSrch(CheckInt.cellToInt(row.getCell(228)));
        item.setFld227PltFfoDgv(CheckInt.cellToInt(row.getCell(229)));
        item.setFld228PrVbt(CheckInt.cellToInt(row.getCell(230)));
        item.setFld229ChstSumDenSr(CheckInt.cellToInt(row.getCell(231)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
