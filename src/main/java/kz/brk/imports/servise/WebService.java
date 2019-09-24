package kz.brk.imports.servise;

import kz.brk.imports.servise.parser.DownloadExcel;
import kz.brk.imports.servise.parser.Parser;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@Path("/")
@Produces("application/json;charset=UTF-8")
@Consumes("application/json;charset=UTF-8")
@Stateless
public class WebService {
    @Inject
    Parser parser;

    @Inject
    DownloadExcel downloadExcel;

    @GET
    @Consumes("application/json;charset=UTF-8")
    @Path("loadExcel")
    public Response loadExcel() {
        String res;
        try{
            res = parser.parse(FILE_PATH)?"ok":"false";
        }catch (Exception e){
            e.printStackTrace();
        }
        return Response.ok().entity(null).build();
    }

    @POST
    @Consumes("multipart/form-data")
    @Path("upload")
    public Response upload(MultipartFormDataInput input) {
        return Response.ok("Загрузка завершена").entity(parser.parseExcel(input.getParts().get(0))).build();
    }

    private static final String FILE_PATH = "C:\\Users\\SultanI\\work\\java\\excel_test.xls";

    @GET
    @Path("downloadExcel")
    @Produces("application/vnd.ms-excel")
    public Response downloadExcel() throws IOException {
        File file = new File(FILE_PATH);
         downloadExcel.download(FILE_PATH);
        Response.ResponseBuilder response = Response.ok((Object) file);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy_hh-mm");
        String strDate = formatter.format(date);

        response.header("Content-Disposition",
                "attachment; filename=export-download-upload-file_("+ strDate +").xls");
        return response.build();
    }

    @GET
    @Path("downloadExcel2")
    @Produces("application/vnd.ms-excel")
    public Response downloadExcel2() throws IOException {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy_hh-mm");
        String strDate = formatter.format(date);
       InputStream is = downloadExcel.download2();
        return Response.ok(is, MediaType.APPLICATION_OCTET_STREAM)
                .header("Content-Disposition", "attachment; filename=stat"+strDate+".xls")
                .build();
    }
}