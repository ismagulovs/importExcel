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
@Table(name = "stc_tbl_05_dhd_rlz_prd_usl")
public class StcTbl05DhdRlzPrdUsl {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_05_dhd_rlz_prd_usl_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_05_dhd_rlz_prd_usl_id_seq", allocationSize = 1, name = "stc_tbl_05_dhd_rlz_prd_usl_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld015DhdRlzc;
  private BigDecimal fld016DhdFin;
  private BigDecimal fld017DvdAkcVzng;
  private BigDecimal fld018PrDhd;
  private BigDecimal fld019DhdKursRznc;
  private BigDecimal fld020DhdVybAkt;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}