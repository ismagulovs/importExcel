package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl34DlgSrObz;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_34 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl34DlgSrObz> item = em.createQuery("select t " +
                "from StcTbl34DlgSrObz t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(173).setCellValue(item.get(0).getFld171DlgObzNchl());
        row.createCell(174).setCellValue(item.get(0).getFld172DlgObzKnc());
        row.createCell(175).setCellValue(item.get(0).getFld173DlgFinObzNchl());
        row.createCell(176).setCellValue(item.get(0).getFld174DlgFinObzKnc());
        row.createCell(177).setCellValue(item.get(0).getFld175DlgBnkZaimNchl());
        row.createCell(178).setCellValue(item.get(0).getFld176DlgBnkZaimKnc());
        row.createCell(179).setCellValue(item.get(0).getFld177DlgKrdZdlNchl());
        row.createCell(180).setCellValue(item.get(0).getFld178DlgKrdZdlKnc());
        row.createCell(181).setCellValue(item.get(0).getFld179PrObzNchl());
        row.createCell(182).setCellValue(item.get(0).getFld180PrObzKnc());

        item.clear();
        em.clear();
    }
}
