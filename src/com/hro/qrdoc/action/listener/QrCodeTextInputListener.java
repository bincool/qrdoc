/**
* @FileName: QrCodeTextInputListener.java
* @Package: com.hro.qrdoc.action.listener
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrCodeTextInputListener.java: ��ά���ı��������.
* @Author wchy����������(891946049).
* @Date 2018��7��26�� ����4:42:46.
* @Content: ����.
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
* ��ά���ı��������.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��7��26�� ����4:42:46.
* 
*/
public class QrCodeTextInputListener implements DocumentListener 
{
	
	private JTextArea qrCodeText;
	
	private QrBoxPage qrBoxPage;
	
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
				JOptionPane.showMessageDialog(null, "��װ���������һ��", ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
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
