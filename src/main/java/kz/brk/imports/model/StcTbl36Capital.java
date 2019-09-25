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
@Table(name = "stc_tbl_36_capital")
public class StcTbl36Capital {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_36_capital_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_36_capital_id_seq", allocationSize = 1, name = "stc_tbl_36_capital_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld181CptlNchl;
  private BigDecimal fld182CptlKnc;
  private BigDecimal fld183UstvCptlNchl;
  private BigDecimal fld184UstvCptlKnc;
  private BigDecimal fld185NeoplCptlNchl;
  private BigDecimal fld186NeoplCptlKnc;
  private BigDecimal fld187VykupSbsDolInstrNchl;
  private BigDecimal fld188VykupSbsDolInstrKnc;
  private BigDecimal fld189EmissDhdNchl;
  private BigDecimal fld190EmissDhdKnc;
  private BigDecimal fld191RzvrNchl;
  private BigDecimal fld192RzvrKnc;
  private BigDecimal fld193NerasprPrbNchl;
  private BigDecimal fld194NerasprPrbKnc;
  private BigDecimal fld195DolMenshNchl;
  private BigDecimal fld196DolMenshKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}