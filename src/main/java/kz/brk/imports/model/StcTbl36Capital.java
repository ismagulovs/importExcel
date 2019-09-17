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
@Table(name = "stc_tbl_36_capital")
public class StcTbl36Capital {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String idSubclass;
  private int god;
  private int fld181CptlNchl;
  private int fld182CptlKnc;
  private int fld183UstvCptlNchl;
  private int fld184UstvCptlKnc;
  private int fld185NeoplCptlNchl;
  private int fld186NeoplCptlKnc;
  private int fld187VykupSbsDolInstrNchl;
  private int fld188VykupSbsDolInstrKnc;
  private int fld189EmissDhdNchl;
  private int fld190EmissDhdKnc;
  private int fld191RzvrNchl;
  private int fld192RzvrKnc;
  private int fld193NerasprPrbNchl;
  private int fld194NerasprPrbKnc;
  private int fld195DolMenshNchl;
  private int fld196DolMenshKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}