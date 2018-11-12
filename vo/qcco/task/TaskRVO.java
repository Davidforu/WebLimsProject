package nc.vo.qcco.task;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> ��??�n�y�z��?�\�� </b>
 * <p>
 *   ��?�K�[�֪��y�z�H��
 * </p>
 *  ?�ؤ��:2018-11-12
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class TaskRVO extends SuperVO {
	
/**
*??��D?
*/
public String pk_task_r;
/**
*?�~??
*/
public String pk_samplegroup;
/**
*�̤p��
*/
public String stdminvalue;
/**
*�̤j��
*/
public String stdmaxvalue;
/**
*?��
*/
public String pk_unit;
/**
*????
*/
public Boolean testflag;
/**
*�P�w??
*/
public Boolean judgeflag;
/**
*???��
*/
public String pk_testtemperature;
/**
*�W??�u�D?
*/
public String pk_task_b;
/**
*??�W
*/
public UFDateTime ts;
    
    
/**
* ?�� pk_task_r��Getter��k.?�ʦW�G??��D?
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getPk_task_r() {
return this.pk_task_r;
} 

/**
* ?��pk_task_r��Setter��k.?�ʦW�G??��D?
* ?�ؤ��:2018-11-12
* @param newPk_task_r java.lang.String
*/
public void setPk_task_r ( String pk_task_r) {
this.pk_task_r=pk_task_r;
} 
 
/**
* ?�� pk_samplegroup��Getter��k.?�ʦW�G?�~??
*  ?�ؤ��:2018-11-12
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_samplegroup() {
return this.pk_samplegroup;
} 

/**
* ?��pk_samplegroup��Setter��k.?�ʦW�G?�~??
* ?�ؤ��:2018-11-12
* @param newPk_samplegroup nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_samplegroup ( String pk_samplegroup) {
this.pk_samplegroup=pk_samplegroup;
} 
 
/**
* ?�� stdminvalue��Getter��k.?�ʦW�G�̤p��
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFDouble
*/
public String getStdminvalue() {
return this.stdminvalue;
} 

/**
* ?��stdminvalue��Setter��k.?�ʦW�G�̤p��
* ?�ؤ��:2018-11-12
* @param newStdminvalue nc.vo.pub.lang.UFDouble
*/
public void setStdminvalue ( String stdminvalue) {
this.stdminvalue=stdminvalue;
} 
 
/**
* ?�� stdmaxvalue��Getter��k.?�ʦW�G�̤j��
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFDouble
*/
public String getStdmaxvalue() {
return this.stdmaxvalue;
} 

/**
* ?��stdmaxvalue��Setter��k.?�ʦW�G�̤j��
* ?�ؤ��:2018-11-12
* @param newStdmaxvalue nc.vo.pub.lang.UFDouble
*/
public void setStdmaxvalue ( String stdmaxvalue) {
this.stdmaxvalue=stdmaxvalue;
} 
 
/**
* ?�� pk_unit��Getter��k.?�ʦW�G?��
*  ?�ؤ��:2018-11-12
* @return nc.vo.bd.material.measdoc.MeasdocVO
*/
public String getPk_unit() {
return this.pk_unit;
} 

/**
* ?��pk_unit��Setter��k.?�ʦW�G?��
* ?�ؤ��:2018-11-12
* @param newPk_unit nc.vo.bd.material.measdoc.MeasdocVO
*/
public void setPk_unit ( String pk_unit) {
this.pk_unit=pk_unit;
} 
 
/**
* ?�� testflag��Getter��k.?�ʦW�G????
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFBoolean
*/
public Boolean getTestflag() {
return this.testflag;
} 

/**
* ?��testflag��Setter��k.?�ʦW�G????
* ?�ؤ��:2018-11-12
* @param newTestflag nc.vo.pub.lang.UFBoolean
*/
public void setTestflag ( Boolean testflag) {
this.testflag=testflag;
} 
 
/**
* ?�� judgeflag��Getter��k.?�ʦW�G�P�w??
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFBoolean
*/
public Boolean getJudgeflag() {
return this.judgeflag;
} 

/**
* ?��judgeflag��Setter��k.?�ʦW�G�P�w??
* ?�ؤ��:2018-11-12
* @param newJudgeflag nc.vo.pub.lang.UFBoolean
*/
public void setJudgeflag ( Boolean judgeflag) {
this.judgeflag=judgeflag;
} 
 
/**
* ?�� pk_testtemperature��Getter��k.?�ʦW�G???��
*  ?�ؤ��:2018-11-12
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_testtemperature() {
return this.pk_testtemperature;
} 

/**
* ?��pk_testtemperature��Setter��k.?�ʦW�G???��
* ?�ؤ��:2018-11-12
* @param newPk_testtemperature nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_testtemperature ( String pk_testtemperature) {
this.pk_testtemperature=pk_testtemperature;
} 
 
/**
* ?�� �ͦ��W?�D?��Getter��k.?�ʦW�G�W?�D?
*  ?�ؤ��:2018-11-12
* @return String
*/
public String getPk_task_b(){
return this.pk_task_b;
}
/**
* ?�ʥͦ��W?�D?��Setter��k.?�ʦW�G�W?�D?
* ?�ؤ��:2018-11-12
* @param newPk_task_b String
*/
public void setPk_task_b(String pk_task_b){
this.pk_task_b=pk_task_b;
} 
/**
* ?�� �ͦ�??�W��Getter��k.?�ʦW�G??�W
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ?�ʥͦ�??�W��Setter��k.?�ʦW�G??�W
* ?�ؤ��:2018-11-12
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_r");
    }
   }
    