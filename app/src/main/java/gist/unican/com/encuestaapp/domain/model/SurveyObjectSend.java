package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.siimkinks.sqlitemagic.annotation.Table;

@Table(persistAll = true)
public class SurveyObjectSend {

    public SurveyObjectSend() {

    }

    @SerializedName("ID")
    @Expose
    public Integer iD;
    @SerializedName("encuestador")
    @Expose
    public String encuestador;
    @SerializedName("hora")
    @Expose
    public String hora;
    @SerializedName("sexo_hombre")
    @Expose
    public Integer sexoHombre;
    @SerializedName("sexo_mujer")
    @Expose
    public Integer sexoMujer;
    @SerializedName("edad_25")
    @Expose
    public Integer edad25;
    @SerializedName("edad_2534")
    @Expose
    public Integer edad2534;
    @SerializedName("edad_3544")
    @Expose
    public Integer edad3544;
    @SerializedName("edad_4554")
    @Expose
    public Integer edad4554;
    @SerializedName("edad_5564")
    @Expose
    public Integer edad5564;
    @SerializedName("edad_65")
    @Expose
    public Integer edad65;
    @SerializedName("trabajo_trabajador")
    @Expose
    public Integer trabajoTrabajador;
    @SerializedName("trabajo_desempleado")
    @Expose
    public Integer trabajoDesempleado;
    @SerializedName("trabajo_estudiante")
    @Expose
    public Integer trabajoEstudiante;
    @SerializedName("trabajo_jubilado")
    @Expose
    public Integer trabajoJubilado;
    @SerializedName("carnet_si")
    @Expose
    public Integer carnetSi;
    @SerializedName("carnet_no")
    @Expose
    public Integer carnetNo;
    @SerializedName("vehiculo_si")
    @Expose
    public Integer vehiculoSi;
    @SerializedName("vehiculo_no")
    @Expose
    public Integer vehiculoNo;
    @SerializedName("linea")
    @Expose
    public String linea;
    @SerializedName("motivo_inicio")
    @Expose
    public Integer motivoInicio;
    @SerializedName("motivo_fin")
    @Expose
    public Integer motivoFin;
    @SerializedName("viajes_5")
    @Expose
    public Integer viajes5;
    @SerializedName("viajes_515")
    @Expose
    public Integer viajes515;
    @SerializedName("viajes_1530")
    @Expose
    public Integer viajes1530;
    @SerializedName("viajes_30")
    @Expose
    public Integer viajes30;
    @SerializedName("pago_tarjeta")
    @Expose
    public Integer pagoTarjeta;
    @SerializedName("pago_efectivo")
    @Expose
    public Integer pagoEfectivo;
    @SerializedName("ingreso_900")
    @Expose
    public Integer ingreso900;
    @SerializedName("ingreso_9001500")
    @Expose
    public Integer ingreso9001500;
    @SerializedName("ingreso_15002500")
    @Expose
    public Integer ingreso15002500;
    @SerializedName("ingreso_2500")
    @Expose
    public Integer ingreso2500;
    @SerializedName("ingreso_nsnc")
    @Expose
    public Integer ingresoNsnc;
    @SerializedName("valoriacion_muymal")
    @Expose
    public Integer valoriacionMuymal;
    @SerializedName("valoracion_mal")
    @Expose
    public Integer valoracionMal;
    @SerializedName("valoracion_normal")
    @Expose
    public Integer valoracionNormal;
    @SerializedName("valoracion_bien")
    @Expose
    public Integer valoracionBien;
    @SerializedName("valoracion_muybien")
    @Expose
    public Integer valoracionMuybien;
    @SerializedName("thp_mm")
    @Expose
    public Integer thpMm;
    @SerializedName("thp_ma")
    @Expose
    public Integer thpMa;
    @SerializedName("thp_no")
    @Expose
    public Integer thpNo;
    @SerializedName("thp_bi")
    @Expose
    public Integer thpBi;
    @SerializedName("thp_mb")
    @Expose
    public Integer thpMb;
    @SerializedName("thp_ns")
    @Expose
    public Integer thpNs;
    @SerializedName("thp_be")
    @Expose
    public Integer thpBe;
    @SerializedName("thp_wo")
    @Expose
    public Integer thpWo;
    @SerializedName("thp_mi")
    @Expose
    public Integer thpMi;
    @SerializedName("thp_li")
    @Expose
    public Integer thpLi;
    @SerializedName("tep_mm")
    @Expose
    public Integer tepMm;
    @SerializedName("tep_ma")
    @Expose
    public Integer tepMa;
    @SerializedName("tep_no")
    @Expose
    public Integer tepNo;
    @SerializedName("tep_bi")
    @Expose
    public Integer tepBi;
    @SerializedName("tep_mb")
    @Expose
    public Integer tepMb;
    @SerializedName("tep_ns")
    @Expose
    public Integer tepNs;
    @SerializedName("tep_be")
    @Expose
    public Integer tepBe;
    @SerializedName("tep_wo")
    @Expose
    public Integer tepWo;
    @SerializedName("tep_mi")
    @Expose
    public Integer tepMi;
    @SerializedName("tep_li")
    @Expose
    public Integer tepLi;
    @SerializedName("tv_mm")
    @Expose
    public Integer tvMm;
    @SerializedName("tv_ma")
    @Expose
    public Integer tvMa;
    @SerializedName("tv_no")
    @Expose
    public Integer tvNo;
    @SerializedName("tv_bi")
    @Expose
    public Integer tvBi;
    @SerializedName("tv_mb")
    @Expose
    public Integer tvMb;
    @SerializedName("tv_ns")
    @Expose
    public Integer tvNs;
    @SerializedName("tv_be")
    @Expose
    public Integer tvBe;
    @SerializedName("tv_wo")
    @Expose
    public Integer tvWo;
    @SerializedName("tv_mi")
    @Expose
    public Integer tvMi;
    @SerializedName("tv_li")
    @Expose
    public Integer tvLi;
    @SerializedName("tpd_mm")
    @Expose
    public Integer tpdMm;
    @SerializedName("tpd_ma")
    @Expose
    public Integer tpdMa;
    @SerializedName("tpd_no")
    @Expose
    public Integer tpdNo;
    @SerializedName("tpd_bi")
    @Expose
    public Integer tpdBi;
    @SerializedName("tpd_mb")
    @Expose
    public Integer tpdMb;
    @SerializedName("tpd_ns")
    @Expose
    public Integer tpdNs;
    @SerializedName("tpd_be")
    @Expose
    public Integer tpdBe;
    @SerializedName("tpd_wo")
    @Expose
    public Integer tpdWo;
    @SerializedName("tpd_mi")
    @Expose
    public Integer tpdMi;
    @SerializedName("tpd_li")
    @Expose
    public Integer tpdLi;
    @SerializedName("pv_mm")
    @Expose
    public Integer pvMm;
    @SerializedName("pv_ma")
    @Expose
    public Integer pvMa;
    @SerializedName("pv_no")
    @Expose
    public Integer pvNo;
    @SerializedName("pv_bi")
    @Expose
    public Integer pvBi;
    @SerializedName("pv_mb")
    @Expose
    public Integer pvMb;
    @SerializedName("pv_ns")
    @Expose
    public Integer pvNs;
    @SerializedName("pv_be")
    @Expose
    public Integer pvBe;
    @SerializedName("pv_wo")
    @Expose
    public Integer pvWo;
    @SerializedName("pv_mi")
    @Expose
    public Integer pvMi;
    @SerializedName("pv_li")
    @Expose
    public Integer pvLi;
    @SerializedName("ft_mm")
    @Expose
    public Integer ftMm;
    @SerializedName("ft_ma")
    @Expose
    public Integer ftMa;
    @SerializedName("ft_no")
    @Expose
    public Integer ftNo;
    @SerializedName("ft_bi")
    @Expose
    public Integer ftBi;
    @SerializedName("ft_mb")
    @Expose
    public Integer ftMb;
    @SerializedName("ft_ns")
    @Expose
    public Integer ftNs;
    @SerializedName("ft_be")
    @Expose
    public Integer ftBe;
    @SerializedName("ft_wo")
    @Expose
    public Integer ftWo;
    @SerializedName("ft_mi")
    @Expose
    public Integer ftMi;
    @SerializedName("ft_li")
    @Expose
    public Integer ftLi;
    @SerializedName("so_mm")
    @Expose
    public Integer soMm;
    @SerializedName("so_ma")
    @Expose
    public Integer soMa;
    @SerializedName("so_no")
    @Expose
    public Integer soNo;
    @SerializedName("so_bi")
    @Expose
    public Integer soBi;
    @SerializedName("so_mb")
    @Expose
    public Integer soMb;
    @SerializedName("so_ns")
    @Expose
    public Integer soNs;
    @SerializedName("so_be")
    @Expose
    public Integer soBe;
    @SerializedName("so_wo")
    @Expose
    public Integer soWo;
    @SerializedName("so_mi")
    @Expose
    public Integer soMi;
    @SerializedName("so_li")
    @Expose
    public Integer soLi;
    @SerializedName("fs_mm")
    @Expose
    public Integer fsMm;
    @SerializedName("fs_ma")
    @Expose
    public Integer fsMa;
    @SerializedName("fs_no")
    @Expose
    public Integer fsNo;
    @SerializedName("fs_bi")
    @Expose
    public Integer fsBi;
    @SerializedName("fs_mb")
    @Expose
    public Integer fsMb;
    @SerializedName("fs_ns")
    @Expose
    public Integer fsNs;
    @SerializedName("fs_be")
    @Expose
    public Integer fsBe;
    @SerializedName("fs_wo")
    @Expose
    public Integer fsWo;
    @SerializedName("fs_mi")
    @Expose
    public Integer fsMi;
    @SerializedName("fs_li")
    @Expose
    public Integer fsLi;
    @SerializedName("le_mm")
    @Expose
    public Integer leMm;
    @SerializedName("le_ma")
    @Expose
    public Integer leMa;
    @SerializedName("le_no")
    @Expose
    public Integer leNo;
    @SerializedName("le_bi")
    @Expose
    public Integer leBi;
    @SerializedName("le_mb")
    @Expose
    public Integer leMb;
    @SerializedName("le_ns")
    @Expose
    public Integer leNs;
    @SerializedName("le_be")
    @Expose
    public Integer leBe;
    @SerializedName("le_wo")
    @Expose
    public Integer leWo;
    @SerializedName("le_mi")
    @Expose
    public Integer leMi;
    @SerializedName("le_li")
    @Expose
    public Integer leLi;
    @SerializedName("sn_mm")
    @Expose
    public Integer snMm;
    @SerializedName("sn_ma")
    @Expose
    public Integer snMa;
    @SerializedName("sn_no")
    @Expose
    public Integer snNo;
    @SerializedName("sn_bi")
    @Expose
    public Integer snBi;
    @SerializedName("sn_mb")
    @Expose
    public Integer snMb;
    @SerializedName("sn_ns")
    @Expose
    public Integer snNs;
    @SerializedName("sn_be")
    @Expose
    public Integer snBe;
    @SerializedName("sn_wo")
    @Expose
    public Integer snWo;
    @SerializedName("sn_mi")
    @Expose
    public Integer snMi;
    @SerializedName("sn_li")
    @Expose
    public Integer snLi;
    @SerializedName("sfs_mm")
    @Expose
    public Integer sfsMm;
    @SerializedName("sfs_ma")
    @Expose
    public Integer sfsMa;
    @SerializedName("sfs_no")
    @Expose
    public Integer sfsNo;
    @SerializedName("sfs_bi")
    @Expose
    public Integer sfsBi;
    @SerializedName("sfs_mb")
    @Expose
    public Integer sfsMb;
    @SerializedName("sfs_ns")
    @Expose
    public Integer sfsNs;
    @SerializedName("sfs_be")
    @Expose
    public Integer sfsBe;
    @SerializedName("sfs_wo")
    @Expose
    public Integer sfsWo;
    @SerializedName("sfs_mi")
    @Expose
    public Integer sfsMi;
    @SerializedName("sfs_li")
    @Expose
    public Integer sfsLi;
    @SerializedName("cl_mm")
    @Expose
    public Integer clMm;
    @SerializedName("cl_ma")
    @Expose
    public Integer clMa;
    @SerializedName("cl_no")
    @Expose
    public Integer clNo;
    @SerializedName("cl_bi")
    @Expose
    public Integer clBi;
    @SerializedName("cl_mb")
    @Expose
    public Integer clMb;
    @SerializedName("cl_ns")
    @Expose
    public Integer clNs;
    @SerializedName("cl_be")
    @Expose
    public Integer clBe;
    @SerializedName("cl_wo")
    @Expose
    public Integer clWo;
    @SerializedName("cl_mi")
    @Expose
    public Integer clMi;
    @SerializedName("cl_li")
    @Expose
    public Integer clLi;
    @SerializedName("ipi_mm")
    @Expose
    public Integer ipiMm;
    @SerializedName("ipi_ma")
    @Expose
    public Integer ipiMa;
    @SerializedName("ipi_no")
    @Expose
    public Integer ipiNo;
    @SerializedName("ipi_bi")
    @Expose
    public Integer ipiBi;
    @SerializedName("ipi_mb")
    @Expose
    public Integer ipiMb;
    @SerializedName("ipi_ns")
    @Expose
    public Integer ipiNs;
    @SerializedName("ipi_be")
    @Expose
    public Integer ipiBe;
    @SerializedName("ipi_wo")
    @Expose
    public Integer ipiWo;
    @SerializedName("ipi_mi")
    @Expose
    public Integer ipiMi;
    @SerializedName("ipi_li")
    @Expose
    public Integer ipiLi;
    @SerializedName("isi_mm")
    @Expose
    public Integer isiMm;
    @SerializedName("isi_ma")
    @Expose
    public Integer isiMa;
    @SerializedName("isi_no")
    @Expose
    public Integer isiNo;
    @SerializedName("isi_bi")
    @Expose
    public Integer isiBi;
    @SerializedName("isi_mb")
    @Expose
    public Integer isiMb;
    @SerializedName("isi_ns")
    @Expose
    public Integer isiNs;
    @SerializedName("isi_be")
    @Expose
    public Integer isiBe;
    @SerializedName("isi_wo")
    @Expose
    public Integer isiWo;
    @SerializedName("isi_mi")
    @Expose
    public Integer isiMi;
    @SerializedName("isi_li")
    @Expose
    public Integer isiLi;
    @SerializedName("ima_mm")
    @Expose
    public Integer imaMm;
    @SerializedName("ima_ma")
    @Expose
    public Integer imaMa;
    @SerializedName("ima_no")
    @Expose
    public Integer imaNo;
    @SerializedName("ima_bi")
    @Expose
    public Integer imaBi;
    @SerializedName("ima_mb")
    @Expose
    public Integer imaMb;
    @SerializedName("ima_ns")
    @Expose
    public Integer imaNs;
    @SerializedName("ima_be")
    @Expose
    public Integer imaBe;
    @SerializedName("ima_wo")
    @Expose
    public Integer imaWo;
    @SerializedName("ima_mi")
    @Expose
    public Integer imaMi;
    @SerializedName("ima_li")
    @Expose
    public Integer imaLi;
    @SerializedName("ocu_mm")
    @Expose
    public Integer ocuMm;
    @SerializedName("ocu_ma")
    @Expose
    public Integer ocuMa;
    @SerializedName("ocu_no")
    @Expose
    public Integer ocuNo;
    @SerializedName("ocu_bi")
    @Expose
    public Integer ocuBi;
    @SerializedName("ocu_mb")
    @Expose
    public Integer ocuMb;
    @SerializedName("ocu_ns")
    @Expose
    public Integer ocuNs;
    @SerializedName("ocu_be")
    @Expose
    public Integer ocuBe;
    @SerializedName("ocu_wo")
    @Expose
    public Integer ocuWo;
    @SerializedName("ocu_mi")
    @Expose
    public Integer ocuMi;
    @SerializedName("ocu_li")
    @Expose
    public Integer ocuLi;
    @SerializedName("cac_mm")
    @Expose
    public Integer cacMm;
    @SerializedName("cac_ma")
    @Expose
    public Integer cacMa;
    @SerializedName("cac_no")
    @Expose
    public Integer cacNo;
    @SerializedName("cac_bi")
    @Expose
    public Integer cacBi;
    @SerializedName("cac_mb")
    @Expose
    public Integer cacMb;
    @SerializedName("cac_ns")
    @Expose
    public Integer cacNs;
    @SerializedName("cac_be")
    @Expose
    public Integer cacBe;
    @SerializedName("cac_wo")
    @Expose
    public Integer cacWo;
    @SerializedName("cac_mi")
    @Expose
    public Integer cacMi;
    @SerializedName("cac_li")
    @Expose
    public Integer cacLi;
    @SerializedName("pmr_mm")
    @Expose
    public Integer pmrMm;
    @SerializedName("pmr_ma")
    @Expose
    public Integer pmrMa;
    @SerializedName("pmr_no")
    @Expose
    public Integer pmrNo;
    @SerializedName("pmr_bi")
    @Expose
    public Integer pmrBi;
    @SerializedName("pmr_mb")
    @Expose
    public Integer pmrMb;
    @SerializedName("pmr_ns")
    @Expose
    public Integer pmrNs;
    @SerializedName("pmr_be")
    @Expose
    public Integer pmrBe;
    @SerializedName("pmr_wo")
    @Expose
    public Integer pmrWo;
    @SerializedName("pmr_mi")
    @Expose
    public Integer pmrMi;
    @SerializedName("pmr_li")
    @Expose
    public Integer pmrLi;
    @SerializedName("ccf_mm")
    @Expose
    public Integer ccfMm;
    @SerializedName("ccf_ma")
    @Expose
    public Integer ccfMa;
    @SerializedName("ccf_no")
    @Expose
    public Integer ccfNo;
    @SerializedName("ccf_bi")
    @Expose
    public Integer ccfBi;
    @SerializedName("ccf_mb")
    @Expose
    public Integer ccfMb;
    @SerializedName("ccf_ns")
    @Expose
    public Integer ccfNs;
    @SerializedName("ccf_be")
    @Expose
    public Integer ccfBe;
    @SerializedName("ccf_wo")
    @Expose
    public Integer ccfWo;
    @SerializedName("ccf_mi")
    @Expose
    public Integer ccfMi;
    @SerializedName("ccf_li")
    @Expose
    public Integer ccfLi;
    @SerializedName("la_mm")
    @Expose
    public Integer laMm;
    @SerializedName("la_ma")
    @Expose
    public Integer laMa;
    @SerializedName("la_no")
    @Expose
    public Integer laNo;
    @SerializedName("la_bi")
    @Expose
    public Integer laBi;
    @SerializedName("la_mb")
    @Expose
    public Integer laMb;
    @SerializedName("la_ns")
    @Expose
    public Integer laNs;
    @SerializedName("la_be")
    @Expose
    public Integer laBe;
    @SerializedName("la_wo")
    @Expose
    public Integer laWo;
    @SerializedName("la_mi")
    @Expose
    public Integer laMi;
    @SerializedName("la_li")
    @Expose
    public Integer laLi;
    @SerializedName("ppo_mm")
    @Expose
    public Integer ppoMm;
    @SerializedName("ppo_ma")
    @Expose
    public Integer ppoMa;
    @SerializedName("ppo_no")
    @Expose
    public Integer ppoNo;
    @SerializedName("ppo_bi")
    @Expose
    public Integer ppoBi;
    @SerializedName("ppo_mb")
    @Expose
    public Integer ppoMb;
    @SerializedName("ppo_ns")
    @Expose
    public Integer ppoNs;
    @SerializedName("ppo_be")
    @Expose
    public Integer ppoBe;
    @SerializedName("ppo_wo")
    @Expose
    public Integer ppoWo;
    @SerializedName("ppo_mi")
    @Expose
    public Integer ppoMi;
    @SerializedName("ppo_li")
    @Expose
    public Integer ppoLi;
    @SerializedName("fc_mm")
    @Expose
    public Integer fcMm;
    @SerializedName("fc_ma")
    @Expose
    public Integer fcMa;
    @SerializedName("fc_no")
    @Expose
    public Integer fcNo;
    @SerializedName("fc_bi")
    @Expose
    public Integer fcBi;
    @SerializedName("fc_mb")
    @Expose
    public Integer fcMb;
    @SerializedName("fc_ns")
    @Expose
    public Integer fcNs;
    @SerializedName("fc_be")
    @Expose
    public Integer fcBe;
    @SerializedName("fc_wo")
    @Expose
    public Integer fcWo;
    @SerializedName("fc_mi")
    @Expose
    public Integer fcMi;
    @SerializedName("fc_li")
    @Expose
    public Integer fcLi;
    @SerializedName("aco_mm")
    @Expose
    public Integer acoMm;
    @SerializedName("aco_ma")
    @Expose
    public Integer acoMa;
    @SerializedName("aco_no")
    @Expose
    public Integer acoNo;
    @SerializedName("aco_bi")
    @Expose
    public Integer acoBi;
    @SerializedName("aco_mb")
    @Expose
    public Integer acoMb;
    @SerializedName("aco_ns")
    @Expose
    public Integer acoNs;
    @SerializedName("aco_be")
    @Expose
    public Integer acoBe;
    @SerializedName("aco_wo")
    @Expose
    public Integer acoWo;
    @SerializedName("aco_mi")
    @Expose
    public Integer acoMi;
    @SerializedName("aco_li")
    @Expose
    public Integer acoLi;
    @SerializedName("ibh_mm")
    @Expose
    public Integer ibhMm;
    @SerializedName("ibh_ma")
    @Expose
    public Integer ibhMa;
    @SerializedName("ibh_no")
    @Expose
    public Integer ibhNo;
    @SerializedName("ibh_bi")
    @Expose
    public Integer ibhBi;
    @SerializedName("ibh_mb")
    @Expose
    public Integer ibhMb;
    @SerializedName("ibh_ns")
    @Expose
    public Integer ibhNs;
    @SerializedName("ibh_be")
    @Expose
    public Integer ibhBe;
    @SerializedName("ibh_wo")
    @Expose
    public Integer ibhWo;
    @SerializedName("ibh_mi")
    @Expose
    public Integer ibhMi;
    @SerializedName("ibh_li")
    @Expose
    public Integer ibhLi;
    @SerializedName("cas_mm")
    @Expose
    public Integer casMm;
    @SerializedName("cas_ma")
    @Expose
    public Integer casMa;
    @SerializedName("cas_no")
    @Expose
    public Integer casNo;
    @SerializedName("cas_bi")
    @Expose
    public Integer casBi;
    @SerializedName("cas_mb")
    @Expose
    public Integer casMb;
    @SerializedName("cas_ns")
    @Expose
    public Integer casNs;
    @SerializedName("cas_be")
    @Expose
    public Integer casBe;
    @SerializedName("cas_wo")
    @Expose
    public Integer casWo;
    @SerializedName("cas_mi")
    @Expose
    public Integer casMi;
    @SerializedName("cas_li")
    @Expose
    public Integer casLi;
    @SerializedName("vgs_mm")
    @Expose
    public Integer vgsMm;
    @SerializedName("vgs_ma")
    @Expose
    public Integer vgsMa;
    @SerializedName("vgs_no")
    @Expose
    public Integer vgsNo;
    @SerializedName("vgs_bi")
    @Expose
    public Integer vgsBi;
    @SerializedName("vgs_mb")
    @Expose
    public Integer vgsMb;
    @SerializedName("thp_group")
    @Expose
    public Integer thpGroup;
    @SerializedName("tep_group")
    @Expose
    public Integer tepGroup;
    @SerializedName("tv_group")
    @Expose
    public Integer tvGroup;
    @SerializedName("tpd_group")
    @Expose
    public Integer tpdGroup;
    @SerializedName("pv_group")
    @Expose
    public Integer pvGroup;
    @SerializedName("ft_group")
    @Expose
    public Integer ftGroup;
    @SerializedName("so_group")
    @Expose
    public Integer soGroup;
    @SerializedName("fs_group")
    @Expose
    public Integer fsGroup;
    @SerializedName("le_group")
    @Expose
    public Integer leGroup;
    @SerializedName("sn_group")
    @Expose
    public Integer snGroup;
    @SerializedName("sfs_group")
    @Expose
    public Integer sfsGroup;
    @SerializedName("cl_group")
    @Expose
    public Integer clGroup;
    @SerializedName("ipi_group")
    @Expose
    public Integer ipiGroup;
    @SerializedName("isi_group")
    @Expose
    public Integer isiGroup;
    @SerializedName("ima_group")
    @Expose
    public Integer imaGroup;
    @SerializedName("ocu_group")
    @Expose
    public Integer ocuGroup;
    @SerializedName("cac_group")
    @Expose
    public Integer cacGroup;
    @SerializedName("pmr_group")
    @Expose
    public Integer pmrGroup;
    @SerializedName("ccf_group")
    @Expose
    public Integer ccfGroup;
    @SerializedName("la_group")
    @Expose
    public Integer laGroup;
    @SerializedName("ppo_group")
    @Expose
    public Integer ppoGroup;
    @SerializedName("fc_group")
    @Expose
    public Integer fcGroup;
    @SerializedName("aco_group")
    @Expose
    public Integer acoGroup;
    @SerializedName("ibh_group")
    @Expose
    public Integer ibhGroup;
    @SerializedName("cas_group")
    @Expose
    public Integer casGroup;
    @SerializedName("vgs_group")
    @Expose
    public Integer vgsGroup;

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getEncuestador() {
        return encuestador;
    }

