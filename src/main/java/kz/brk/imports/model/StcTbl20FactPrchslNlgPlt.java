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
@Table(name = "stc_tbl_20_fact_prchsl_nlg_plt")
public class StcTbl20FactPrchslNlgPlt {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String idSubclass;
  private int god;
  private int fld067Vse;
  private int fld068CorpPdhNlg;
  private int fld069IndPdhNlg;
  private int fld070SocNlg;
  private int fld071OtchSocStrh;
  private int fld072ZemNlg;
  private int fld073NlgImsh;
  private int fld074NlgTs;
  private int fld075NlgDobStm;
  private int fld076Akcz;
  private int fld077NlgSpecPlat;
  private int fld078NlgSvrhPrb;
  private int fld079PrSpecPlt;
  private int fld080DrObzPlat;
  private int fld081TmzhPlat;
  private int fld082PrchslObzVzn;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
