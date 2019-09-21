package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl05DhdRlzPrdUsl;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_05 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl05DhdRlzPrdUsl> item = em.createQuery("select t " +
                "from StcTbl05DhdRlzPrdUsl t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(17).setCellValue(item.get(0).getFld015DhdRlzc());
        row.createCell(18).setCellValue(item.get(0).getFld016DhdFin());
        row.createCell(19).setCellValue(item.get(0).getFld017DvdAkcVzng());
        row.createCell(20).setCellValue(item.get(0).getFld018PrDhd());
        row.createCell(21).setCellValue(item.get(0).getFld019DhdKursRznc());
        row.createCell(22).setCellValue(item.get(0).getFld020DhdVybAkt());
        item.clear();
        em.clear();
    }
}
