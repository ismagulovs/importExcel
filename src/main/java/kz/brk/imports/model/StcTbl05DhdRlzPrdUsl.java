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
@Table(name = "stc_tbl_05_dhd_rlz_prd_usl")
public class StcTbl05DhdRlzPrdUsl {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_05_dhd_rlz_prd_usl_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_05_dhd_rlz_prd_usl_id_seq", allocationSize = 1, name = "stc_tbl_05_dhd_rlz_prd_usl_seq")
  private int id;
  private String idSubclass;
  private int god;
  private int fld015DhdRlzc;
  private int fld016DhdFin;
  private int fld017DvdAkcVzng;
  private int fld018PrDhd;
  private int fld019DhdKursRznc;
  private int fld020DhdVybAkt;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}