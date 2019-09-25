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
        row.createCell(215).setCellValue(item.get(0).getFld213PstpDenzhSr().toString());
        row.createCell(216).setCellValue(item.get(0).getFld214RlzcFinAktv().toString());
        row.createCell(217).setCellValue(item.get(0).getFld215RlzcAkcDl().toString());
        row.createCell(218).setCellValue(item.get(0).getFld216RlzcDlgInstr().toString());
        row.createCell(219).setCellValue(item.get(0).getFld217PgshZaimDrOrg().toString());
        row.createCell(220).setCellValue(item.get(0).getFld218PstpFfoDgv().toString());
        row.createCell(221).setCellValue(item.get(0).getFld219PrPstp().toString());
        row.createCell(222).setCellValue(item.get(0).getFld220VbtDenSrds().toString());
        row.createCell(223).setCellValue(item.get(0).getFld221PrbFinAktv().toString());
        row.createCell(224).setCellValue(item.get(0).getFld222PrbAkcDl().toString());
        row.createCell(225).setCellValue(item.get(0).getFld223PrbDlgInstr().toString());
        row.createCell(226).setCellValue(item.get(0).getFld224PrdsZaimDrOrg().toString());
        row.createCell(227).setCellValue(item.get(0).getFld225KrtSrch().toString());
        row.createCell(228).setCellValue(item.get(0).getFld226DlgSrch().toString());
        row.createCell(229).setCellValue(item.get(0).getFld227PltFfoDgv().toString());
        row.createCell(230).setCellValue(item.get(0).getFld228PrVbt().toString());
        row.createCell(231).setCellValue(item.get(0).getFld229ChstSumDenSr().toString());

        item.clear();
        em.clear();
    }
}
