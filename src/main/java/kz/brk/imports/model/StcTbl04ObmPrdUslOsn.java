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
@Table(name = "stc_tbl_04_obm_prd_usl_osn")
public class StcTbl04ObmPrdUslOsn {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_04_obm_prd_usl_osn_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_04_obm_prd_usl_osn_id_seq", allocationSize = 1, name = "stc_tbl_04_obm_prd_usl_osn_seq")
  private int id;
  private String idSubclass;
  private int god;
  private int fld010ObjemPrdUsl;
  private int fld011ObjemRlz;
  private int fld012PrdUslIsp;
  private int fld013IzmZps;
  private int fld014PrstUmn;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
