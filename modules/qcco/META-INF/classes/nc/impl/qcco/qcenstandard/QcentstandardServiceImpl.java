package nc.impl.qcco.qcenstandard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.itf.qcco.IQcentstandardService;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcentstandard.EntstandardVO;

public class QcentstandardServiceImpl implements IQcentstandardService{
	@Override
	public List<Object> queryAllCommissonType() throws BusinessException {
		String con = "dr = 0";
		return queryCommissonTypeByCondition(con);
	}

	@Override
	public List<Object> queryCommissonTypeByCondition(String con)
			throws BusinessException {
		if (StringUtil.isEmpty(con)) {
		      con = "1=1 and dr=0 ";
		    }
		    IMDPersistenceQueryService service = MDPersistenceService.lookupPersistenceQueryService();

		    Collection col = service.queryBillOfVOByCond(EntstandardVO.class, con, false, false);
		    return new ArrayList(col);
	}

}
