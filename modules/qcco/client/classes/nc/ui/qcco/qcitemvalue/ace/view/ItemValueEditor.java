package nc.ui.qcco.qcitemvalue.ace.view;

import nc.ui.bd.pub.view.BDBatchBillTable;
import nc.ui.pub.bill.BillEditEvent;

public class ItemValueEditor extends BDBatchBillTable{
	private static final long serialVersionUID = 1L;

	  protected void doAfterEdit(BillEditEvent e)
	  {
	    super.doAfterEdit(e);
	    getBillCardPanel().stopEditing();
	  }

}
