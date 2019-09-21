package kz.brk.imports.servise.parser;

import kz.brk.imports.model.StcTbl00ChislnstRabot;
import kz.brk.imports.servise.parser.tablesOut.*;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.*;
import java.util.List;

@Stateless
public class DownloadExcel {
    @PersistenceContext(name="brk-imports")
    private EntityManager em;

    @Inject TblOut_02 tblOut02; @Inject TblOut_03 tblOut03; @Inject TblOut_04 tblOut04; @Inject TblOut_05 tblOut05;
    @Inject TblOut_06 tblOut06; @Inject TblOut_08 tblOut08; @Inject TblOut_10 tblOut10; @Inject TblOut_12 tblOut12;
    @Inject TblOut_18 tblOut18; @Inject TblOut_20 tblOut20; @Inject TblOut_22 tblOut22; @Inject TblOut_24 tblOut24;
    @Inject TblOut_26 tblOut26; @Inject TblOut_28 tblOut28; @Inject TblOut_29 tblOut29; @Inject TblOut_32 tblOut32;
    @Inject TblOut_34 tblOut34; @Inject TblOut_36 tblOut36; @Inject TblOut_40 tblOut40; @Inject TblOut_42 tblOut42;
    @Inject TblOut_44 tblOut44; @Inject TblOut_46 tblOut46;

    public boolean download(String fileName) throws IOException, InvalidFormatException {

        InputStream inp = new FileInputStream(fileName);
        Workbook wb = WorkbookFactory.create(inp);
        Sheet sheet = wb.getSheetAt(0);
        int numRow = 7;//sheet.getLastRowNum();
        int num = 0;
        List<StcTbl00ChislnstRabot> list_tbl_00 = em.createQuery("select t " +
                "from StcTbl00ChislnstRabot t where t.relevance=1 ")
                .getResultList();
        for ( StcTbl00ChislnstRabot item :list_tbl_00) {
            Row row = sheet.createRow(++numRow);
            row.createCell(0).setCellValue(++num);
            row.createCell(1).setCellValue(item.getIdSubclass());
            row.createCell(2).setCellValue(item.getNameKato());
            tblOut02.parseTblOut(row,item.getIdSubclass());
            tblOut03.parseTblOut(row,item.getIdSubclass());
            tblOut04.parseTblOut(row,item.getIdSubclass());
            tblOut05.parseTblOut(row,item.getIdSubclass());
            tblOut06.parseTblOut(row,item.getIdSubclass());
            tblOut08.parseTblOut(row,item.getIdSubclass());
            tblOut10.parseTblOut(row,item.getIdSubclass());
            tblOut12.parseTblOut(row,item.getIdSubclass());
            tblOut18.parseTblOut(row,item.getIdSubclass());
            tblOut20.parseTblOut(row,item.getIdSubclass());
            tblOut22.parseTblOut(row,item.getIdSubclass());
            tblOut24.parseTblOut(row,item.getIdSubclass());
            tblOut26.parseTblOut(row,item.getIdSubclass());
            tblOut28.parseTblOut(row,item.getIdSubclass());
            tblOut29.parseTblOut(row,item.getIdSubclass());
            tblOut32.parseTblOut(row,item.getIdSubclass());
            tblOut34.parseTblOut(row,item.getIdSubclass());
            tblOut36.parseTblOut(row,item.getIdSubclass());
            tblOut40.parseTblOut(row,item.getIdSubclass());
            tblOut42.parseTblOut(row,item.getIdSubclass());
            tblOut44.parseTblOut(row,item.getIdSubclass());
            tblOut46.parseTblOut(row,item.getIdSubclass());
        }
        // Now this Write the output to a file
        FileOutputStream fileOut = new FileOutputStream(fileName);
        wb.write(fileOut);
        fileOut.close();

        return true;
    }
}
