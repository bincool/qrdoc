/**
* @FileName: NextBtnAction.java
* @Package: com.hro.qrdoc.action.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: NextBtnAction.java: 下一箱按钮事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午3:44:01.
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
* @ClassName: NextBtnAction.java
* 
* @Description: 
* <p>
* 下一箱按钮事件.
* </p>
* <p>
* 详细描述：写文件，并重置大箱条码，装箱二维码.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月7日 下午3:44:01.
* 
*/
public class NextBtnAction extends BaseAction 
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
	public NextBtnAction(QrBoxPage qrBoxPage) 
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
		if (!SysStatusAndType.qrBoxPageParamsVerify.OK.equals(verifyResult)) 
		{
			JOptionPane.showMessageDialog(null, ApplicationConstant.APP_CONFIGS.get(verifyResult), ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, ApplicationConstant.APP_CONFIGS.get(verifyResult), ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
}
