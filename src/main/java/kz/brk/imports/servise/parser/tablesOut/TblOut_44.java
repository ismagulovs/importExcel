package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl44DvzhDenSrdFinDtlt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_44 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl44DvzhDenSrdFinDtlt> item = em.createQuery("select t " +
                "from StcTbl44DvzhDenSrdFinDtlt t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(232).setCellValue(item.get(0).getFld230PstpDenzhSr());
        row.createCell(233).setCellValue(item.get(0).getFld231EmsAkcCenBmg());
        row.createCell(234).setCellValue(item.get(0).getFld232EmsAkcDrdolInstr());
        row.createCell(235).setCellValue(item.get(0).getFld233EmsOblZaimVeks());
        row.createCell(236).setCellValue(item.get(0).getFld234PlchZaim());
        row.createCell(237).setCellValue(item.get(0).getFld235PstpZaimBank());
        row.createCell(238).setCellValue(item.get(0).getFld236PstpPrZaim());
        row.createCell(239).setCellValue(item.get(0).getFld237PrPstp());
        row.createCell(240).setCellValue(item.get(0).getFld238VbtDenSr());
        row.createCell(241).setCellValue(item.get(0).getFld239PgshZdlgZaim());
        row.createCell(242).setCellValue(item.get(0).getFld240VbtZaimBank());
        row.createCell(243).setCellValue(item.get(0).getFld241VbtPrZaim());
        row.createCell(244).setCellValue(item.get(0).getFld242PrbSbsAkc());
        row.createCell(245).setCellValue(item.get(0).getFld243VpltDvd());
        row.createCell(246).setCellValue(item.get(0).getFld244PrVbt());

        item.clear();
        em.clear();
    }
}
