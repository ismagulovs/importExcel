package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl40DvzhDenSrdOperDtlt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_40 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl40DvzhDenSrdOperDtlt> item = em.createQuery("select t " +
                "from StcTbl40DvzhDenSrdOperDtlt t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(199).setCellValue(item.get(0).getFld197PstpDenzhSr().toString());
        row.createCell(200).setCellValue(item.get(0).getFld198RlzcTvr().toString());
        row.createCell(201).setCellValue(item.get(0).getFld199PrdsUsl().toString());
        row.createCell(202).setCellValue(item.get(0).getFld200Dvdnt().toString());
        row.createCell(203).setCellValue(item.get(0).getFld201PstpVoznArend().toString());
        row.createCell(204).setCellValue(item.get(0).getFld202PstpStrahPrm().toString());
        row.createCell(205).setCellValue(item.get(0).getFld203PrPstp().toString());
        row.createCell(206).setCellValue(item.get(0).getFld204VbtDenSrds().toString());
        row.createCell(207).setCellValue(item.get(0).getFld205PltPostTvrUsl().toString());
        row.createCell(208).setCellValue(item.get(0).getFld206VplVoznZaim().toString());
        row.createCell(209).setCellValue(item.get(0).getFld207ZaimBank().toString());
        row.createCell(210).setCellValue(item.get(0).getFld208PrZaim().toString());
        row.createCell(211).setCellValue(item.get(0).getFld209PltVoznArend().toString());
        row.createCell(212).setCellValue(item.get(0).getFld210PltStrahPrm().toString());
        row.createCell(213).setCellValue(item.get(0).getFld211PrVbt().toString());
        row.createCell(214).setCellValue(item.get(0).getFld212ChstSumDenSr().toString());

        item.clear();
        em.clear();

    }
}
