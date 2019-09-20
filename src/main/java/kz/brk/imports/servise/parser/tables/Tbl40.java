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

        item.setFld197PstpDenzhSr(CheckInt.cellToInt(row.getCell(199)));
        item.setFld198RlzcTvr(CheckInt.cellToInt(row.getCell(200)));
        item.setFld199PrdsUsl(CheckInt.cellToInt(row.getCell(201)));
        item.setFld200Dvdnt(CheckInt.cellToInt(row.getCell(202)));
        item.setFld201PstpVoznArend(CheckInt.cellToInt(row.getCell(203)));
        item.setFld202PstpStrahPrm(CheckInt.cellToInt(row.getCell(204)));
        item.setFld203PrPstp(CheckInt.cellToInt(row.getCell(205)));
        item.setFld204VbtDenSrds(CheckInt.cellToInt(row.getCell(206)));
        item.setFld205PltPostTvrUsl(CheckInt.cellToInt(row.getCell(207)));
        item.setFld206VplVoznZaim(CheckInt.cellToInt(row.getCell(208)));
        item.setFld207ZaimBank(CheckInt.cellToInt(row.getCell(209)));
        item.setFld208PrZaim(CheckInt.cellToInt(row.getCell(210)));
        item.setFld209PltVoznArend(CheckInt.cellToInt(row.getCell(211)));
        item.setFld210PltStrahPrm(CheckInt.cellToInt(row.getCell(212)));
        item.setFld211PrVbt(CheckInt.cellToInt(row.getCell(213)));
        item.setFld212ChstSumDenSr(CheckInt.cellToInt(row.getCell(214)));

        em.persist(item);
    }
}
