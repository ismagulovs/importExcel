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
@Table(name = "stc_tbl_08_obsh_rash_predp")
public class StcTbl08ObshRashPredp {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_08_obsh_rash_predp_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_08_obsh_rash_predp_id_seq", allocationSize = 1, name = "stc_tbl_08_obsh_rash_predp_seq")
  private int id;
  private String idSubclass;
  private int god;
  private int fld028Vsego;
  private int fld029PrzvRhd;
  private int fld030MatZatr;
  private int fld031AmrtOsnSr;
  private int fld032AmrtNemat;
  private int fld033FondZpr;
  private int fld034DenPsbRab;
  private int fld035PrZtr;
  private int fld036NeprzvRsh;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
