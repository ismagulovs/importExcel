package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl36Capital;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_36 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;


    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl36Capital> item = em.createQuery("select t " +
                "from StcTbl36Capital t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(183).setCellValue(item.get(0).getFld181CptlNchl().toString());
        row.createCell(184).setCellValue(item.get(0).getFld182CptlKnc().toString());
        row.createCell(185).setCellValue(item.get(0).getFld183UstvCptlNchl().toString());
        row.createCell(186).setCellValue(item.get(0).getFld184UstvCptlKnc().toString());
        row.createCell(187).setCellValue(item.get(0).getFld185NeoplCptlNchl().toString());
        row.createCell(188).setCellValue(item.get(0).getFld186NeoplCptlKnc().toString());
        row.createCell(189).setCellValue(item.get(0).getFld187VykupSbsDolInstrNchl().toString());
        row.createCell(190).setCellValue(item.get(0).getFld188VykupSbsDolInstrKnc().toString());
        row.createCell(191).setCellValue(item.get(0).getFld189EmissDhdNchl().toString());
        row.createCell(192).setCellValue(item.get(0).getFld190EmissDhdKnc().toString());
        row.createCell(193).setCellValue(item.get(0).getFld191RzvrNchl().toString());
        row.createCell(194).setCellValue(item.get(0).getFld192RzvrKnc().toString());
        row.createCell(195).setCellValue(item.get(0).getFld193NerasprPrbNchl().toString());
        row.createCell(196).setCellValue(item.get(0).getFld194NerasprPrbKnc().toString());
        row.createCell(197).setCellValue(item.get(0).getFld195DolMenshNchl().toString());
        row.createCell(198).setCellValue(item.get(0).getFld196DolMenshKnc().toString());

        item.clear();
        em.clear();
    }
}
