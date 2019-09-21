package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl42DvzhDenSrdInvstDtlt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_42 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl42DvzhDenSrdInvstDtlt> item = em.createQuery("select t " +
                "from StcTbl42DvzhDenSrdInvstDtlt t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(215).setCellValue(item.get(0).getFld213PstpDenzhSr());
        row.createCell(216).setCellValue(item.get(0).getFld214RlzcFinAktv());
        row.createCell(217).setCellValue(item.get(0).getFld215RlzcAkcDl());
        row.createCell(218).setCellValue(item.get(0).getFld216RlzcDlgInstr());
        row.createCell(219).setCellValue(item.get(0).getFld217PgshZaimDrOrg());
        row.createCell(220).setCellValue(item.get(0).getFld218PstpFfoDgv());
        row.createCell(221).setCellValue(item.get(0).getFld219PrPstp());
        row.createCell(222).setCellValue(item.get(0).getFld220VbtDenSrds());
        row.createCell(223).setCellValue(item.get(0).getFld221PrbFinAktv());
        row.createCell(224).setCellValue(item.get(0).getFld222PrbAkcDl());
        row.createCell(225).setCellValue(item.get(0).getFld223PrbDlgInstr());
        row.createCell(226).setCellValue(item.get(0).getFld224PrdsZaimDrOrg());
        row.createCell(227).setCellValue(item.get(0).getFld225KrtSrch());
        row.createCell(228).setCellValue(item.get(0).getFld226DlgSrch());
        row.createCell(229).setCellValue(item.get(0).getFld227PltFfoDgv());
        row.createCell(230).setCellValue(item.get(0).getFld228PrVbt());
        row.createCell(231).setCellValue(item.get(0).getFld229ChstSumDenSr());

        item.clear();
        em.clear();
    }
}
