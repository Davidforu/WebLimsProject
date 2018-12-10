package nc.ui.qcco.analysemethod.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.ui.pubapp.pub.task.ISingleBillService;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.ui.pubapp.uif2app.actions.IDataOperationService;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.uif2.components.pagination.IPaginationQueryService;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.analysemethod.AggAnalyseMethodHVO;
import nc.itf.qcco.IAnalysemethodMaintain;

/**
 * ʾ�����ݵĲ�������
 * 
 * @author author
 * @version tempProject version
 */
public class AceAnalysemethodMaintainProxy implements IDataOperationService,
		IQueryService ,ISingleBillService<AggAnalyseMethodHVO>{
	@Override
	public IBill[] insert(IBill[] value) throws BusinessException {
		IAnalysemethodMaintain operator = NCLocator.getInstance().lookup(
				IAnalysemethodMaintain.class);
		AggAnalyseMethodHVO[] vos = operator.insert((AggAnalyseMethodHVO[]) value);
		return vos;
	}

	@Override
	public IBill[] update(IBill[] value) throws BusinessException {
		IAnalysemethodMaintain operator = NCLocator.getInstance().lookup(
				IAnalysemethodMaintain.class);
		AggAnalyseMethodHVO[] vos = operator.update((AggAnalyseMethodHVO[]) value);
		return vos;
	}

	@Override
	public IBill[] delete(IBill[] value) throws BusinessException {
		// Ŀǰ��ɾ�����������������������pubapp��֧�ִ����������ִ��ɾ������
		// ���ݵ�ɾ��ʵ����ʹ�õ��ǣ�ISingleBillService<AggSingleBill>��operateBill
		IAnalysemethodMaintain operator = NCLocator.getInstance().lookup(
				IAnalysemethodMaintain.class);
		operator.delete((AggAnalyseMethodHVO[]) value);
		return value;
	}
	
	@Override
	public AggAnalyseMethodHVO operateBill(AggAnalyseMethodHVO bill) throws Exception {
		IAnalysemethodMaintain operator = NCLocator.getInstance().lookup(
				IAnalysemethodMaintain.class);
		operator.delete(new AggAnalyseMethodHVO[] { bill });
		return bill;
	}

	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		IAnalysemethodMaintain query = NCLocator.getInstance().lookup(
				IAnalysemethodMaintain.class);
		return query.query(queryScheme);
	}

}