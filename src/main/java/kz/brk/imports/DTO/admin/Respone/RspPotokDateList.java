package kz.brk.imports.DTO.admin.Respone;

import kz.brk.imports.DTO.AbstractDTO;
import kz.brk.imports.DTO.admin.PotokDateListDTO;

import java.util.List;

/**
 * Created by ww on 04.03.2016.
 */
public class RspPotokDateList extends AbstractDTO{
    private List<PotokDateListDTO> list;

    public RspPotokDateList(){}

    public RspPotokDateList(List<PotokDateListDTO> list) {
        this.list = list;
    }

    public List<PotokDateListDTO> getList() {
        return list;
    }

    public void setList(List<PotokDateListDTO> list) {
        this.list = list;
    }
}
