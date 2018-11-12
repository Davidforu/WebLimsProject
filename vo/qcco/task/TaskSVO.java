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
 
public class TaskSVO extends SuperVO {
	
/**
*?�~��D?
*/
public String pk_sample;
/**
*?�~??
*/
public String sampleno;
/**
*�W??�u�D?
*/
public String pk_task_b;
/**
*??�W
*/
public UFDateTime ts;
    
    
/**
* ?�� pk_sample��Getter��k.?�ʦW�G?�~��D?
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getPk_sample() {
return this.pk_sample;
} 

/**
* ?��pk_sample��Setter��k.?�ʦW�G?�~��D?
* ?�ؤ��:2018-11-12
* @param newPk_sample java.lang.String
*/
public void setPk_sample ( String pk_sample) {
this.pk_sample=pk_sample;
} 
 
/**
* ?�� sampleno��Getter��k.?�ʦW�G?�~??
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getSampleno() {
return this.sampleno;
} 

/**
* ?��sampleno��Setter��k.?�ʦW�G?�~??
* ?�ؤ��:2018-11-12
* @param newSampleno java.lang.String
*/
public void setSampleno ( String sampleno) {
this.sampleno=sampleno;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_s");
    }
   }
    