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
@Table(name = "stc_tbl_03_obsh_obm_prd_usl")
public class StcTbl03ObshObmPrdUsl {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_03_obsh_obm_prd_usl_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_03_obsh_obm_prd_usl_id_seq", allocationSize = 1, name = "stc_tbl_03_obsh_obm_prd_usl_seq")
  private int id;
  private String idSubclass;
  private int god;
  private int fld006ObjemRlz;
  private int fld007PrdUslIsp;
  private int fld008IzmZps;
  private int fld009PrstUmn;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}