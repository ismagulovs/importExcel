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
@Table(name = "stc_tbl_28_zapasy")
public class StcTbl28Zapasy {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_28_zapasy_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_28_zapasy_id_seq", allocationSize = 1, name = "stc_tbl_28_zapasy_seq")
  private int id;
  private String idSubclass;
  private int god;
  private int fld133ZpsNchl;
  private int fld134ZpsKnc;
  private int fld135SrMtrlNchl;
  private int fld136SrMtrlKnc;
  private int fld137GtvPrdNchl;
  private int fld138GtvPrdKnc;
  private int fld139TvrNchl;
  private int fld140TvrKnc;
  private int fld141NzvrPrzvNchl;
  private int fld142NzvrPrzvKnc;
  private int fld143PrZpsNchl;
  private int fld144PrZpsKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}