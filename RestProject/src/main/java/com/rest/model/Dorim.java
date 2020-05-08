package com.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Dorim {
	
	@Id
	@GeneratedValue
	private int id;
	private String bylot_cnt;
	private String sigungu_cd;
	private String regstr_kind_cd;
	private String jigu_cd_nm;
	private String regstr_kind_cd_nm;
	private String na_road_cd;
	private String new_plat_plc;
	private String mgm_bldrgst_pk;
	private String na_ugrnd_cd;
	private String regstr_gb_cd_nm;
	private String bun;
	private String guyuk_cd_nm;
	private String guyuk_cd;
	private String na_main_bun;
	private String regstr_gb_cd;
	private String bld_nm;
	private String crtn_day;
	private String na_bjdong_cd;
	private String splot_nm;
	private String block;
	private String jiyuk_cd_nm;
	private String na_sub_bun;
	private String jiyuk_cd;
	private String lot;
	private String mgm_upper_bldrgst;
	private String jigu_cd;
	private String bjdong_cd;
	private String plat_gb_cd;
	private String plat_plc;
	private String ji;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBylot_cnt() {
		return bylot_cnt;
	}
	public void setBylot_cnt(String bylot_cnt) {
		this.bylot_cnt = bylot_cnt;
	}
	public String getSigungu_cd() {
		return sigungu_cd;
	}
	public void setSigungu_cd(String sigungu_cd) {
		this.sigungu_cd = sigungu_cd;
	}
	public String getRegstr_kind_cd() {
		return regstr_kind_cd;
	}
	public void setRegstr_kind_cd(String regstr_kind_cd) {
		this.regstr_kind_cd = regstr_kind_cd;
	} 
	public String getJigu_cd_nm() {
		return jigu_cd_nm;
	}
	public void setJigu_cd_nm(String jigu_cd_nm) {
		this.jigu_cd_nm = jigu_cd_nm;
	}
	public String getRegstr_kind_cd_nm() {
		return regstr_kind_cd_nm;
	}
	public void setRegstr_kind_cd_nm(String regstr_kind_cd_nm) {
		this.regstr_kind_cd_nm = regstr_kind_cd_nm;
	}
	public String getNa_road_cd() {
		return na_road_cd;
	}
	public void setNa_road_cd(String na_road_cd) {
		this.na_road_cd = na_road_cd;
	}
	public String getNew_plat_plc() {
		return new_plat_plc;
	}
	public void setNew_plat_plc(String new_plat_plc) {
		this.new_plat_plc = new_plat_plc;
	}
	public String getMgm_bldrgst_pk() {
		return mgm_bldrgst_pk;
	}
	public void setMgm_bldrgst_pk(String mgm_bldrgst_pk) {
		this.mgm_bldrgst_pk = mgm_bldrgst_pk;
	}
	public String getNa_ugrnd_cd() {
		return na_ugrnd_cd;
	}
	public void setNa_ugrnd_cd(String na_ugrnd_cd) {
		this.na_ugrnd_cd = na_ugrnd_cd;
	}
	public String getRegstr_gb_cd_nm() {
		return regstr_gb_cd_nm;
	}
	public void setRegstr_gb_cd_nm(String regstr_gb_cd_nm) {
		this.regstr_gb_cd_nm = regstr_gb_cd_nm;
	}
	public String getBun() {
		return bun;
	}
	public void setBun(String bun) {
		this.bun = bun;
	}
	public String getGuyuk_cd_nm() {
		return guyuk_cd_nm;
	}
	public void setGuyuk_cd_nm(String guyuk_cd_nm) {
		this.guyuk_cd_nm = guyuk_cd_nm;
	}
	public String getGuyuk_cd() {
		return guyuk_cd;
	}
	public void setGuyuk_cd(String guyuk_cd) {
		this.guyuk_cd = guyuk_cd;
	}
	public String getNa_main_bun() {
		return na_main_bun;
	}
	public void setNa_main_bun(String na_main_bun) {
		this.na_main_bun = na_main_bun;
	}
	public String getRegstr_gb_cd() {
		return regstr_gb_cd;
	}
	public void setRegstr_gb_cd(String regstr_gb_cd) {
		this.regstr_gb_cd = regstr_gb_cd;
	}
	public String getBld_nm() {
		return bld_nm;
	}
	public void setBld_nm(String bld_nm) {
		this.bld_nm = bld_nm;
	}
	public String getCrtn_day() {
		return crtn_day;
	}
	public void setCrtn_day(String crtn_day) {
		this.crtn_day = crtn_day;
	}
	public String getNa_bjdong_cd() {
		return na_bjdong_cd;
	}
	public void setNa_bjdong_cd(String na_bjdong_cd) {
		this.na_bjdong_cd = na_bjdong_cd;
	}
	public String getSplot_nm() {
		return splot_nm;
	}
	public void setSplot_nm(String splot_nm) {
		this.splot_nm = splot_nm;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getJiyuk_cd_nm() {
		return jiyuk_cd_nm;
	}
	public void setJiyuk_cd_nm(String jiyuk_cd_nm) {
		this.jiyuk_cd_nm = jiyuk_cd_nm;
	}
	public String getNa_sub_bun() {
		return na_sub_bun;
	}
	public void setNa_sub_bun(String na_sub_bun) {
		this.na_sub_bun = na_sub_bun;
	}
	public String getJiyuk_cd() {
		return jiyuk_cd;
	}
	public void setJiyuk_cd(String jiyuk_cd) {
		this.jiyuk_cd = jiyuk_cd;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getMgm_upper_bldrgst() {
		return mgm_upper_bldrgst;
	}
	public void setMgm_upper_bldrgst(String mgm_upper_bldrgst) {
		this.mgm_upper_bldrgst = mgm_upper_bldrgst;
	}
	public String getJigu_cd() {
		return jigu_cd;
	}
	public void setJigu_cd(String jigu_cd) {
		this.jigu_cd = jigu_cd;
	}
	public String getBjdong_cd() {
		return bjdong_cd;
	}
	public void setBjdong_cd(String bjdong_cd) {
		this.bjdong_cd = bjdong_cd;
	}
	public String getPlat_gb_cd() {
		return plat_gb_cd;
	}
	public void setPlat_gb_cd(String plat_gb_cd) {
		this.plat_gb_cd = plat_gb_cd;
	}
	public String getPlat_plc() {
		return plat_plc;
	}
	public void setPlat_plc(String plat_plc) {
		this.plat_plc = plat_plc;
	}
	public String getJi() {
		return ji;
	}
	public void setJi(String ji) {
		this.ji = ji;
	}
	public Dorim(int id, String bylot_cnt, String sigungu_cd, String regstr_kind_cd, String jigu_cd_nm,
			String regstr_kind_cd_nm, String na_road_cd, String new_plat_plc, String mgm_bldrgst_pk, String na_ugrnd_cd,
			String regstr_gb_cd_nm, String bun, String guyuk_cd_nm, String guyuk_cd, String na_main_bun,
			String regstr_gb_cd, String bld_nm, String crtn_day, String na_bjdong_cd, String splot_nm, String block,
			String jiyuk_cd_nm, String na_sub_bun, String jiyuk_cd, String lot, String mgm_upper_bldrgst,
			String jigu_cd, String bjdong_cd, String plat_gb_cd, String plat_plc, String ji) {
		super();
		this.id = id;
		this.bylot_cnt = bylot_cnt;
		this.sigungu_cd = sigungu_cd;
		this.regstr_kind_cd = regstr_kind_cd;
		this.jigu_cd_nm = jigu_cd_nm;
		this.regstr_kind_cd_nm = regstr_kind_cd_nm;
		this.na_road_cd = na_road_cd;
		this.new_plat_plc = new_plat_plc;
		this.mgm_bldrgst_pk = mgm_bldrgst_pk;
		this.na_ugrnd_cd = na_ugrnd_cd;
		this.regstr_gb_cd_nm = regstr_gb_cd_nm;
		this.bun = bun;
		this.guyuk_cd_nm = guyuk_cd_nm;
		this.guyuk_cd = guyuk_cd;
		this.na_main_bun = na_main_bun;
		this.regstr_gb_cd = regstr_gb_cd;
		this.bld_nm = bld_nm;
		this.crtn_day = crtn_day;
		this.na_bjdong_cd = na_bjdong_cd;
		this.splot_nm = splot_nm;
		this.block = block;
		this.jiyuk_cd_nm = jiyuk_cd_nm;
		this.na_sub_bun = na_sub_bun;
		this.jiyuk_cd = jiyuk_cd;
		this.lot = lot;
		this.mgm_upper_bldrgst = mgm_upper_bldrgst;
		this.jigu_cd = jigu_cd;
		this.bjdong_cd = bjdong_cd;
		this.plat_gb_cd = plat_gb_cd;
		this.plat_plc = plat_plc;
		this.ji = ji;
	}
	public Dorim() {
		super();
		// TODO Auto-generated constructor stub
	}

}
