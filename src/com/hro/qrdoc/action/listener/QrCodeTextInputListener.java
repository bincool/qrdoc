/**
* @FileName: QrCodeTextInputListener.java
* @Package: com.hro.qrdoc.action.listener
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrCodeTextInputListener.java: 二维码文本域监听器.
* @Author wchy，技术交流(891946049).
* @Date 2018年7月26日 下午4:42:46.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.listener;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.hro.qrdoc.bean.qrbox.QrBoxPage;
import com.hro.qrdoc.constant.ApplicationConstant;
import com.hro.qrdoc.utils.qrbox.QrBoxUtils;

/**
* @ClassName: QrCodeTextInputListener.java
* 
* @Description: 
* <p>
* 二维码文本域监听器.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年7月26日 下午4:42:46.
* 
*/
public class QrCodeTextInputListener implements DocumentListener 
{
	
	/**
	 * 二维码输入文本域.
	 */
	private JTextArea qrCodeText;
	
	/**
	 * 二维码装箱页面bean.
	 */
	private QrBoxPage qrBoxPage;
	
	/**
	 * 构造函数.
	 * @param qrCodeText
	 * @param qrBoxPage
	 */
	public QrCodeTextInputListener(JTextArea qrCodeText, QrBoxPage qrBoxPage) 
	{
		this.qrCodeText = qrCodeText;
		this.qrBoxPage = qrBoxPage;
	}

	@Override
	public void insertUpdate(DocumentEvent e) 
	{
		int lastN = qrCodeText.getText().lastIndexOf("\n") + 1;
		if (lastN == qrCodeText.getText().length()) 
		{
			String qrCodeStr = QrBoxUtils.trim(qrCodeText.getText());
			String[] arr = qrCodeStr.split("\\n");
			if (arr.length >= Integer.parseInt(qrBoxPage.getCountPanel().getInputValue())) 
			{
				qrCodeText.setEnabled(false);
				JOptionPane.showMessageDialog(null, "已装满，请点下一箱", ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
				return;
			}
		} 
	}

	@Override
	public void removeUpdate(DocumentEvent e) 
	{
	}

	@Override
	public void changedUpdate(DocumentEvent e) 
	{
	}

}
