package kz.brk.imports.DTO.admin;

import java.util.Date;

/**
 * Created by ww on 04.03.2016.
 */
public class PotokDateListDTO {
    private Date potok;

    public PotokDateListDTO(){}

    public PotokDateListDTO(Date potok) {
        this.potok = potok;
    }

    public Date getPotok() {
        return potok;
    }

    public void setPotok(Date potok) {
        this.potok = potok;
    }
}
