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
@Table(name = "stc_tbl_32_krt_sr_obz")
public class StcTbl32KrtSrObz {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_32_krt_sr_obz_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_32_krt_sr_obz_id_seq", allocationSize = 1, name = "stc_tbl_32_krt_sr_obz_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld159KrtObzNchl;
  private BigDecimal fld160KrtObzKnc;
  private BigDecimal fld161KrtFinObzNchl;
  private BigDecimal fld162KrtFinObzKnc;
  private BigDecimal fld163KrtBnkZaimNchl;
  private BigDecimal fld164KrtBnkZaimKnc;
  private BigDecimal fld165ObzNlgNchl;
  private BigDecimal fld166ObzNlgKnc;
  private BigDecimal fld167KrtKrdZdlNchl;
  private BigDecimal fld168KrtKrdZdlKnc;
  private BigDecimal fld169PrObzNchl;
  private BigDecimal fld170PrObzKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}