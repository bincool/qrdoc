/**
* @FileName: QrBoxPanel.java
* @Package: com.hro.qrdoc.ui.panel.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrBoxPanel.java: ��ά��װ��ɨ��panel.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����10:40:17.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.ui.panel.qrbox;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.hro.qrdoc.action.base.BaseAction;
import com.hro.qrdoc.constant.ApplicationConstant;
import com.hro.qrdoc.ui.panel.base.DefaultInputPanel;

/**
* @ClassName: QrBoxPanel.java
* 
* @Description: 
* <p>
* ��ά��װ��ɨ��panel.
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
* @Date: 2018��6��7�� ����10:40:17.
* 
*/
public class QrBoxPanel extends JPanel 
{

	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * �޲ι��캯��.
	 */
	public QrBoxPanel() 
	{
		initialContext();
	}
	
	/**
	 * ��ʼ����ά��װ��panel.
	 */
	private void initialContext() 
	{
		this.setLayout(null);
		
		// ���������.
		JLabel countLabel = new JLabel(ApplicationConstant.LABEL_TITLE_COUNT);
		countLabel.setBounds(25, 20, 70, 30);
		DefaultInputPanel countPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		countPanel.setBounds(80, 20, 190, 30);
		this.add(countLabel);
		this.add(countPanel);
		
		// ���������.
		JLabel orderNumLabel = new JLabel(ApplicationConstant.LABEL_TITLE_ORDERNUM);
		orderNumLabel.setBounds(25, 60, 70, 30);
		DefaultInputPanel orderNumPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		orderNumPanel.setBounds(80, 60, 190, 30);
		this.add(orderNumLabel);
		this.add(orderNumPanel);
		
		// �����������.
		JLabel bigBoxCodeLabel = new JLabel(ApplicationConstant.LABEL_TITLE_BIGBOXCODE);
		bigBoxCodeLabel.setBounds(25, 100, 70, 30);
		DefaultInputPanel bigBoxCodePanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		bigBoxCodePanel.setBounds(80, 100, 190, 30);
		this.add(bigBoxCodeLabel);
		this.add(bigBoxCodePanel);
		
		// ��ά���ı���.
		JLabel qrCodeTextLabel = new JLabel(ApplicationConstant.LABEL_TITLE_QRCODETEXT) ;
		qrCodeTextLabel.setBounds(25, 140, 745, 30);
		JTextArea qrCodeText = new JTextArea();
		qrCodeText.setBounds(25, 180, 745, 330);
		this.add(qrCodeTextLabel);
		this.add(qrCodeText);
		
		// ��һ�䰴ť.
		JButton nextBtn = new JButton(ApplicationConstant.BUTTON_TITLE_NEXTBTN);
		nextBtn.setBounds(300, 525, 80, 30);
		nextBtn.addActionListener(new BaseAction());
		this.add(nextBtn);
		
		// ������ť.
		JButton finishBtn = new JButton(ApplicationConstant.BUTTON_TITLE_FINISHBTN);
		finishBtn.setBounds(390, 525, 80, 30);
		finishBtn.addActionListener(new BaseAction());
		this.add(finishBtn);
	}

}
