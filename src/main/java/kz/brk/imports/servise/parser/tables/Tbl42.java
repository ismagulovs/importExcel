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

        item.setFld213PstpDenzhSr(CheckInt.isNumeric(row.getCell(215).getStringCellValue())? Integer.parseInt(row.getCell(215).getStringCellValue()) : 0 );
        item.setFld214RlzcFinAktv(CheckInt.isNumeric(row.getCell(216).getStringCellValue())? Integer.parseInt(row.getCell(216).getStringCellValue()) : 0 );
        item.setFld215RlzcAkcDl(CheckInt.isNumeric(row.getCell(217).getStringCellValue())? Integer.parseInt(row.getCell(217).getStringCellValue()) : 0 );
        item.setFld216RlzcDlgInstr(CheckInt.isNumeric(row.getCell(218).getStringCellValue())? Integer.parseInt(row.getCell(218).getStringCellValue()) : 0 );
        item.setFld217PgshZaimDrOrg(CheckInt.isNumeric(row.getCell(219).getStringCellValue())? Integer.parseInt(row.getCell(219).getStringCellValue()) : 0 );
        item.setFld218PstpFfoDgv(CheckInt.isNumeric(row.getCell(220).getStringCellValue())? Integer.parseInt(row.getCell(220).getStringCellValue()) : 0 );
        item.setFld219PrPstp(CheckInt.isNumeric(row.getCell(221).getStringCellValue())? Integer.parseInt(row.getCell(221).getStringCellValue()) : 0 );
        item.setFld220VbtDenSrds(CheckInt.isNumeric(row.getCell(222).getStringCellValue())? Integer.parseInt(row.getCell(222).getStringCellValue()) : 0 );
        item.setFld221PrbFinAktv(CheckInt.isNumeric(row.getCell(223).getStringCellValue())? Integer.parseInt(row.getCell(223).getStringCellValue()) : 0 );
        item.setFld222PrbAkcDl(CheckInt.isNumeric(row.getCell(224).getStringCellValue())? Integer.parseInt(row.getCell(224).getStringCellValue()) : 0 );
        item.setFld223PrbDlgInstr(CheckInt.isNumeric(row.getCell(225).getStringCellValue())? Integer.parseInt(row.getCell(225).getStringCellValue()) : 0 );
        item.setFld224PrdsZaimDrOrg(CheckInt.isNumeric(row.getCell(226).getStringCellValue())? Integer.parseInt(row.getCell(226).getStringCellValue()) : 0 );
        item.setFld225KrtSrch(CheckInt.isNumeric(row.getCell(227).getStringCellValue())? Integer.parseInt(row.getCell(227).getStringCellValue()) : 0 );
        item.setFld226DlgSrch(CheckInt.isNumeric(row.getCell(228).getStringCellValue())? Integer.parseInt(row.getCell(228).getStringCellValue()) : 0 );
        item.setFld227PltFfoDgv(CheckInt.isNumeric(row.getCell(229).getStringCellValue())? Integer.parseInt(row.getCell(229).getStringCellValue()) : 0 );
        item.setFld228PrVbt(CheckInt.isNumeric(row.getCell(230).getStringCellValue())? Integer.parseInt(row.getCell(230).getStringCellValue()) : 0 );
        item.setFld229ChstSumDenSr(CheckInt.isNumeric(row.getCell(231).getStringCellValue())? Integer.parseInt(row.getCell(231).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
