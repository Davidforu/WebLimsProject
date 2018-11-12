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
 
public class TaskBVO extends SuperVO {
	
/**
*��?��D?
*/
public String pk_task_b;
/**
*��???
*/
public String taskcode;
/**
*��?�W?
*/
public String taskname;
/**
*?�~?�q
*/
public String samplequantity;
/**
*?��?��
*/
public Integer runorder;
/**
*��?
*/
public String rowno;
/**
*�W??�u�D?
*/
public String pk_task_h;
/**
*??�W
*/
public UFDateTime ts;
    
    
/**
* ?�� pk_task_b��Getter��k.?�ʦW�G��?��D?
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getPk_task_b() {
return this.pk_task_b;
} 

/**
* ?��pk_task_b��Setter��k.?�ʦW�G��?��D?
* ?�ؤ��:2018-11-12
* @param newPk_task_b java.lang.String
*/
public void setPk_task_b ( String pk_task_b) {
this.pk_task_b=pk_task_b;
} 
 
/**
* ?�� taskcode��Getter��k.?�ʦW�G��???
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getTaskcode() {
return this.taskcode;
} 

/**
* ?��taskcode��Setter��k.?�ʦW�G��???
* ?�ؤ��:2018-11-12
* @param newTaskcode java.lang.String
*/
public void setTaskcode ( String taskcode) {
this.taskcode=taskcode;
} 
 
/**
* ?�� taskname��Getter��k.?�ʦW�G��?�W?
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getTaskname() {
return this.taskname;
} 

/**
* ?��taskname��Setter��k.?�ʦW�G��?�W?
* ?�ؤ��:2018-11-12
* @param newTaskname java.lang.String
*/
public void setTaskname ( String taskname) {
this.taskname=taskname;
} 
 
/**
* ?�� samplequantity��Getter��k.?�ʦW�G?�~?�q
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFDouble
*/
public String getSamplequantity() {
return this.samplequantity;
} 

/**
* ?��samplequantity��Setter��k.?�ʦW�G?�~?�q
* ?�ؤ��:2018-11-12
* @param newSamplequantity nc.vo.pub.lang.UFDouble
*/
public void setSamplequantity ( String samplequantity) {
this.samplequantity=samplequantity;
} 
 
/**
* ?�� runorder��Getter��k.?�ʦW�G?��?��
*  ?�ؤ��:2018-11-12
* @return java.lang.Integer
*/
public Integer getRunorder() {
return this.runorder;
} 

/**
* ?��runorder��Setter��k.?�ʦW�G?��?��
* ?�ؤ��:2018-11-12
* @param newRunorder java.lang.Integer
*/
public void setRunorder ( Integer runorder) {
this.runorder=runorder;
} 
 
/**
* ?�� rowno��Getter��k.?�ʦW�G��?
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getRowno() {
return this.rowno;
} 

/**
* ?��rowno��Setter��k.?�ʦW�G��?
* ?�ؤ��:2018-11-12
* @param newRowno java.lang.String
*/
public void setRowno ( String rowno) {
this.rowno=rowno;
} 
 
/**
* ?�� �ͦ��W?�D?��Getter��k.?�ʦW�G�W?�D?
*  ?�ؤ��:2018-11-12
* @return String
*/
public String getPk_task_h(){
return this.pk_task_h;
}
/**
* ?�ʥͦ��W?�D?��Setter��k.?�ʦW�G�W?�D?
* ?�ؤ��:2018-11-12
* @param newPk_task_h String
*/
public void setPk_task_h(String pk_task_h){
this.pk_task_h=pk_task_h;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_b");
    }
   }
    