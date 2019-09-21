package kz.brk.imports.servise.parser;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UpdateRelevance {
    @PersistenceContext(name="brk-imports")
    private EntityManager em;
    public void update() {

        int query_00 = em.createQuery("UPDATE StcTbl00ChislnstRabot SET relevance = relevance + 1").executeUpdate();
        int query_02 = em.createQuery("UPDATE StcTbl02OsnPkzFinHozDtlst SET relevance = relevance + 1").executeUpdate();
        int query_03 = em.createQuery("UPDATE StcTbl03ObshObmPrdUsl SET relevance = relevance + 1").executeUpdate();
        int query_04 = em.createQuery("UPDATE StcTbl04ObmPrdUslOsn SET relevance = relevance + 1").executeUpdate();
        int query_05 = em.createQuery("UPDATE StcTbl05DhdRlzPrdUsl SET relevance = relevance + 1").executeUpdate();
        int query_06 = em.createQuery("UPDATE StcTbl06DhdRlzPrdUslOsn SET relevance = relevance + 1").executeUpdate();
        int query_08 = em.createQuery("UPDATE StcTbl08ObshRashPredp SET relevance = relevance + 1").executeUpdate();
        int query_10 = em.createQuery("UPDATE StcTbl10RezFinHozDtlPrdp SET relevance = relevance + 1").executeUpdate();
        int query_12 = em.createQuery("UPDATE StcTbl12GrpPredpDhdUbtk SET relevance = relevance + 1").executeUpdate();
        int query_18 = em.createQuery("UPDATE StcTbl18NachNlgDrPlat SET relevance = relevance + 1").executeUpdate();
        int query_20 = em.createQuery("UPDATE StcTbl20FactPrchslNlgPlt SET relevance = relevance + 1").executeUpdate();
        int query_22 = em.createQuery("UPDATE StcTbl22SostVzmRschPrdp SET relevance = relevance + 1").executeUpdate();
        int query_24 = em.createQuery("UPDATE StcTbl24BalancePrdp SET relevance = relevance + 1").executeUpdate();
        int query_26 = em.createQuery("UPDATE StcTbl26KrtSrAktv SET relevance = relevance + 1").executeUpdate();
        int query_28 = em.createQuery("UPDATE StcTbl28Zapasy SET relevance = relevance + 1").executeUpdate();
        int query_29 = em.createQuery("UPDATE StcTbl29DlgSrAktv SET relevance = relevance + 1").executeUpdate();
        int query_32 = em.createQuery("UPDATE StcTbl32KrtSrObz SET relevance = relevance + 1").executeUpdate();
        int query_34 = em.createQuery("UPDATE StcTbl34DlgSrObz SET relevance = relevance + 1").executeUpdate();
        int query_36 = em.createQuery("UPDATE StcTbl36Capital SET relevance = relevance + 1").executeUpdate();
        int query_40 = em.createQuery("UPDATE StcTbl40DvzhDenSrdOperDtlt SET relevance = relevance + 1").executeUpdate();
        int query_42 = em.createQuery("UPDATE StcTbl42DvzhDenSrdInvstDtlt SET relevance = relevance + 1").executeUpdate();
        int query_44 = em.createQuery("UPDATE StcTbl44DvzhDenSrdFinDtlt SET relevance = relevance + 1").executeUpdate();
        int query_46 = em.createQuery("UPDATE StcTbl46ValiutPozc SET relevance = relevance + 1").executeUpdate();

        em.flush();
    }
}