    public void setEncuestador(String encuestador) {
        this.encuestador = encuestador;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Integer getSexoHombre() {
        return sexoHombre;
    }

    public void setSexoHombre(Integer sexoHombre) {
        this.sexoHombre = sexoHombre;
    }

    public Integer getSexoMujer() {
        return sexoMujer;
    }

    public void setSexoMujer(Integer sexoMujer) {
        this.sexoMujer = sexoMujer;
    }

    public Integer getEdad25() {
        return edad25;
    }

    public void setEdad25(Integer edad25) {
        this.edad25 = edad25;
    }

    public Integer getEdad2534() {
        return edad2534;
    }

    public void setEdad2534(Integer edad2534) {
        this.edad2534 = edad2534;
    }

    public Integer getEdad3544() {
        return edad3544;
    }

    public void setEdad3544(Integer edad3544) {
        this.edad3544 = edad3544;
    }

    public Integer getEdad4554() {
        return edad4554;
    }

    public void setEdad4554(Integer edad4554) {
        this.edad4554 = edad4554;
    }

    public Integer getEdad5564() {
        return edad5564;
    }

    public void setEdad5564(Integer edad5564) {
        this.edad5564 = edad5564;
    }

    public Integer getEdad65() {
        return edad65;
    }

    public void setEdad65(Integer edad65) {
        this.edad65 = edad65;
    }

    public Integer getTrabajoTrabajador() {
        return trabajoTrabajador;
    }

    public void setTrabajoTrabajador(Integer trabajoTrabajador) {
        this.trabajoTrabajador = trabajoTrabajador;
    }

    public Integer getTrabajoDesempleado() {
        return trabajoDesempleado;
    }

    public void setTrabajoDesempleado(Integer trabajoDesempleado) {
        this.trabajoDesempleado = trabajoDesempleado;
    }

    public Integer getTrabajoEstudiante() {
        return trabajoEstudiante;
    }

    public void setTrabajoEstudiante(Integer trabajoEstudiante) {
        this.trabajoEstudiante = trabajoEstudiante;
    }

    public Integer getTrabajoJubilado() {
        return trabajoJubilado;
    }

    public void setTrabajoJubilado(Integer trabajoJubilado) {
        this.trabajoJubilado = trabajoJubilado;
    }

    public Integer getCarnetSi() {
        return carnetSi;
    }

    public void setCarnetSi(Integer carnetSi) {
        this.carnetSi = carnetSi;
    }

    public Integer getCarnetNo() {
        return carnetNo;
    }

    public void setCarnetNo(Integer carnetNo) {
        this.carnetNo = carnetNo;
    }

    public Integer getVehiculoSi() {
        return vehiculoSi;
    }

    public void setVehiculoSi(Integer vehiculoSi) {
        this.vehiculoSi = vehiculoSi;
    }

    public Integer getVehiculoNo() {
        return vehiculoNo;
    }

    public void setVehiculoNo(Integer vehiculoNo) {
        this.vehiculoNo = vehiculoNo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public Integer getMotivoInicio() {
        return motivoInicio;
    }

    public void setMotivoInicio(Integer motivoInicio) {
        this.motivoInicio = motivoInicio;
    }

    public Integer getMotivoFin() {
        return motivoFin;
    }

    public void setMotivoFin(Integer motivoFin) {
        this.motivoFin = motivoFin;
    }

    public Integer getViajes5() {
        return viajes5;
    }

    public void setViajes5(Integer viajes5) {
        this.viajes5 = viajes5;
    }

    public Integer getViajes515() {
        return viajes515;
    }

    public void setViajes515(Integer viajes515) {
        this.viajes515 = viajes515;
    }

    public Integer getViajes1530() {
        return viajes1530;
    }

    public void setViajes1530(Integer viajes1530) {
        this.viajes1530 = viajes1530;
    }

    public Integer getViajes30() {
        return viajes30;
    }

    public void setViajes30(Integer viajes30) {
        this.viajes30 = viajes30;
    }

    public Integer getPagoTarjeta() {
        return pagoTarjeta;
    }

    public void setPagoTarjeta(Integer pagoTarjeta) {
        this.pagoTarjeta = pagoTarjeta;
    }

    public Integer getPagoEfectivo() {
        return pagoEfectivo;
    }

    public void setPagoEfectivo(Integer pagoEfectivo) {
        this.pagoEfectivo = pagoEfectivo;
    }

    public Integer getIngreso900() {
        return ingreso900;
    }

    public void setIngreso900(Integer ingreso900) {
        this.ingreso900 = ingreso900;
    }

    public Integer getIngreso9001500() {
        return ingreso9001500;
    }

    public void setIngreso9001500(Integer ingreso9001500) {
        this.ingreso9001500 = ingreso9001500;
    }

    public Integer getIngreso15002500() {
        return ingreso15002500;
    }

    public void setIngreso15002500(Integer ingreso15002500) {
        this.ingreso15002500 = ingreso15002500;
    }

    public Integer getIngreso2500() {
        return ingreso2500;
    }

    public void setIngreso2500(Integer ingreso2500) {
        this.ingreso2500 = ingreso2500;
    }

    public Integer getIngresoNsnc() {
        return ingresoNsnc;
    }

    public void setIngresoNsnc(Integer ingresoNsnc) {
        this.ingresoNsnc = ingresoNsnc;
    }

    public Integer getValoriacionMuymal() {
        return valoriacionMuymal;
    }

    public void setValoriacionMuymal(Integer valoriacionMuymal) {
        this.valoriacionMuymal = valoriacionMuymal;
    }

    public Integer getValoracionMal() {
        return valoracionMal;
    }

    public void setValoracionMal(Integer valoracionMal) {
        this.valoracionMal = valoracionMal;
    }

    public Integer getValoracionNormal() {
        return valoracionNormal;
    }

    public void setValoracionNormal(Integer valoracionNormal) {
        this.valoracionNormal = valoracionNormal;
    }

    public Integer getValoracionBien() {
        return valoracionBien;
    }

    public void setValoracionBien(Integer valoracionBien) {
        this.valoracionBien = valoracionBien;
    }

    public Integer getValoracionMuybien() {
        return valoracionMuybien;
    }

    public void setValoracionMuybien(Integer valoracionMuybien) {
        this.valoracionMuybien = valoracionMuybien;
    }

    public Integer getThpMm() {
        return thpMm;
    }

    public void setThpMm(Integer thpMm) {
        this.thpMm = thpMm;
    }

    public Integer getThpMa() {
        return thpMa;
    }

    public void setThpMa(Integer thpMa) {
        this.thpMa = thpMa;
    }

    public Integer getThpNo() {
        return thpNo;
    }

    public void setThpNo(Integer thpNo) {
        this.thpNo = thpNo;
    }

    public Integer getThpBi() {
        return thpBi;
    }

    public void setThpBi(Integer thpBi) {
        this.thpBi = thpBi;
    }

    public Integer getThpMb() {
        return thpMb;
    }

    public void setThpMb(Integer thpMb) {
        this.thpMb = thpMb;
    }

    public Integer getThpNs() {
        return thpNs;
    }

    public void setThpNs(Integer thpNs) {
        this.thpNs = thpNs;
    }

    public Integer getThpBe() {
        return thpBe;
    }

    public void setThpBe(Integer thpBe) {
        this.thpBe = thpBe;
    }

    public Integer getThpWo() {
        return thpWo;
    }

    public void setThpWo(Integer thpWo) {
        this.thpWo = thpWo;
    }

    public Integer getThpMi() {
        return thpMi;
    }

    public void setThpMi(Integer thpMi) {
        this.thpMi = thpMi;
    }

    public Integer getThpLi() {
        return thpLi;
    }

    public void setThpLi(Integer thpLi) {
        this.thpLi = thpLi;
    }

    public Integer getTepMm() {
        return tepMm;
    }

    public void setTepMm(Integer tepMm) {
        this.tepMm = tepMm;
    }

    public Integer getTepMa() {
        return tepMa;
    }

    public void setTepMa(Integer tepMa) {
        this.tepMa = tepMa;
    }

    public Integer getTepNo() {
        return tepNo;
    }

    public void setTepNo(Integer tepNo) {
        this.tepNo = tepNo;
    }

    public Integer getTepBi() {
        return tepBi;
    }

    public void setTepBi(Integer tepBi) {
        this.tepBi = tepBi;
    }

    public Integer getTepMb() {
        return tepMb;
    }

    public void setTepMb(Integer tepMb) {
        this.tepMb = tepMb;
    }

    public Integer getTepNs() {
        return tepNs;
    }

    public void setTepNs(Integer tepNs) {
        this.tepNs = tepNs;
    }

    public Integer getTepBe() {
        return tepBe;
    }

    public void setTepBe(Integer tepBe) {
        this.tepBe = tepBe;
    }

    public Integer getTepWo() {
        return tepWo;
    }

    public void setTepWo(Integer tepWo) {
        this.tepWo = tepWo;
    }

    public Integer getTepMi() {
        return tepMi;
    }

    public void setTepMi(Integer tepMi) {
        this.tepMi = tepMi;
    }

    public Integer getTepLi() {
        return tepLi;
    }

    public void setTepLi(Integer tepLi) {
        this.tepLi = tepLi;
    }

    public Integer getTvMm() {
        return tvMm;
    }

    public void setTvMm(Integer tvMm) {
        this.tvMm = tvMm;
    }

    public Integer getTvMa() {
        return tvMa;
    }

    public void setTvMa(Integer tvMa) {
        this.tvMa = tvMa;
    }

    public Integer getTvNo() {
        return tvNo;
    }

    public void setTvNo(Integer tvNo) {
        this.tvNo = tvNo;
    }

    public Integer getTvBi() {
        return tvBi;
    }

    public void setTvBi(Integer tvBi) {
        this.tvBi = tvBi;
    }

    public Integer getTvMb() {
        return tvMb;
    }

    public void setTvMb(Integer tvMb) {
        this.tvMb = tvMb;
    }

    public Integer getTvNs() {
        return tvNs;
    }

    public void setTvNs(Integer tvNs) {
        this.tvNs = tvNs;
    }

    public Integer getTvBe() {
        return tvBe;
    }

    public void setTvBe(Integer tvBe) {
        this.tvBe = tvBe;
    }

    public Integer getTvWo() {
        return tvWo;
    }

    public void setTvWo(Integer tvWo) {
        this.tvWo = tvWo;
    }

    public Integer getTvMi() {
        return tvMi;
    }

    public void setTvMi(Integer tvMi) {
        this.tvMi = tvMi;
    }

    public Integer getTvLi() {
        return tvLi;
    }

    public void setTvLi(Integer tvLi) {
        this.tvLi = tvLi;
    }

    public Integer getTpdMm() {
        return tpdMm;
    }

    public void setTpdMm(Integer tpdMm) {
        this.tpdMm = tpdMm;
    }

    public Integer getTpdMa() {
        return tpdMa;
    }

    public void setTpdMa(Integer tpdMa) {
        this.tpdMa = tpdMa;
    }

    public Integer getTpdNo() {
        return tpdNo;
    }

    public void setTpdNo(Integer tpdNo) {
        this.tpdNo = tpdNo;
    }

    public Integer getTpdBi() {
        return tpdBi;
    }

    public void setTpdBi(Integer tpdBi) {
        this.tpdBi = tpdBi;
    }

    public Integer getTpdMb() {
        return tpdMb;
    }

    public void setTpdMb(Integer tpdMb) {
        this.tpdMb = tpdMb;
    }

    public Integer getTpdNs() {
        return tpdNs;
    }

    public void setTpdNs(Integer tpdNs) {
        this.tpdNs = tpdNs;
    }

    public Integer getTpdBe() {
        return tpdBe;
    }

    public void setTpdBe(Integer tpdBe) {
        this.tpdBe = tpdBe;
    }

    public Integer getTpdWo() {
        return tpdWo;
    }

    public void setTpdWo(Integer tpdWo) {
        this.tpdWo = tpdWo;
    }

    public Integer getTpdMi() {
        return tpdMi;
    }

    public void setTpdMi(Integer tpdMi) {
        this.tpdMi = tpdMi;
    }

    public Integer getTpdLi() {
        return tpdLi;
    }

    public void setTpdLi(Integer tpdLi) {
        this.tpdLi = tpdLi;
    }

    public Integer getPvMm() {
        return pvMm;
    }

    public void setPvMm(Integer pvMm) {
        this.pvMm = pvMm;
    }

    public Integer getPvMa() {
        return pvMa;
    }

    public void setPvMa(Integer pvMa) {
        this.pvMa = pvMa;
    }

    public Integer getPvNo() {
        return pvNo;
    }

    public void setPvNo(Integer pvNo) {
        this.pvNo = pvNo;
    }

    public Integer getPvBi() {
        return pvBi;
    }

    public void setPvBi(Integer pvBi) {
        this.pvBi = pvBi;
    }

    public Integer getPvMb() {
        return pvMb;
    }

    public void setPvMb(Integer pvMb) {
        this.pvMb = pvMb;
    }

    public Integer getPvNs() {
        return pvNs;
    }

    public void setPvNs(Integer pvNs) {
        this.pvNs = pvNs;
    }

    public Integer getPvBe() {
        return pvBe;
    }

    public void setPvBe(Integer pvBe) {
        this.pvBe = pvBe;
    }

    public Integer getPvWo() {
        return pvWo;
    }

    public void setPvWo(Integer pvWo) {
        this.pvWo = pvWo;
    }

    public Integer getPvMi() {
        return pvMi;
    }

    public void setPvMi(Integer pvMi) {
        this.pvMi = pvMi;
    }

    public Integer getPvLi() {
        return pvLi;
    }

    public void setPvLi(Integer pvLi) {
        this.pvLi = pvLi;
    }

    public Integer getFtMm() {
        return ftMm;
    }

    public void setFtMm(Integer ftMm) {
        this.ftMm = ftMm;
    }

    public Integer getFtMa() {
        return ftMa;
    }

    public void setFtMa(Integer ftMa) {
        this.ftMa = ftMa;
    }

    public Integer getFtNo() {
        return ftNo;
    }

    public void setFtNo(Integer ftNo) {
        this.ftNo = ftNo;
    }

    public Integer getFtBi() {
        return ftBi;
    }

    public void setFtBi(Integer ftBi) {
        this.ftBi = ftBi;
    }

    public Integer getFtMb() {
        return ftMb;
    }

    public void setFtMb(Integer ftMb) {
        this.ftMb = ftMb;
    }

    public Integer getFtNs() {
        return ftNs;
    }

    public void setFtNs(Integer ftNs) {
        this.ftNs = ftNs;
    }

    public Integer getFtBe() {
        return ftBe;
    }

    public void setFtBe(Integer ftBe) {
        this.ftBe = ftBe;
    }

    public Integer getFtWo() {
        return ftWo;
    }

    public void setFtWo(Integer ftWo) {
        this.ftWo = ftWo;
    }

    public Integer getFtMi() {
        return ftMi;
    }

    public void setFtMi(Integer ftMi) {
        this.ftMi = ftMi;
    }

    public Integer getFtLi() {
        return ftLi;
    }

    public void setFtLi(Integer ftLi) {
        this.ftLi = ftLi;
    }

    public Integer getSoMm() {
        return soMm;
    }

    public void setSoMm(Integer soMm) {
        this.soMm = soMm;
    }

    public Integer getSoMa() {
        return soMa;
    }

    public void setSoMa(Integer soMa) {
        this.soMa = soMa;
    }

    public Integer getSoNo() {
        return soNo;
    }

    public void setSoNo(Integer soNo) {
        this.soNo = soNo;
    }

    public Integer getSoBi() {
        return soBi;
    }

    public void setSoBi(Integer soBi) {
        this.soBi = soBi;
    }

    public Integer getSoMb() {
        return soMb;
    }

    public void setSoMb(Integer soMb) {
        this.soMb = soMb;
    }

    public Integer getSoNs() {
        return soNs;
    }

    public void setSoNs(Integer soNs) {
        this.soNs = soNs;
    }

    public Integer getSoBe() {
        return soBe;
    }

    public void setSoBe(Integer soBe) {
        this.soBe = soBe;
    }

    public Integer getSoWo() {
        return soWo;
    }

    public void setSoWo(Integer soWo) {
        this.soWo = soWo;
    }

    public Integer getSoMi() {
        return soMi;
    }

    public void setSoMi(Integer soMi) {
        this.soMi = soMi;
    }

    public Integer getSoLi() {
        return soLi;
    }

    public void setSoLi(Integer soLi) {
        this.soLi = soLi;
    }

    public Integer getFsMm() {
        return fsMm;
    }

    public void setFsMm(Integer fsMm) {
        this.fsMm = fsMm;
    }

    public Integer getFsMa() {
        return fsMa;
    }

    public void setFsMa(Integer fsMa) {
        this.fsMa = fsMa;
    }

    public Integer getFsNo() {
        return fsNo;
    }

    public void setFsNo(Integer fsNo) {
        this.fsNo = fsNo;
    }

    public Integer getFsBi() {
        return fsBi;
    }

    public void setFsBi(Integer fsBi) {
        this.fsBi = fsBi;
    }

    public Integer getFsMb() {
        return fsMb;
    }

    public void setFsMb(Integer fsMb) {
        this.fsMb = fsMb;
    }

    public Integer getFsNs() {
        return fsNs;
    }

    public void setFsNs(Integer fsNs) {
        this.fsNs = fsNs;
    }

    public Integer getFsBe() {
        return fsBe;
    }

    public void setFsBe(Integer fsBe) {
        this.fsBe = fsBe;
    }

    public Integer getFsWo() {
        return fsWo;
    }

    public void setFsWo(Integer fsWo) {
        this.fsWo = fsWo;
    }

    public Integer getFsMi() {
        return fsMi;
    }

    public void setFsMi(Integer fsMi) {
        this.fsMi = fsMi;
    }

    public Integer getFsLi() {
        return fsLi;
    }

    public void setFsLi(Integer fsLi) {
        this.fsLi = fsLi;
    }

    public Integer getLeMm() {
        return leMm;
    }

    public void setLeMm(Integer leMm) {
        this.leMm = leMm;
    }

    public Integer getLeMa() {
        return leMa;
    }

    public void setLeMa(Integer leMa) {
        this.leMa = leMa;
    }

    public Integer getLeNo() {
        return leNo;
    }

    public void setLeNo(Integer leNo) {
        this.leNo = leNo;
    }

    public Integer getLeBi() {
        return leBi;
    }

    public void setLeBi(Integer leBi) {
        this.leBi = leBi;
    }

    public Integer getLeMb() {
        return leMb;
    }

    public void setLeMb(Integer leMb) {
        this.leMb = leMb;
    }

    public Integer getLeNs() {
        return leNs;
    }

    public void setLeNs(Integer leNs) {
        this.leNs = leNs;
    }

    public Integer getLeBe() {
        return leBe;
    }

    public void setLeBe(Integer leBe) {
        this.leBe = leBe;
    }

    public Integer getLeWo() {
        return leWo;
    }

    public void setLeWo(Integer leWo) {
        this.leWo = leWo;
    }

    public Integer getLeMi() {
        return leMi;
    }

    public void setLeMi(Integer leMi) {
        this.leMi = leMi;
    }

    public Integer getLeLi() {
        return leLi;
    }

    public void setLeLi(Integer leLi) {
        this.leLi = leLi;
    }

    public Integer getSnMm() {
        return snMm;
    }

    public void setSnMm(Integer snMm) {
        this.snMm = snMm;
    }

    public Integer getSnMa() {
        return snMa;
    }

    public void setSnMa(Integer snMa) {
        this.snMa = snMa;
    }

    public Integer getSnNo() {
        return snNo;
    }

    public void setSnNo(Integer snNo) {
        this.snNo = snNo;
    }

    public Integer getSnBi() {
        return snBi;
    }

    public void setSnBi(Integer snBi) {
        this.snBi = snBi;
    }

    public Integer getSnMb() {
        return snMb;
    }

    public void setSnMb(Integer snMb) {
        this.snMb = snMb;
    }

    public Integer getSnNs() {
        return snNs;
    }

    public void setSnNs(Integer snNs) {
        this.snNs = snNs;
    }

    public Integer getSnBe() {
        return snBe;
    }

    public void setSnBe(Integer snBe) {
        this.snBe = snBe;
    }

    public Integer getSnWo() {
        return snWo;
    }

    public void setSnWo(Integer snWo) {
        this.snWo = snWo;
    }

    public Integer getSnMi() {
        return snMi;
    }

    public void setSnMi(Integer snMi) {
        this.snMi = snMi;
    }

    public Integer getSnLi() {
        return snLi;
    }

    public void setSnLi(Integer snLi) {
        this.snLi = snLi;
    }

    public Integer getSfsMm() {
        return sfsMm;
    }

    public void setSfsMm(Integer sfsMm) {
        this.sfsMm = sfsMm;
    }

    public Integer getSfsMa() {
        return sfsMa;
    }

    public void setSfsMa(Integer sfsMa) {
        this.sfsMa = sfsMa;
    }

    public Integer getSfsNo() {
        return sfsNo;
    }

    public void setSfsNo(Integer sfsNo) {
        this.sfsNo = sfsNo;
    }

    public Integer getSfsBi() {
        return sfsBi;
    }

    public void setSfsBi(Integer sfsBi) {
        this.sfsBi = sfsBi;
    }

    public Integer getSfsMb() {
        return sfsMb;
    }

    public void setSfsMb(Integer sfsMb) {
        this.sfsMb = sfsMb;
    }

    public Integer getSfsNs() {
        return sfsNs;
    }

    public void setSfsNs(Integer sfsNs) {
        this.sfsNs = sfsNs;
    }

    public Integer getSfsBe() {
        return sfsBe;
    }

    public void setSfsBe(Integer sfsBe) {
        this.sfsBe = sfsBe;
    }

    public Integer getSfsWo() {
        return sfsWo;
    }

    public void setSfsWo(Integer sfsWo) {
        this.sfsWo = sfsWo;
    }

    public Integer getSfsMi() {
        return sfsMi;
    }

    public void setSfsMi(Integer sfsMi) {
        this.sfsMi = sfsMi;
    }

    public Integer getSfsLi() {
        return sfsLi;
    }

    public void setSfsLi(Integer sfsLi) {
        this.sfsLi = sfsLi;
    }

    public Integer getClMm() {
        return clMm;
    }

    public void setClMm(Integer clMm) {
        this.clMm = clMm;
    }

    public Integer getClMa() {
        return clMa;
    }

    public void setClMa(Integer clMa) {
        this.clMa = clMa;
    }

    public Integer getClNo() {
        return clNo;
    }

    public void setClNo(Integer clNo) {
        this.clNo = clNo;
    }

    public Integer getClBi() {
        return clBi;
    }

    public void setClBi(Integer clBi) {
        this.clBi = clBi;
    }

    public Integer getClMb() {
        return clMb;
    }

    public void setClMb(Integer clMb) {
        this.clMb = clMb;
    }

    public Integer getClNs() {
        return clNs;
    }

    public void setClNs(Integer clNs) {
        this.clNs = clNs;
    }

    public Integer getClBe() {
        return clBe;
    }

    public void setClBe(Integer clBe) {
        this.clBe = clBe;
    }

    public Integer getClWo() {
        return clWo;
    }

    public void setClWo(Integer clWo) {
        this.clWo = clWo;
    }

    public Integer getClMi() {
        return clMi;
    }

    public void setClMi(Integer clMi) {
        this.clMi = clMi;
    }

    public Integer getClLi() {
        return clLi;
    }

    public void setClLi(Integer clLi) {
        this.clLi = clLi;
    }

    public Integer getIpiMm() {
        return ipiMm;
    }

    public void setIpiMm(Integer ipiMm) {
        this.ipiMm = ipiMm;
    }

    public Integer getIpiMa() {
        return ipiMa;
    }

    public void setIpiMa(Integer ipiMa) {
        this.ipiMa = ipiMa;
    }

    public Integer getIpiNo() {
        return ipiNo;
    }

    public void setIpiNo(Integer ipiNo) {
        this.ipiNo = ipiNo;
    }

    public Integer getIpiBi() {
        return ipiBi;
    }

    public void setIpiBi(Integer ipiBi) {
        this.ipiBi = ipiBi;
    }

    public Integer getIpiMb() {
        return ipiMb;
    }

    public void setIpiMb(Integer ipiMb) {
        this.ipiMb = ipiMb;
    }

    public Integer getIpiNs() {
        return ipiNs;
    }

    public void setIpiNs(Integer ipiNs) {
        this.ipiNs = ipiNs;
    }

    public Integer getIpiBe() {
        return ipiBe;
    }

    public void setIpiBe(Integer ipiBe) {
        this.ipiBe = ipiBe;
    }

    public Integer getIpiWo() {
        return ipiWo;
    }

    public void setIpiWo(Integer ipiWo) {
        this.ipiWo = ipiWo;
    }

    public Integer getIpiMi() {
        return ipiMi;
    }

    public void setIpiMi(Integer ipiMi) {
        this.ipiMi = ipiMi;
    }

    public Integer getIpiLi() {
        return ipiLi;
    }

    public void setIpiLi(Integer ipiLi) {
        this.ipiLi = ipiLi;
    }

    public Integer getIsiMm() {
        return isiMm;
    }

    public void setIsiMm(Integer isiMm) {
        this.isiMm = isiMm;
    }

    public Integer getIsiMa() {
        return isiMa;
    }

    public void setIsiMa(Integer isiMa) {
        this.isiMa = isiMa;
    }

    public Integer getIsiNo() {
        return isiNo;
    }

    public void setIsiNo(Integer isiNo) {
        this.isiNo = isiNo;
    }

    public Integer getIsiBi() {
        return isiBi;
    }

    public void setIsiBi(Integer isiBi) {
        this.isiBi = isiBi;
    }

    public Integer getIsiMb() {
        return isiMb;
    }

    public void setIsiMb(Integer isiMb) {
        this.isiMb = isiMb;
    }

    public Integer getIsiNs() {
        return isiNs;
    }

    public void setIsiNs(Integer isiNs) {
        this.isiNs = isiNs;
    }

    public Integer getIsiBe() {
        return isiBe;
    }

    public void setIsiBe(Integer isiBe) {
        this.isiBe = isiBe;
    }

    public Integer getIsiWo() {
        return isiWo;
    }

    public void setIsiWo(Integer isiWo) {
        this.isiWo = isiWo;
    }

    public Integer getIsiMi() {
        return isiMi;
    }

    public void setIsiMi(Integer isiMi) {
        this.isiMi = isiMi;
    }

    public Integer getIsiLi() {
        return isiLi;
    }

    public void setIsiLi(Integer isiLi) {
        this.isiLi = isiLi;
    }

    public Integer getImaMm() {
        return imaMm;
    }

    public void setImaMm(Integer imaMm) {
        this.imaMm = imaMm;
    }

    public Integer getImaMa() {
        return imaMa;
    }

    public void setImaMa(Integer imaMa) {
        this.imaMa = imaMa;
    }

    public Integer getImaNo() {
        return imaNo;
    }

    public void setImaNo(Integer imaNo) {
        this.imaNo = imaNo;
    }

    public Integer getImaBi() {
        return imaBi;
    }

    public void setImaBi(Integer imaBi) {
        this.imaBi = imaBi;
    }

    public Integer getImaMb() {
        return imaMb;
    }

    public void setImaMb(Integer imaMb) {
        this.imaMb = imaMb;
    }

    public Integer getImaNs() {
        return imaNs;
    }

    public void setImaNs(Integer imaNs) {
        this.imaNs = imaNs;
    }

    public Integer getImaBe() {
        return imaBe;
    }

    public void setImaBe(Integer imaBe) {
        this.imaBe = imaBe;
    }

    public Integer getImaWo() {
        return imaWo;
    }

    public void setImaWo(Integer imaWo) {
        this.imaWo = imaWo;
    }

    public Integer getImaMi() {
        return imaMi;
    }

    public void setImaMi(Integer imaMi) {
        this.imaMi = imaMi;
    }

    public Integer getImaLi() {
        return imaLi;
    }

    public void setImaLi(Integer imaLi) {
        this.imaLi = imaLi;
    }

    public Integer getOcuMm() {
        return ocuMm;
    }

    public void setOcuMm(Integer ocuMm) {
        this.ocuMm = ocuMm;
    }

    public Integer getOcuMa() {
        return ocuMa;
    }

    public void setOcuMa(Integer ocuMa) {
        this.ocuMa = ocuMa;
    }

    public Integer getOcuNo() {
        return ocuNo;
    }

    public void setOcuNo(Integer ocuNo) {
        this.ocuNo = ocuNo;
    }

    public Integer getOcuBi() {
        return ocuBi;
    }

    public void setOcuBi(Integer ocuBi) {
        this.ocuBi = ocuBi;
    }

    public Integer getOcuMb() {
        return ocuMb;
    }

    public void setOcuMb(Integer ocuMb) {
        this.ocuMb = ocuMb;
    }

    public Integer getOcuNs() {
        return ocuNs;
    }

    public void setOcuNs(Integer ocuNs) {
        this.ocuNs = ocuNs;
    }

    public Integer getOcuBe() {
        return ocuBe;
    }

    public void setOcuBe(Integer ocuBe) {
        this.ocuBe = ocuBe;
    }

    public Integer getOcuWo() {
        return ocuWo;
    }

    public void setOcuWo(Integer ocuWo) {
        this.ocuWo = ocuWo;
    }

    public Integer getOcuMi() {
        return ocuMi;
    }

    public void setOcuMi(Integer ocuMi) {
        this.ocuMi = ocuMi;
    }

    public Integer getOcuLi() {
        return ocuLi;
    }

    public void setOcuLi(Integer ocuLi) {
        this.ocuLi = ocuLi;
    }

    public Integer getCacMm() {
        return cacMm;
    }

    public void setCacMm(Integer cacMm) {
        this.cacMm = cacMm;
    }

    public Integer getCacMa() {
        return cacMa;
    }

    public void setCacMa(Integer cacMa) {
        this.cacMa = cacMa;
    }

    public Integer getCacNo() {
        return cacNo;
    }

    public void setCacNo(Integer cacNo) {
        this.cacNo = cacNo;
    }

    public Integer getCacBi() {
        return cacBi;
    }

    public void setCacBi(Integer cacBi) {
        this.cacBi = cacBi;
    }

    public Integer getCacMb() {
        return cacMb;
    }

    public void setCacMb(Integer cacMb) {
        this.cacMb = cacMb;
    }

    public Integer getCacNs() {
        return cacNs;
    }

    public void setCacNs(Integer cacNs) {
        this.cacNs = cacNs;
    }

    public Integer getCacBe() {
        return cacBe;
    }

    public void setCacBe(Integer cacBe) {
        this.cacBe = cacBe;
    }

    public Integer getCacWo() {
        return cacWo;
    }

    public void setCacWo(Integer cacWo) {
        this.cacWo = cacWo;
    }

    public Integer getCacMi() {
        return cacMi;
    }

    public void setCacMi(Integer cacMi) {
        this.cacMi = cacMi;
    }

    public Integer getCacLi() {
        return cacLi;
    }

    public void setCacLi(Integer cacLi) {
        this.cacLi = cacLi;
    }

    public Integer getPmrMm() {
        return pmrMm;
    }

    public void setPmrMm(Integer pmrMm) {
        this.pmrMm = pmrMm;
    }

    public Integer getPmrMa() {
        return pmrMa;
    }

    public void setPmrMa(Integer pmrMa) {
        this.pmrMa = pmrMa;
    }

    public Integer getPmrNo() {
        return pmrNo;
    }

    public void setPmrNo(Integer pmrNo) {
        this.pmrNo = pmrNo;
    }

    public Integer getPmrBi() {
        return pmrBi;
    }

    public void setPmrBi(Integer pmrBi) {
        this.pmrBi = pmrBi;
    }

    public Integer getPmrMb() {
        return pmrMb;
    }

    public void setPmrMb(Integer pmrMb) {
        this.pmrMb = pmrMb;
    }

    public Integer getPmrNs() {
        return pmrNs;
    }

    public void setPmrNs(Integer pmrNs) {
        this.pmrNs = pmrNs;
    }

    public Integer getPmrBe() {
        return pmrBe;
    }

    public void setPmrBe(Integer pmrBe) {
        this.pmrBe = pmrBe;
    }

    public Integer getPmrWo() {
        return pmrWo;
    }

    public void setPmrWo(Integer pmrWo) {
        this.pmrWo = pmrWo;
    }

    public Integer getPmrMi() {
        return pmrMi;
    }

    public void setPmrMi(Integer pmrMi) {
        this.pmrMi = pmrMi;
    }

    public Integer getPmrLi() {
        return pmrLi;
    }

    public void setPmrLi(Integer pmrLi) {
        this.pmrLi = pmrLi;
    }

    public Integer getCcfMm() {
        return ccfMm;
    }

    public void setCcfMm(Integer ccfMm) {
        this.ccfMm = ccfMm;
    }

    public Integer getCcfMa() {
        return ccfMa;
    }

    public void setCcfMa(Integer ccfMa) {
        this.ccfMa = ccfMa;
    }

    public Integer getCcfNo() {
        return ccfNo;
    }

    public void setCcfNo(Integer ccfNo) {
        this.ccfNo = ccfNo;
    }

    public Integer getCcfBi() {
        return ccfBi;
    }

    public void setCcfBi(Integer ccfBi) {
        this.ccfBi = ccfBi;
    }

    public Integer getCcfMb() {
        return ccfMb;
    }

    public void setCcfMb(Integer ccfMb) {
        this.ccfMb = ccfMb;
    }

    public Integer getCcfNs() {
        return ccfNs;
    }

    public void setCcfNs(Integer ccfNs) {
        this.ccfNs = ccfNs;
    }

    public Integer getCcfBe() {
        return ccfBe;
    }

    public void setCcfBe(Integer ccfBe) {
        this.ccfBe = ccfBe;
    }

    public Integer getCcfWo() {
        return ccfWo;
    }

    public void setCcfWo(Integer ccfWo) {
        this.ccfWo = ccfWo;
    }

    public Integer getCcfMi() {
        return ccfMi;
    }

    public void setCcfMi(Integer ccfMi) {
        this.ccfMi = ccfMi;
    }

    public Integer getCcfLi() {
        return ccfLi;
    }

    public void setCcfLi(Integer ccfLi) {
        this.ccfLi = ccfLi;
    }

    public Integer getLaMm() {
        return laMm;
    }

    public void setLaMm(Integer laMm) {
        this.laMm = laMm;
    }

    public Integer getLaMa() {
        return laMa;
    }

    public void setLaMa(Integer laMa) {
        this.laMa = laMa;
    }

    public Integer getLaNo() {
        return laNo;
    }

    public void setLaNo(Integer laNo) {
        this.laNo = laNo;
    }

    public Integer getLaBi() {
        return laBi;
    }

    public void setLaBi(Integer laBi) {
        this.laBi = laBi;
    }

    public Integer getLaMb() {
        return laMb;
    }

    public void setLaMb(Integer laMb) {
        this.laMb = laMb;
    }

    public Integer getLaNs() {
        return laNs;
    }

    public void setLaNs(Integer laNs) {
        this.laNs = laNs;
    }

    public Integer getLaBe() {
        return laBe;
    }

    public void setLaBe(Integer laBe) {
        this.laBe = laBe;
    }

    public Integer getLaWo() {
        return laWo;
    }

    public void setLaWo(Integer laWo) {
        this.laWo = laWo;
    }

    public Integer getLaMi() {
        return laMi;
    }

    public void setLaMi(Integer laMi) {
        this.laMi = laMi;
    }

    public Integer getLaLi() {
        return laLi;
    }

    public void setLaLi(Integer laLi) {
        this.laLi = laLi;
    }

    public Integer getPpoMm() {
        return ppoMm;
    }

    public void setPpoMm(Integer ppoMm) {
        this.ppoMm = ppoMm;
    }

    public Integer getPpoMa() {
        return ppoMa;
    }

    public void setPpoMa(Integer ppoMa) {
        this.ppoMa = ppoMa;
    }

    public Integer getPpoNo() {
        return ppoNo;
    }

    public void setPpoNo(Integer ppoNo) {
        this.ppoNo = ppoNo;
    }

    public Integer getPpoBi() {
        return ppoBi;
    }

    public void setPpoBi(Integer ppoBi) {
        this.ppoBi = ppoBi;
    }

    public Integer getPpoMb() {
        return ppoMb;
    }

    public void setPpoMb(Integer ppoMb) {
        this.ppoMb = ppoMb;
    }

    public Integer getPpoNs() {
        return ppoNs;
    }

    public void setPpoNs(Integer ppoNs) {
        this.ppoNs = ppoNs;
    }

    public Integer getPpoBe() {
        return ppoBe;
    }

    public void setPpoBe(Integer ppoBe) {
        this.ppoBe = ppoBe;
    }

    public Integer getPpoWo() {
        return ppoWo;
    }

    public void setPpoWo(Integer ppoWo) {
        this.ppoWo = ppoWo;
    }

    public Integer getPpoMi() {
        return ppoMi;
    }

    public void setPpoMi(Integer ppoMi) {
        this.ppoMi = ppoMi;
    }

    public Integer getPpoLi() {
        return ppoLi;
    }

    public void setPpoLi(Integer ppoLi) {
        this.ppoLi = ppoLi;
    }

    public Integer getFcMm() {
        return fcMm;
    }

    public void setFcMm(Integer fcMm) {
        this.fcMm = fcMm;
    }

    public Integer getFcMa() {
        return fcMa;
    }

    public void setFcMa(Integer fcMa) {
        this.fcMa = fcMa;
    }

    public Integer getFcNo() {
        return fcNo;
    }

    public void setFcNo(Integer fcNo) {
        this.fcNo = fcNo;
    }

    public Integer getFcBi() {
        return fcBi;
    }

    public void setFcBi(Integer fcBi) {
        this.fcBi = fcBi;
    }

    public Integer getFcMb() {
        return fcMb;
    }

    public void setFcMb(Integer fcMb) {
        this.fcMb = fcMb;
    }

    public Integer getFcNs() {
        return fcNs;
    }

    public void setFcNs(Integer fcNs) {
        this.fcNs = fcNs;
    }

    public Integer getFcBe() {
        return fcBe;
    }

    public void setFcBe(Integer fcBe) {
        this.fcBe = fcBe;
    }

    public Integer getFcWo() {
        return fcWo;
    }

    public void setFcWo(Integer fcWo) {
        this.fcWo = fcWo;
    }

    public Integer getFcMi() {
        return fcMi;
    }

    public void setFcMi(Integer fcMi) {
        this.fcMi = fcMi;
    }

    public Integer getFcLi() {
        return fcLi;
    }

    public void setFcLi(Integer fcLi) {
        this.fcLi = fcLi;
    }

    public Integer getAcoMm() {
        return acoMm;
    }

    public void setAcoMm(Integer acoMm) {
        this.acoMm = acoMm;
    }

    public Integer getAcoMa() {
        return acoMa;
    }

    public void setAcoMa(Integer acoMa) {
        this.acoMa = acoMa;
    }

    public Integer getAcoNo() {
        return acoNo;
    }

    public void setAcoNo(Integer acoNo) {
        this.acoNo = acoNo;
    }

    public Integer getAcoBi() {
        return acoBi;
    }

    public void setAcoBi(Integer acoBi) {
        this.acoBi = acoBi;
    }

    public Integer getAcoMb() {
        return acoMb;
    }

    public void setAcoMb(Integer acoMb) {
        this.acoMb = acoMb;
    }

    public Integer getAcoNs() {
        return acoNs;
    }

    public void setAcoNs(Integer acoNs) {
        this.acoNs = acoNs;
    }

    public Integer getAcoBe() {
        return acoBe;
    }

    public void setAcoBe(Integer acoBe) {
        this.acoBe = acoBe;
    }

    public Integer getAcoWo() {
        return acoWo;
    }

    public void setAcoWo(Integer acoWo) {
        this.acoWo = acoWo;
    }

    public Integer getAcoMi() {
        return acoMi;
    }

    public void setAcoMi(Integer acoMi) {
        this.acoMi = acoMi;
    }

    public Integer getAcoLi() {
        return acoLi;
    }

    public void setAcoLi(Integer acoLi) {
        this.acoLi = acoLi;
    }

    public Integer getIbhMm() {
        return ibhMm;
    }

    public void setIbhMm(Integer ibhMm) {
        this.ibhMm = ibhMm;
    }

    public Integer getIbhMa() {
        return ibhMa;
    }

    public void setIbhMa(Integer ibhMa) {
        this.ibhMa = ibhMa;
    }

    public Integer getIbhNo() {
        return ibhNo;
    }

    public void setIbhNo(Integer ibhNo) {
        this.ibhNo = ibhNo;
    }

    public Integer getIbhBi() {
        return ibhBi;
    }

    public void setIbhBi(Integer ibhBi) {
        this.ibhBi = ibhBi;
    }

    public Integer getIbhMb() {
        return ibhMb;
    }

    public void setIbhMb(Integer ibhMb) {
        this.ibhMb = ibhMb;
    }

    public Integer getIbhNs() {
        return ibhNs;
    }

    public void setIbhNs(Integer ibhNs) {
        this.ibhNs = ibhNs;
    }

    public Integer getIbhBe() {
        return ibhBe;
    }

    public void setIbhBe(Integer ibhBe) {
        this.ibhBe = ibhBe;
    }

    public Integer getIbhWo() {
        return ibhWo;
    }

    public void setIbhWo(Integer ibhWo) {
        this.ibhWo = ibhWo;
    }

    public Integer getIbhMi() {
        return ibhMi;
    }

    public void setIbhMi(Integer ibhMi) {
        this.ibhMi = ibhMi;
    }

    public Integer getIbhLi() {
        return ibhLi;
    }

    public void setIbhLi(Integer ibhLi) {
        this.ibhLi = ibhLi;
    }

    public Integer getCasMm() {
        return casMm;
    }

    public void setCasMm(Integer casMm) {
        this.casMm = casMm;
    }

    public Integer getCasMa() {
        return casMa;
    }

    public void setCasMa(Integer casMa) {
        this.casMa = casMa;
    }

    public Integer getCasNo() {
        return casNo;
    }

    public void setCasNo(Integer casNo) {
        this.casNo = casNo;
    }

    public Integer getCasBi() {
        return casBi;
    }

    public void setCasBi(Integer casBi) {
        this.casBi = casBi;
    }

    public Integer getCasMb() {
        return casMb;
    }

    public void setCasMb(Integer casMb) {
        this.casMb = casMb;
    }

    public Integer getCasNs() {
        return casNs;
    }

    public void setCasNs(Integer casNs) {
        this.casNs = casNs;
    }

    public Integer getCasBe() {
        return casBe;
    }

    public void setCasBe(Integer casBe) {
        this.casBe = casBe;
    }

    public Integer getCasWo() {
        return casWo;
    }

    public void setCasWo(Integer casWo) {
        this.casWo = casWo;
    }

    public Integer getCasMi() {
        return casMi;
    }

    public void setCasMi(Integer casMi) {
        this.casMi = casMi;
    }

    public Integer getCasLi() {
        return casLi;
    }

    public void setCasLi(Integer casLi) {
        this.casLi = casLi;
    }

    public Integer getVgsMm() {
        return vgsMm;
    }

    public void setVgsMm(Integer vgsMm) {
        this.vgsMm = vgsMm;
    }

    public Integer getVgsMa() {
        return vgsMa;
    }

    public void setVgsMa(Integer vgsMa) {
        this.vgsMa = vgsMa;
    }

    public Integer getVgsNo() {
        return vgsNo;
    }

    public void setVgsNo(Integer vgsNo) {
        this.vgsNo = vgsNo;
    }

    public Integer getVgsBi() {
        return vgsBi;
    }

    public void setVgsBi(Integer vgsBi) {
        this.vgsBi = vgsBi;
    }

    public Integer getVgsMb() {
        return vgsMb;
    }

    public void setVgsMb(Integer vgsMb) {
        this.vgsMb = vgsMb;
    }

    public Integer getThpGroup() {
        return thpGroup;
    }

    public void setThpGroup(Integer thpGroup) {
        this.thpGroup = thpGroup;
    }

    public Integer getTepGroup() {
        return tepGroup;
    }

    public void setTepGroup(Integer tepGroup) {
        this.tepGroup = tepGroup;
    }

    public Integer getTvGroup() {
        return tvGroup;
    }

    public void setTvGroup(Integer tvGroup) {
        this.tvGroup = tvGroup;
    }

    public Integer getTpdGroup() {
        return tpdGroup;
    }

    public void setTpdGroup(Integer tpdGroup) {
        this.tpdGroup = tpdGroup;
    }

    public Integer getPvGroup() {
        return pvGroup;
    }

    public void setPvGroup(Integer pvGroup) {
        this.pvGroup = pvGroup;
    }

    public Integer getFtGroup() {
        return ftGroup;
    }

    public void setFtGroup(Integer ftGroup) {
        this.ftGroup = ftGroup;
    }

    public Integer getSoGroup() {
        return soGroup;
    }

    public void setSoGroup(Integer soGroup) {
        this.soGroup = soGroup;
    }

    public Integer getFsGroup() {
        return fsGroup;
    }

    public void setFsGroup(Integer fsGroup) {
        this.fsGroup = fsGroup;
    }

    public Integer getLeGroup() {
        return leGroup;
    }

    public void setLeGroup(Integer leGroup) {
        this.leGroup = leGroup;
    }

    public Integer getSnGroup() {
        return snGroup;
    }

    public void setSnGroup(Integer snGroup) {
        this.snGroup = snGroup;
    }

    public Integer getSfsGroup() {
        return sfsGroup;
    }

    public void setSfsGroup(Integer sfsGroup) {
        this.sfsGroup = sfsGroup;
    }

    public Integer getClGroup() {
        return clGroup;
    }

    public void setClGroup(Integer clGroup) {
        this.clGroup = clGroup;
    }

    public Integer getIpiGroup() {
        return ipiGroup;
    }

    public void setIpiGroup(Integer ipiGroup) {
        this.ipiGroup = ipiGroup;
    }

    public Integer getIsiGroup() {
        return isiGroup;
    }

    public void setIsiGroup(Integer isiGroup) {
        this.isiGroup = isiGroup;
    }

    public Integer getImaGroup() {
        return imaGroup;
    }

    public void setImaGroup(Integer imaGroup) {
        this.imaGroup = imaGroup;
    }

    public Integer getOcuGroup() {
        return ocuGroup;
    }

    public void setOcuGroup(Integer ocuGroup) {
        this.ocuGroup = ocuGroup;
    }

    public Integer getCacGroup() {
        return cacGroup;
    }

    public void setCacGroup(Integer cacGroup) {
        this.cacGroup = cacGroup;
    }

    public Integer getPmrGroup() {
        return pmrGroup;
    }

    public void setPmrGroup(Integer pmrGroup) {
        this.pmrGroup = pmrGroup;
    }

    public Integer getCcfGroup() {
        return ccfGroup;
    }

    public void setCcfGroup(Integer ccfGroup) {
        this.ccfGroup = ccfGroup;
    }

    public Integer getLaGroup() {
        return laGroup;
    }

    public void setLaGroup(Integer laGroup) {
        this.laGroup = laGroup;
    }

    public Integer getPpoGroup() {
        return ppoGroup;
    }

    public void setPpoGroup(Integer ppoGroup) {
        this.ppoGroup = ppoGroup;
    }

    public Integer getFcGroup() {
        return fcGroup;
    }

    public void setFcGroup(Integer fcGroup) {
        this.fcGroup = fcGroup;
    }

    public Integer getAcoGroup() {
        return acoGroup;
    }

    public void setAcoGroup(Integer acoGroup) {
        this.acoGroup = acoGroup;
    }

    public Integer getIbhGroup() {
        return ibhGroup;
    }

    public void setIbhGroup(Integer ibhGroup) {
        this.ibhGroup = ibhGroup;
    }

    public Integer getCasGroup() {
        return casGroup;
    }

    public void setCasGroup(Integer casGroup) {
        this.casGroup = casGroup;
    }

    public Integer getVgsGroup() {
        return vgsGroup;
    }

    public void setVgsGroup(Integer vgsGroup) {
        this.vgsGroup = vgsGroup;
    }

}