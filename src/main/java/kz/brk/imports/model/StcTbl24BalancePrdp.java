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
@Table(name = "stc_tbl_24_balance_prdp")
public class StcTbl24BalancePrdp {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_24_balance_prdp_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_24_balance_prdp_id_seq", allocationSize = 1, name = "stc_tbl_24_balance_prdp_seq")
  private int id;
  private String idSubclass;
  private int god;
  private int fld105BlsAktvNchl;
  private int fld106BlsAktvKnc;
  private int fld107KrtAktvNchl;
  private int fld108KrtAktvKnc;
  private int fld109DlgAktvNchl;
  private int fld110DlgAktvKnc;
  private int fld111BlsObzNchl;
  private int fld112BlsObzKnc;
  private int fld113KrtObzNchl;
  private int fld114KrtObzKnc;
  private int fld115DlgObzNchl;
  private int fld116DlgObzKnc;
  private int fld117KptlNchl;
  private int fld118KptlKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}