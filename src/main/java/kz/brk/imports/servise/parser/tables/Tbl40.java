package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl40DvzhDenSrdOperDtlt;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl40 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl40DvzhDenSrdOperDtlt item = new StcTbl40DvzhDenSrdOperDtlt();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld197PstpDenzhSr(CheckInt.isNumeric(row.getCell(199).getStringCellValue())? Integer.parseInt(row.getCell(199).getStringCellValue()) : 0 );
        item.setFld198RlzcTvr(CheckInt.isNumeric(row.getCell(200).getStringCellValue())? Integer.parseInt(row.getCell(200).getStringCellValue()) : 0 );
        item.setFld199PrdsUsl(CheckInt.isNumeric(row.getCell(201).getStringCellValue())? Integer.parseInt(row.getCell(201).getStringCellValue()) : 0 );
        item.setFld200Dvdnt(CheckInt.isNumeric(row.getCell(202).getStringCellValue())? Integer.parseInt(row.getCell(202).getStringCellValue()) : 0 );
        item.setFld201PstpVoznArend(CheckInt.isNumeric(row.getCell(203).getStringCellValue())? Integer.parseInt(row.getCell(203).getStringCellValue()) : 0 );
        item.setFld202PstpStrahPrm(CheckInt.isNumeric(row.getCell(204).getStringCellValue())? Integer.parseInt(row.getCell(204).getStringCellValue()) : 0 );
        item.setFld203PrPstp(CheckInt.isNumeric(row.getCell(205).getStringCellValue())? Integer.parseInt(row.getCell(205).getStringCellValue()) : 0 );
        item.setFld204VbtDenSrds(CheckInt.isNumeric(row.getCell(206).getStringCellValue())? Integer.parseInt(row.getCell(206).getStringCellValue()) : 0 );
        item.setFld205PltPostTvrUsl(CheckInt.isNumeric(row.getCell(207).getStringCellValue())? Integer.parseInt(row.getCell(207).getStringCellValue()) : 0 );
        item.setFld206VplVoznZaim(CheckInt.isNumeric(row.getCell(208).getStringCellValue())? Integer.parseInt(row.getCell(208).getStringCellValue()) : 0 );
        item.setFld207ZaimBank(CheckInt.isNumeric(row.getCell(209).getStringCellValue())? Integer.parseInt(row.getCell(209).getStringCellValue()) : 0 );
        item.setFld208PrZaim(CheckInt.isNumeric(row.getCell(210).getStringCellValue())? Integer.parseInt(row.getCell(210).getStringCellValue()) : 0 );
        item.setFld209PltVoznArend(CheckInt.isNumeric(row.getCell(211).getStringCellValue())? Integer.parseInt(row.getCell(211).getStringCellValue()) : 0 );
        item.setFld210PltStrahPrm(CheckInt.isNumeric(row.getCell(212).getStringCellValue())? Integer.parseInt(row.getCell(212).getStringCellValue()) : 0 );
        item.setFld211PrVbt(CheckInt.isNumeric(row.getCell(213).getStringCellValue())? Integer.parseInt(row.getCell(213).getStringCellValue()) : 0 );
        item.setFld212ChstSumDenSr(CheckInt.isNumeric(row.getCell(214).getStringCellValue())? Integer.parseInt(row.getCell(214).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
