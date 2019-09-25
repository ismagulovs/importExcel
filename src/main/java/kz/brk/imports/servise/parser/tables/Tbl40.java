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

        item.setFld197PstpDenzhSr(CheckInt.cellToBigDecimal(row.getCell(199)));
        item.setFld198RlzcTvr(CheckInt.cellToBigDecimal(row.getCell(200)));
        item.setFld199PrdsUsl(CheckInt.cellToBigDecimal(row.getCell(201)));
        item.setFld200Dvdnt(CheckInt.cellToBigDecimal(row.getCell(202)));
        item.setFld201PstpVoznArend(CheckInt.cellToBigDecimal(row.getCell(203)));
        item.setFld202PstpStrahPrm(CheckInt.cellToBigDecimal(row.getCell(204)));
        item.setFld203PrPstp(CheckInt.cellToBigDecimal(row.getCell(205)));
        item.setFld204VbtDenSrds(CheckInt.cellToBigDecimal(row.getCell(206)));
        item.setFld205PltPostTvrUsl(CheckInt.cellToBigDecimal(row.getCell(207)));
        item.setFld206VplVoznZaim(CheckInt.cellToBigDecimal(row.getCell(208)));
        item.setFld207ZaimBank(CheckInt.cellToBigDecimal(row.getCell(209)));
        item.setFld208PrZaim(CheckInt.cellToBigDecimal(row.getCell(210)));
        item.setFld209PltVoznArend(CheckInt.cellToBigDecimal(row.getCell(211)));
        item.setFld210PltStrahPrm(CheckInt.cellToBigDecimal(row.getCell(212)));
        item.setFld211PrVbt(CheckInt.cellToBigDecimal(row.getCell(213)));
        item.setFld212ChstSumDenSr(CheckInt.cellToBigDecimal(row.getCell(214)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
