/**
* @FileName: FinishBtnAction.java
* @Package: com.hro.qrdoc.action.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FinishBtnAction.java: 结束按钮事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午3:31:38.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.qrbox;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import com.hro.qrdoc.action.base.BaseAction;
import com.hro.qrdoc.bean.qrbox.QrBoxPage;
import com.hro.qrdoc.bean.qrbox.QrcodeBoxBean;
import com.hro.qrdoc.constant.ApplicationConstant;
import com.hro.qrdoc.constant.SysStatusAndType;
import com.hro.qrdoc.utils.qrbox.QrBoxUtils;

/**
* @ClassName: FinishBtnAction.java
* 
* @Description: 
* <p>
* 结束按钮事件.
* </p>
* <p>
* 详细描述：结束按钮事件，保存文件，初始化二维码装箱panel.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月7日 下午3:31:38.
* 
*/
public class FinishBtnAction extends BaseAction 
{
	
	/**
	 * 二维码装箱页面bean.
	 */
	private QrBoxPage qrBoxPage;
	
	/**
	 * 二维码装箱bean.
	 */
	private QrcodeBoxBean qrcodeBoxBean;
	
	/**
	 * 有参构造函数.
	 * @param qrBoxPage
	 */
	public FinishBtnAction(QrBoxPage qrBoxPage) 
	{
		this.qrBoxPage = qrBoxPage;
	}

	/* (non-Javadoc)
	 * @see com.hro.qrdoc.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		qrBoxPage.flushQrcodeBoxBean();
		qrcodeBoxBean = qrBoxPage.getQrcodeBoxBean();
		
		String verifyResult = QrBoxUtils.verifyQrBoxPageParams(qrcodeBoxBean);
		if (!SysStatusAndType.QBPParamsVerify.OK.equals(verifyResult)) 
		{
			JOptionPane.showMessageDialog(null, ApplicationConstant.APP_CONFIGS.get(verifyResult), ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, ApplicationConstant.APP_CONFIGS.get(verifyResult), ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
		}
	}
	
}
