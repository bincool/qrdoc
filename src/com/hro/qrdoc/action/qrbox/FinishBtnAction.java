/**
* @FileName: FinishBtnAction.java
* @Package: com.hro.qrdoc.action.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FinishBtnAction.java: ������ť�¼�.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����3:31:38.
* @Content: ����.
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
* ������ť�¼�.
* </p>
* <p>
* ��ϸ������������ť�¼��������ļ�����ʼ����ά��װ��panel.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��6��7�� ����3:31:38.
* 
*/
public class FinishBtnAction extends BaseAction 
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
		// ���ݴ���.
		qrBoxPage.flushQrcodeBoxBean();
		qrcodeBoxBean = qrBoxPage.getQrcodeBoxBean();
		
		// ����У��.
		String verifyResult = QrBoxUtils.verifyQrBoxPageParams(qrcodeBoxBean);
		if (SysStatusAndType.QBPParamsVerify.OK.equals(verifyResult)) 
		{
			try 
			{
				// �������ݵ����ļ�.
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
			// �ϲ����ļ�.
			QrBoxUtils.mergeSubFile(qrBoxPage);
		} 
		catch (IOException e1) 
		{
			LOGGER.error("���ļ��ϲ��쳣", e1);
		} 
		finally 
		{
			// ��ʼ��ȫ�ֱ���.
			qrBoxPage.initQrBoxPage();
		}
	}
	
}
