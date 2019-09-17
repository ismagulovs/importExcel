package kz.brk.imports.DTO.admin.Respone;

import kz.brk.imports.DTO.AbstractDTO;
import kz.brk.imports.DTO.admin.DateListDTO;

import java.util.List;

/**
 * Created by ww on 04.03.2016.
 */
public class RspDateList extends AbstractDTO{
    private List<DateListDTO> list;

    public RspDateList(){}

    public RspDateList(List<DateListDTO> list) {
        this.list = list;
    }

    public List<DateListDTO> getList() {
        return list;
    }

    public void setList(List<DateListDTO> list) {
        this.list = list;
    }
}
