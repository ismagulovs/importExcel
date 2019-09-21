package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl06DhdRlzPrdUslOsn;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_06 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl06DhdRlzPrdUslOsn> item = em.createQuery("select t " +
                "from StcTbl06DhdRlzPrdUslOsn t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(23).setCellValue(item.get(0).getFld021DhdRlzcPu());
        row.createCell(24).setCellValue(item.get(0).getFld022DhdRlzc());
        row.createCell(25).setCellValue(item.get(0).getFld023DhdFin());
        row.createCell(26).setCellValue(item.get(0).getFld024DvdAkcVzng());
        row.createCell(27).setCellValue(item.get(0).getFld025PrDhd());
        row.createCell(28).setCellValue(item.get(0).getFld026DhdKursRznc());
        row.createCell(29).setCellValue(item.get(0).getFld027DhdVybAkt());
        item.clear();
        em.clear();
    }
}
