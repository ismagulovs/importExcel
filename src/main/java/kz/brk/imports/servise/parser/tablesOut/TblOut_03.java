package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl03ObshObmPrdUsl;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_03 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl03ObshObmPrdUsl> item = em.createQuery("select t " +
                "from StcTbl03ObshObmPrdUsl t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(8).setCellValue(item.get(0).getFld006ObjemRlz());
        row.createCell(9).setCellValue(item.get(0).getFld007PrdUslIsp());
        row.createCell(10).setCellValue(item.get(0).getFld008IzmZps());
        row.createCell(11).setCellValue(item.get(0).getFld009PrstUmn());

        item.clear();
        em.clear();
    }
}
