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
@Table(name = "stc_tbl_18_nach_nlg_dr_plat")
public class StcTbl18NachNlgDrPlat {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_18_nach_nlg_dr_plat_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_18_nach_nlg_dr_plat_id_seq", allocationSize = 1, name = "stc_tbl_18_nach_nlg_dr_plat_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld051Vsego;
  private BigDecimal fld052CorpPdhNlg;
  private BigDecimal fld053IndPdhNlg;
  private BigDecimal fld054SocNlg;
  private BigDecimal fld055OtchSocStrh;
  private BigDecimal fld056ZemNlg;
  private BigDecimal fld057NlgImsh;
  private BigDecimal fld058NlgTs;
  private BigDecimal fld059NlgDobStm;
  private BigDecimal fld060Akcz;
  private BigDecimal fld061NlgSpecPlat;
  private BigDecimal fld062NlgSvrhPrb;
  private BigDecimal fld063PrSpecPlt;
  private BigDecimal fld064DrObzPlat;
  private BigDecimal fld065TmzhPlat;
  private BigDecimal fld066PrchslObzVzn;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
