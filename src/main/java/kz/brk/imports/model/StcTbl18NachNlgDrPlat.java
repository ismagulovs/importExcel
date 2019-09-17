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
@Table(name = "stc_tbl_18_nach_nlg_dr_plat")
public class StcTbl18NachNlgDrPlat {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String idSubclass;
  private int god;
  private int fld051Vsego;
  private int fld052CorpPdhNlg;
  private int fld053IndPdhNlg;
  private int fld054SocNlg;
  private int fld055OtchSocStrh;
  private int fld056ZemNlg;
  private int fld057NlgImsh;
  private int fld058NlgTs;
  private int fld059NlgDobStm;
  private int fld060Akcz;
  private int fld061NlgSpecPlat;
  private int fld062NlgSvrhPrb;
  private int fld063PrSpecPlt;
  private int fld064DrObzPlat;
  private int fld065TmzhPlat;
  private int fld066PrchslObzVzn;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
