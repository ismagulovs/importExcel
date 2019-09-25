package kz.brk.imports.model;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
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
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_06_dhd_rlz_prd_usl_osn_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_06_dhd_rlz_prd_usl_osn_id_seq", allocationSize = 1, name = "stc_tbl_06_dhd_rlz_prd_usl_osn_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld021DhdRlzcPu;
  private BigDecimal fld022DhdRlzc;
  private BigDecimal fld023DhdFin;
  private BigDecimal fld024DvdAkcVzng;
  private BigDecimal fld025PrDhd;
  private BigDecimal fld026DhdKursRznc;
  private BigDecimal fld027DhdVybAkt;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
