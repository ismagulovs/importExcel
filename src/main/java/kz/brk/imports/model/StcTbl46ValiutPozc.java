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
@Table(name = "stc_tbl_46_valiut_pozc")
public class StcTbl46ValiutPozc {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String idSubclass;
  private int god;
  private int fld245AktvInostrVlt;
  private int fld246KrtAktvInostrVlt;
  private int fld247DlgAktvInostrVlt;
  private int fld248ObzInostrVlt;
  private int fld249KrtObzInostrVlt;
  private int fld250DlgObzInostrVlt;
  private int fld251ChstPzcInostrVlt;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}