package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl04ObmPrdUslOsn;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_04 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;


    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl04ObmPrdUslOsn> item = em.createQuery("select t " +
                "from StcTbl04ObmPrdUslOsn t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(12).setCellValue(item.get(0).getFld010ObjemPrdUsl().toString());
        row.createCell(13).setCellValue(item.get(0).getFld011ObjemRlz().toString());
        row.createCell(14).setCellValue(item.get(0).getFld012PrdUslIsp().toString());
        row.createCell(15).setCellValue(item.get(0).getFld013IzmZps().toString());
        row.createCell(16).setCellValue(item.get(0).getFld014PrstUmn().toString());
        item.clear();
        em.clear();
    }
}
