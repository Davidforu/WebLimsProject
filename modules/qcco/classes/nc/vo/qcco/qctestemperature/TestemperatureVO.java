package nc.vo.qcco.qctestemperature;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴������۵�������Ϣ
 * </p>
 *  ��������:2018-12-5
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class TestemperatureVO extends SuperVO {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -6655122739008914663L;
/**
*����
*/
public String pk_testemperature;
/**
*����
*/
public String pk_group;
/**
*��֯
*/
public String pk_org;
/**
*��֯�汾
*/
public String pk_org_v;
/**
*������
*/
public String creator;
/**
*����ʱ��
*/
public UFDateTime creationtime;
/**
*�޸���
*/
public String modifier;
/**
*�޸�ʱ��
*/
public UFDateTime modifiedtime;
/**
*����
*/
public String code;
/**
*����
*/
public String name;
/**
*�Ƶ�ʱ��
*/
public UFDateTime maketime;
/**
*����޸�ʱ��
*/
public UFDateTime lastmaketime;
/**
*�ṹ����
*/
public String pk_structtype;
/**
*����
*/
public String pk_modelno;
/**
*��ҵ��׼
*/
public String pk_entstandard;
/**
*��Ʒϵ��
*/
public String pk_productserial;
/**
*��������
*/
public String analysename;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_testemperature��Getter����.������������
*  ��������:2018-12-5
* @return java.lang.String
*/
public String getPk_testemperature() {
return this.pk_testemperature;
} 

/**
* ����pk_testemperature��Setter����.������������
* ��������:2018-12-5
* @param newPk_testemperature java.lang.String
*/
public void setPk_testemperature ( String pk_testemperature) {
this.pk_testemperature=pk_testemperature;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2018-12-5
* @return nc.vo.org.GroupVO
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2018-12-5
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� pk_org��Getter����.����������֯
*  ��������:2018-12-5
* @return nc.vo.org.OrgVO
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* ����pk_org��Setter����.����������֯
* ��������:2018-12-5
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* ���� pk_org_v��Getter����.����������֯�汾
*  ��������:2018-12-5
* @return nc.vo.vorg.OrgVersionVO
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* ����pk_org_v��Setter����.����������֯�汾
* ��������:2018-12-5
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* ���� creator��Getter����.��������������
*  ��������:2018-12-5
* @return nc.vo.sm.UserVO
*/
public String getCreator() {
return this.creator;
} 

/**
* ����creator��Setter����.��������������
* ��������:2018-12-5
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( String creator) {
this.creator=creator;
} 
 
/**
* ���� creationtime��Getter����.������������ʱ��
*  ��������:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* ����creationtime��Setter����.������������ʱ��
* ��������:2018-12-5
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* ���� modifier��Getter����.���������޸���
*  ��������:2018-12-5
* @return nc.vo.sm.UserVO
*/
public String getModifier() {
return this.modifier;
} 

/**
* ����modifier��Setter����.���������޸���
* ��������:2018-12-5
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
} 
 
/**
* ���� modifiedtime��Getter����.���������޸�ʱ��
*  ��������:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* ����modifiedtime��Setter����.���������޸�ʱ��
* ��������:2018-12-5
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
} 
 
/**
* ���� code��Getter����.������������
*  ��������:2018-12-5
* @return java.lang.String
*/
public String getCode() {
return this.code;
} 

/**
* ����code��Setter����.������������
* ��������:2018-12-5
* @param newCode java.lang.String
*/
public void setCode ( String code) {
this.code=code;
} 
 
/**
* ���� name��Getter����.������������
*  ��������:2018-12-5
* @return java.lang.String
*/
public String getName() {
return this.name;
} 

/**
* ����name��Setter����.������������
* ��������:2018-12-5
* @param newName java.lang.String
*/
public void setName ( String name) {
this.name=name;
} 
 
/**
* ���� maketime��Getter����.���������Ƶ�ʱ��
*  ��������:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getMaketime() {
return this.maketime;
} 

/**
* ����maketime��Setter����.���������Ƶ�ʱ��
* ��������:2018-12-5
* @param newMaketime nc.vo.pub.lang.UFDateTime
*/
public void setMaketime ( UFDateTime maketime) {
this.maketime=maketime;
} 
 
/**
* ���� lastmaketime��Getter����.������������޸�ʱ��
*  ��������:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getLastmaketime() {
return this.lastmaketime;
} 

/**
* ����lastmaketime��Setter����.������������޸�ʱ��
* ��������:2018-12-5
* @param newLastmaketime nc.vo.pub.lang.UFDateTime
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.lastmaketime=lastmaketime;
} 
 
/**
* ���� pk_structtype��Getter����.���������ṹ����
*  ��������:2018-12-5
* @return nc.vo.qcco.qcstructtype.StructTypeVO
*/
public String getPk_structtype() {
return this.pk_structtype;
} 

/**
* ����pk_structtype��Setter����.���������ṹ����
* ��������:2018-12-5
* @param newPk_structtype nc.vo.qcco.qcstructtype.StructTypeVO
*/
public void setPk_structtype ( String pk_structtype) {
this.pk_structtype=pk_structtype;
} 
 
/**
* ���� pk_modelno��Getter����.������������
*  ��������:2018-12-5
* @return nc.vo.qcco.qcmodelno.ModelnoVO
*/
public String getPk_modelno() {
return this.pk_modelno;
} 

/**
* ����pk_modelno��Setter����.������������
* ��������:2018-12-5
* @param newPk_modelno nc.vo.qcco.qcmodelno.ModelnoVO
*/
public void setPk_modelno ( String pk_modelno) {
this.pk_modelno=pk_modelno;
} 
 
/**
* ���� pk_entstandard��Getter����.����������ҵ��׼
*  ��������:2018-12-5
* @return nc.vo.qcco.qcentstandard.EntstandardVO
*/
public String getPk_entstandard() {
return this.pk_entstandard;
} 

/**
* ����pk_entstandard��Setter����.����������ҵ��׼
* ��������:2018-12-5
* @param newPk_entstandard nc.vo.qcco.qcentstandard.EntstandardVO
*/
public void setPk_entstandard ( String pk_entstandard) {
this.pk_entstandard=pk_entstandard;
} 
 
/**
* ���� pk_productserial��Getter����.����������Ʒϵ��
*  ��������:2018-12-5
* @return nc.vo.qcco.qcproductserial.ProductSerialVO
*/
public String getPk_productserial() {
return this.pk_productserial;
} 

/**
* ����pk_productserial��Setter����.����������Ʒϵ��
* ��������:2018-12-5
* @param newPk_productserial nc.vo.qcco.qcproductserial.ProductSerialVO
*/
public void setPk_productserial ( String pk_productserial) {
this.pk_productserial=pk_productserial;
} 
 
/**
* ���� analysename��Getter����.����������������
*  ��������:2018-12-5
* @return java.lang.String
*/
public String getAnalysename() {
return this.analysename;
} 

/**
* ����analysename��Setter����.����������������
* ��������:2018-12-5
* @param newAnalysename java.lang.String
*/
public void setAnalysename ( String analysename) {
this.analysename=analysename;
} 
 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2018-12-5
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("qcco.testemperature");
    }
   }
    