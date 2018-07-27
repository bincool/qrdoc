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
import java.io.File;
import java.io.IOException;

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
		// 数据处理.
		qrBoxPage.flushQrcodeBoxBean();
		qrcodeBoxBean = qrBoxPage.getQrcodeBoxBean();
		
		// 参数校验.
		String verifyResult = QrBoxUtils.verifyQrBoxPageParams(qrcodeBoxBean);
		if (SysStatusAndType.QBPParamsVerify.OK.equals(verifyResult)) 
		{
			try 
			{
				// 保存数据到子文件.
				String srcPathname = qrBoxPage.getFileName() + File.separator + qrBoxPage.getBoxDataBuffer().size() + ".txt";
				QrBoxUtils.saveData(srcPathname, qrcodeBoxBean);
				qrBoxPage.getBoxDataBuffer().put(srcPathname, 10);
				qrBoxPage.clearBoxData();
			} 
			catch (IOException e1) 
			{
				LOGGER.error(qrcodeBoxBean, e1);
				JOptionPane.showMessageDialog(null, ApplicationConstant.APP_CONFIGS.get(verifyResult), ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
				return;
			}
		}
		
		try 
		{
			// 合并子文件.
			QrBoxUtils.mergeSubFile(qrBoxPage);
		} 
		catch (IOException e1) 
		{
			LOGGER.error("子文件合并异常", e1);
		} 
		finally 
		{
			// 初始化全局变量.
			qrBoxPage.initQrBoxPage();
		}
	}
	
}
