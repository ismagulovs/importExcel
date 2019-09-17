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

        item.setFld145DlgAktvNchl(CheckInt.isNumeric(row.getCell(147).getStringCellValue())? Integer.parseInt(row.getCell(147).getStringCellValue()) : 0 );
        item.setFld146DlgAktvKnc(CheckInt.isNumeric(row.getCell(148).getStringCellValue())? Integer.parseInt(row.getCell(148).getStringCellValue()) : 0 );
        item.setFld147DlgFinInvNchl(CheckInt.isNumeric(row.getCell(149).getStringCellValue())? Integer.parseInt(row.getCell(149).getStringCellValue()) : 0 );
        item.setFld148DlgFinInvKnc(CheckInt.isNumeric(row.getCell(150).getStringCellValue())? Integer.parseInt(row.getCell(150).getStringCellValue()) : 0 );
        item.setFld149DlgDbtZdlNchl(CheckInt.isNumeric(row.getCell(151).getStringCellValue())? Integer.parseInt(row.getCell(151).getStringCellValue()) : 0 );
        item.setFld150DlgDbtZdlKnc(CheckInt.isNumeric(row.getCell(152).getStringCellValue())? Integer.parseInt(row.getCell(152).getStringCellValue()) : 0 );
        item.setFld151OsnSrdNchl(CheckInt.isNumeric(row.getCell(153).getStringCellValue())? Integer.parseInt(row.getCell(153).getStringCellValue()) : 0 );
        item.setFld152OsnSrdKnc(CheckInt.isNumeric(row.getCell(154).getStringCellValue())? Integer.parseInt(row.getCell(154).getStringCellValue()) : 0 );
        item.setFld153BioAktNchl(CheckInt.isNumeric(row.getCell(155).getStringCellValue())? Integer.parseInt(row.getCell(155).getStringCellValue()) : 0 );
        item.setFld154BioAktKnc(CheckInt.isNumeric(row.getCell(156).getStringCellValue())? Integer.parseInt(row.getCell(156).getStringCellValue()) : 0 );
        item.setFld155NematAktNchl(CheckInt.isNumeric(row.getCell(157).getStringCellValue())? Integer.parseInt(row.getCell(157).getStringCellValue()) : 0 );
        item.setFld156NematAktKnc(CheckInt.isNumeric(row.getCell(158).getStringCellValue())? Integer.parseInt(row.getCell(158).getStringCellValue()) : 0 );
        item.setFld157PrAktvNchl(CheckInt.isNumeric(row.getCell(159).getStringCellValue())? Integer.parseInt(row.getCell(159).getStringCellValue()) : 0 );
        item.setFld158PrAktvKnc(CheckInt.isNumeric(row.getCell(160).getStringCellValue())? Integer.parseInt(row.getCell(160).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
