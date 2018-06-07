/**
* @FileName: NextBtnAction.java
* @Package: com.hro.qrdoc.action.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: NextBtnAction.java: ��һ�䰴ť�¼�.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����3:44:01.
* @Content: ����.
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
* ��һ�䰴ť�¼�.
* </p>
* <p>
* ��ϸ������д�ļ��������ô������룬װ���ά��.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��6��7�� ����3:44:01.
* 
*/
public class NextBtnAction extends BaseAction 
{
	
	/**
	 * ��ά��װ��ҳ��bean.
	 */
	private QrBoxPage qrBoxPage;
	
	/**
	 * ��ά��װ��bean.
	 */
	private QrcodeBoxBean qrcodeBoxBean;
	
	/**
	 * �вι��캯��.
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
