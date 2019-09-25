package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl29DlgSrAktv;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_29 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl29DlgSrAktv> item = em.createQuery("select t " +
                "from StcTbl29DlgSrAktv t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(147).setCellValue(item.get(0).getFld145DlgAktvNchl().toString());
        row.createCell(148).setCellValue(item.get(0).getFld146DlgAktvKnc().toString());
        row.createCell(149).setCellValue(item.get(0).getFld147DlgFinInvNchl().toString());
        row.createCell(150).setCellValue(item.get(0).getFld148DlgFinInvKnc().toString());
        row.createCell(151).setCellValue(item.get(0).getFld149DlgDbtZdlNchl().toString());
        row.createCell(152).setCellValue(item.get(0).getFld150DlgDbtZdlKnc().toString());
        row.createCell(153).setCellValue(item.get(0).getFld151OsnSrdNchl().toString());
        row.createCell(154).setCellValue(item.get(0).getFld152OsnSrdKnc().toString());
        row.createCell(155).setCellValue(item.get(0).getFld153BioAktNchl().toString());
        row.createCell(156).setCellValue(item.get(0).getFld154BioAktKnc().toString());
        row.createCell(157).setCellValue(item.get(0).getFld155NematAktNchl().toString());
        row.createCell(158).setCellValue(item.get(0).getFld156NematAktKnc().toString());
        row.createCell(159).setCellValue(item.get(0).getFld157PrAktvNchl().toString());
        row.createCell(160).setCellValue(item.get(0).getFld158PrAktvKnc().toString());

        item.clear();
        em.clear();
    }
}
