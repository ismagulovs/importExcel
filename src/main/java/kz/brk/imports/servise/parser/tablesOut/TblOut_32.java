package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl32KrtSrObz;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_32 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;


    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl32KrtSrObz> item = em.createQuery("select t " +
                "from StcTbl32KrtSrObz t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(161).setCellValue(item.get(0).getFld159KrtObzNchl());
        row.createCell(162).setCellValue(item.get(0).getFld160KrtObzKnc());
        row.createCell(163).setCellValue(item.get(0).getFld161KrtFinObzNchl());
        row.createCell(164).setCellValue(item.get(0).getFld162KrtFinObzKnc());
        row.createCell(165).setCellValue(item.get(0).getFld163KrtBnkZaimNchl());
        row.createCell(166).setCellValue(item.get(0).getFld164KrtBnkZaimKnc());
        row.createCell(167).setCellValue(item.get(0).getFld165ObzNlgNchl());
        row.createCell(168).setCellValue(item.get(0).getFld166ObzNlgKnc());
        row.createCell(169).setCellValue(item.get(0).getFld167KrtKrdZdlNchl());
        row.createCell(170).setCellValue(item.get(0).getFld168KrtKrdZdlKnc());
        row.createCell(171).setCellValue(item.get(0).getFld169PrObzNchl());
        row.createCell(172).setCellValue(item.get(0).getFld170PrObzKnc());

        item.clear();
        em.clear();
    }
}
