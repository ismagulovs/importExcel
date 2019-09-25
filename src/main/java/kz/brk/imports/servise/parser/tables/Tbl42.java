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

        item.setFld213PstpDenzhSr(CheckInt.cellToBigDecimal(row.getCell(215)));
        item.setFld214RlzcFinAktv(CheckInt.cellToBigDecimal(row.getCell(216)));
        item.setFld215RlzcAkcDl(CheckInt.cellToBigDecimal(row.getCell(217)));
        item.setFld216RlzcDlgInstr(CheckInt.cellToBigDecimal(row.getCell(218)));
        item.setFld217PgshZaimDrOrg(CheckInt.cellToBigDecimal(row.getCell(219)));
        item.setFld218PstpFfoDgv(CheckInt.cellToBigDecimal(row.getCell(220)));
        item.setFld219PrPstp(CheckInt.cellToBigDecimal(row.getCell(221)));
        item.setFld220VbtDenSrds(CheckInt.cellToBigDecimal(row.getCell(222)));
        item.setFld221PrbFinAktv(CheckInt.cellToBigDecimal(row.getCell(223)));
        item.setFld222PrbAkcDl(CheckInt.cellToBigDecimal(row.getCell(224)));
        item.setFld223PrbDlgInstr(CheckInt.cellToBigDecimal(row.getCell(225)));
        item.setFld224PrdsZaimDrOrg(CheckInt.cellToBigDecimal(row.getCell(226)));
        item.setFld225KrtSrch(CheckInt.cellToBigDecimal(row.getCell(227)));
        item.setFld226DlgSrch(CheckInt.cellToBigDecimal(row.getCell(228)));
        item.setFld227PltFfoDgv(CheckInt.cellToBigDecimal(row.getCell(229)));
        item.setFld228PrVbt(CheckInt.cellToBigDecimal(row.getCell(230)));
        item.setFld229ChstSumDenSr(CheckInt.cellToBigDecimal(row.getCell(231)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
