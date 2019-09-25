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
@Table(name = "stc_tbl_20_fact_prchsl_nlg_plt")
public class StcTbl20FactPrchslNlgPlt {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_20_fact_prchsl_nlg_plt_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_20_fact_prchsl_nlg_plt_id_seq", allocationSize = 1, name = "stc_tbl_20_fact_prchsl_nlg_plt_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld067Vse;
  private BigDecimal fld068CorpPdhNlg;
  private BigDecimal fld069IndPdhNlg;
  private BigDecimal fld070SocNlg;
  private BigDecimal fld071OtchSocStrh;
  private BigDecimal fld072ZemNlg;
  private BigDecimal fld073NlgImsh;
  private BigDecimal fld074NlgTs;
  private BigDecimal fld075NlgDobStm;
  private BigDecimal fld076Akcz;
  private BigDecimal fld077NlgSpecPlat;
  private BigDecimal fld078NlgSvrhPrb;
  private BigDecimal fld079PrSpecPlt;
  private BigDecimal fld080DrObzPlat;
  private BigDecimal fld081TmzhPlat;
  private BigDecimal fld082PrchslObzVzn;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
