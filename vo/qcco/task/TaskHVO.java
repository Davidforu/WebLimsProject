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
 
public class TaskHVO extends SuperVO {
	
/**
*�D��D?
*/
public String pk_task_h;
/**
*�e��?�D?
*/
public String pk_commission_h;
/**
*��?
*/
public String pk_group;
/**
*??
*/
public String pk_org;
/**
*??����
*/
public String pk_org_v;
/**
*��?���
*/
public UFDate dbilldate;
/**
*?�ؤH
*/
public String creator;
/**
*?��??
*/
public UFDateTime creationtime;
/**
*�ק�H
*/
public String modifier;
/**
*�ק�??
*/
public UFDateTime modifiedtime;
/**
*code
*/
public String code;
/**
*name
*/
public String name;
/**
*��???
*/
public UFDateTime maketime;
/**
*�̦Z�ק�??
*/
public UFDateTime lastmaketime;
/**
*?�uID
*/
public String billid;
/**
*?�u?
*/
public String billno;
/**
*???��
*/
public String busitype;
/**
*��?�H
*/
public String billmaker;
/**
*?��H
*/
public String approver;
/**
*?��??
*/
public Integer approvestatus;
/**
*?���?
*/
public String approvenote;
/**
*?��??
*/
public UFDateTime approvedate;
/**
*���?��
*/
public String transtype;
/**
*?�u?��
*/
public String billtype;
/**
*���?��pk
*/
public String transtypepk;
/**
*?��?�u?��
*/
public String srcbilltype;
/**
*?��?�uid
*/
public String srcbillid;
/**
*��?�T?
*/
public Integer emendenum;
/**
*?�u����pk
*/
public String billversionpk;
/**
*??�W
*/
public UFDateTime ts;
    
    
/**
* ?�� pk_task_h��Getter��k.?�ʦW�G�D��D?
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getPk_task_h() {
return this.pk_task_h;
} 

/**
* ?��pk_task_h��Setter��k.?�ʦW�G�D��D?
* ?�ؤ��:2018-11-12
* @param newPk_task_h java.lang.String
*/
public void setPk_task_h ( String pk_task_h) {
this.pk_task_h=pk_task_h;
} 
 
/**
* ?�� pk_commission_h��Getter��k.?�ʦW�G�e��?�D?
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getPk_commission_h() {
return this.pk_commission_h;
} 

/**
* ?��pk_commission_h��Setter��k.?�ʦW�G�e��?�D?
* ?�ؤ��:2018-11-12
* @param newPk_commission_h java.lang.String
*/
public void setPk_commission_h ( String pk_commission_h) {
this.pk_commission_h=pk_commission_h;
} 
 
/**
* ?�� pk_group��Getter��k.?�ʦW�G��?
*  ?�ؤ��:2018-11-12
* @return nc.vo.org.GroupVO
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* ?��pk_group��Setter��k.?�ʦW�G��?
* ?�ؤ��:2018-11-12
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ?�� pk_org��Getter��k.?�ʦW�G??
*  ?�ؤ��:2018-11-12
* @return nc.vo.org.OrgVO
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* ?��pk_org��Setter��k.?�ʦW�G??
* ?�ؤ��:2018-11-12
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* ?�� pk_org_v��Getter��k.?�ʦW�G??����
*  ?�ؤ��:2018-11-12
* @return nc.vo.vorg.OrgVersionVO
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* ?��pk_org_v��Setter��k.?�ʦW�G??����
* ?�ؤ��:2018-11-12
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* ?�� dbilldate��Getter��k.?�ʦW�G��?���
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDbilldate() {
return this.dbilldate;
} 

/**
* ?��dbilldate��Setter��k.?�ʦW�G��?���
* ?�ؤ��:2018-11-12
* @param newDbilldate nc.vo.pub.lang.UFDate
*/
public void setDbilldate ( UFDate dbilldate) {
this.dbilldate=dbilldate;
} 
 
/**
* ?�� creator��Getter��k.?�ʦW�G?�ؤH
*  ?�ؤ��:2018-11-12
* @return nc.vo.sm.UserVO
*/
public String getCreator() {
return this.creator;
} 

/**
* ?��creator��Setter��k.?�ʦW�G?�ؤH
* ?�ؤ��:2018-11-12
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( String creator) {
this.creator=creator;
} 
 
/**
* ?�� creationtime��Getter��k.?�ʦW�G?��??
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* ?��creationtime��Setter��k.?�ʦW�G?��??
* ?�ؤ��:2018-11-12
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* ?�� modifier��Getter��k.?�ʦW�G�ק�H
*  ?�ؤ��:2018-11-12
* @return nc.vo.sm.UserVO
*/
public String getModifier() {
return this.modifier;
} 

/**
* ?��modifier��Setter��k.?�ʦW�G�ק�H
* ?�ؤ��:2018-11-12
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
} 
 
/**
* ?�� modifiedtime��Getter��k.?�ʦW�G�ק�??
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* ?��modifiedtime��Setter��k.?�ʦW�G�ק�??
* ?�ؤ��:2018-11-12
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
} 
 
/**
* ?�� code��Getter��k.?�ʦW�Gcode
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getCode() {
return this.code;
} 

/**
* ?��code��Setter��k.?�ʦW�Gcode
* ?�ؤ��:2018-11-12
* @param newCode java.lang.String
*/
public void setCode ( String code) {
this.code=code;
} 
 
/**
* ?�� name��Getter��k.?�ʦW�Gname
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getName() {
return this.name;
} 

/**
* ?��name��Setter��k.?�ʦW�Gname
* ?�ؤ��:2018-11-12
* @param newName java.lang.String
*/
public void setName ( String name) {
this.name=name;
} 
 
/**
* ?�� maketime��Getter��k.?�ʦW�G��???
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getMaketime() {
return this.maketime;
} 

/**
* ?��maketime��Setter��k.?�ʦW�G��???
* ?�ؤ��:2018-11-12
* @param newMaketime nc.vo.pub.lang.UFDateTime
*/
public void setMaketime ( UFDateTime maketime) {
this.maketime=maketime;
} 
 
/**
* ?�� lastmaketime��Getter��k.?�ʦW�G�̦Z�ק�??
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getLastmaketime() {
return this.lastmaketime;
} 

/**
* ?��lastmaketime��Setter��k.?�ʦW�G�̦Z�ק�??
* ?�ؤ��:2018-11-12
* @param newLastmaketime nc.vo.pub.lang.UFDateTime
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.lastmaketime=lastmaketime;
} 
 
/**
* ?�� billid��Getter��k.?�ʦW�G?�uID
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getBillid() {
return this.billid;
} 

/**
* ?��billid��Setter��k.?�ʦW�G?�uID
* ?�ؤ��:2018-11-12
* @param newBillid java.lang.String
*/
public void setBillid ( String billid) {
this.billid=billid;
} 
 
/**
* ?�� billno��Getter��k.?�ʦW�G?�u?
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getBillno() {
return this.billno;
} 

/**
* ?��billno��Setter��k.?�ʦW�G?�u?
* ?�ؤ��:2018-11-12
* @param newBillno java.lang.String
*/
public void setBillno ( String billno) {
this.billno=billno;
} 
 
/**
* ?�� busitype��Getter��k.?�ʦW�G???��
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getBusitype() {
return this.busitype;
} 

/**
* ?��busitype��Setter��k.?�ʦW�G???��
* ?�ؤ��:2018-11-12
* @param newBusitype java.lang.String
*/
public void setBusitype ( String busitype) {
this.busitype=busitype;
} 
 
/**
* ?�� billmaker��Getter��k.?�ʦW�G��?�H
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getBillmaker() {
return this.billmaker;
} 

/**
* ?��billmaker��Setter��k.?�ʦW�G��?�H
* ?�ؤ��:2018-11-12
* @param newBillmaker java.lang.String
*/
public void setBillmaker ( String billmaker) {
this.billmaker=billmaker;
} 
 
/**
* ?�� approver��Getter��k.?�ʦW�G?��H
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getApprover() {
return this.approver;
} 

/**
* ?��approver��Setter��k.?�ʦW�G?��H
* ?�ؤ��:2018-11-12
* @param newApprover java.lang.String
*/
public void setApprover ( String approver) {
this.approver=approver;
} 
 
/**
* ?�� approvestatus��Getter��k.?�ʦW�G?��??
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.pf.BillStatusEnum
*/
public Integer getApprovestatus() {
return this.approvestatus;
} 

/**
* ?��approvestatus��Setter��k.?�ʦW�G?��??
* ?�ؤ��:2018-11-12
* @param newApprovestatus nc.vo.pub.pf.BillStatusEnum
*/
public void setApprovestatus ( Integer approvestatus) {
this.approvestatus=approvestatus;
} 
 
/**
* ?�� approvenote��Getter��k.?�ʦW�G?���?
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getApprovenote() {
return this.approvenote;
} 

/**
* ?��approvenote��Setter��k.?�ʦW�G?���?
* ?�ؤ��:2018-11-12
* @param newApprovenote java.lang.String
*/
public void setApprovenote ( String approvenote) {
this.approvenote=approvenote;
} 
 
/**
* ?�� approvedate��Getter��k.?�ʦW�G?��??
*  ?�ؤ��:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getApprovedate() {
return this.approvedate;
} 

/**
* ?��approvedate��Setter��k.?�ʦW�G?��??
* ?�ؤ��:2018-11-12
* @param newApprovedate nc.vo.pub.lang.UFDateTime
*/
public void setApprovedate ( UFDateTime approvedate) {
this.approvedate=approvedate;
} 
 
/**
* ?�� transtype��Getter��k.?�ʦW�G���?��
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getTranstype() {
return this.transtype;
} 

/**
* ?��transtype��Setter��k.?�ʦW�G���?��
* ?�ؤ��:2018-11-12
* @param newTranstype java.lang.String
*/
public void setTranstype ( String transtype) {
this.transtype=transtype;
} 
 
/**
* ?�� billtype��Getter��k.?�ʦW�G?�u?��
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getBilltype() {
return this.billtype;
} 

/**
* ?��billtype��Setter��k.?�ʦW�G?�u?��
* ?�ؤ��:2018-11-12
* @param newBilltype java.lang.String
*/
public void setBilltype ( String billtype) {
this.billtype=billtype;
} 
 
/**
* ?�� transtypepk��Getter��k.?�ʦW�G���?��pk
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getTranstypepk() {
return this.transtypepk;
} 

/**
* ?��transtypepk��Setter��k.?�ʦW�G���?��pk
* ?�ؤ��:2018-11-12
* @param newTranstypepk java.lang.String
*/
public void setTranstypepk ( String transtypepk) {
this.transtypepk=transtypepk;
} 
 
/**
* ?�� srcbilltype��Getter��k.?�ʦW�G?��?�u?��
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getSrcbilltype() {
return this.srcbilltype;
} 

/**
* ?��srcbilltype��Setter��k.?�ʦW�G?��?�u?��
* ?�ؤ��:2018-11-12
* @param newSrcbilltype java.lang.String
*/
public void setSrcbilltype ( String srcbilltype) {
this.srcbilltype=srcbilltype;
} 
 
/**
* ?�� srcbillid��Getter��k.?�ʦW�G?��?�uid
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getSrcbillid() {
return this.srcbillid;
} 

/**
* ?��srcbillid��Setter��k.?�ʦW�G?��?�uid
* ?�ؤ��:2018-11-12
* @param newSrcbillid java.lang.String
*/
public void setSrcbillid ( String srcbillid) {
this.srcbillid=srcbillid;
} 
 
/**
* ?�� emendenum��Getter��k.?�ʦW�G��?�T?
*  ?�ؤ��:2018-11-12
* @return java.lang.Integer
*/
public Integer getEmendenum() {
return this.emendenum;
} 

/**
* ?��emendenum��Setter��k.?�ʦW�G��?�T?
* ?�ؤ��:2018-11-12
* @param newEmendenum java.lang.Integer
*/
public void setEmendenum ( Integer emendenum) {
this.emendenum=emendenum;
} 
 
/**
* ?�� billversionpk��Getter��k.?�ʦW�G?�u����pk
*  ?�ؤ��:2018-11-12
* @return java.lang.String
*/
public String getBillversionpk() {
return this.billversionpk;
} 

/**
* ?��billversionpk��Setter��k.?�ʦW�G?�u����pk
* ?�ؤ��:2018-11-12
* @param newBillversionpk java.lang.String
*/
public void setBillversionpk ( String billversionpk) {
this.billversionpk=billversionpk;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_h");
    }
   }
    