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
@Table(name = "stc_tbl_28_zapasy")
public class StcTbl28Zapasy {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_28_zapasy_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_28_zapasy_id_seq", allocationSize = 1, name = "stc_tbl_28_zapasy_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld133ZpsNchl;
  private BigDecimal fld134ZpsKnc;
  private BigDecimal fld135SrMtrlNchl;
  private BigDecimal fld136SrMtrlKnc;
  private BigDecimal fld137GtvPrdNchl;
  private BigDecimal fld138GtvPrdKnc;
  private BigDecimal fld139TvrNchl;
  private BigDecimal fld140TvrKnc;
  private BigDecimal fld141NzvrPrzvNchl;
  private BigDecimal fld142NzvrPrzvKnc;
  private BigDecimal fld143PrZpsNchl;
  private BigDecimal fld144PrZpsKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}