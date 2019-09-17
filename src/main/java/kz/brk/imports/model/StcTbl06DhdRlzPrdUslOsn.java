package kz.brk.imports.model;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "stc_tbl_06_dhd_rlz_prd_usl_osn")
public class StcTbl06DhdRlzPrdUslOsn {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String idSubclass;
  private int god;
  private int fld021DhdRlzcPu;
  private int fld022DhdRlzc;
  private int fld023DhdFin;
  private int fld024DvdAkcVzng;
  private int fld025PrDhd;
  private int fld026DhdKursRznc;
  private int fld027DhdVybAkt;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
