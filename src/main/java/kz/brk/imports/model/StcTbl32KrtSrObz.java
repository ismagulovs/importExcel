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
@Table(name = "stc_tbl_32_krt_sr_obz")
public class StcTbl32KrtSrObz {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_32_krt_sr_obz_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_32_krt_sr_obz_id_seq", allocationSize = 1, name = "stc_tbl_32_krt_sr_obz_seq")
  private int id;
  private String idSubclass;
  private int god;
  private int fld159KrtObzNchl;
  private int fld160KrtObzKnc;
  private int fld161KrtFinObzNchl;
  private int fld162KrtFinObzKnc;
  private int fld163KrtBnkZaimNchl;
  private int fld164KrtBnkZaimKnc;
  private int fld165ObzNlgNchl;
  private int fld166ObzNlgKnc;
  private int fld167KrtKrdZdlNchl;
  private int fld168KrtKrdZdlKnc;
  private int fld169PrObzNchl;
  private int fld170PrObzKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}