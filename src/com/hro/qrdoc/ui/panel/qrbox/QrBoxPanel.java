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
	 * �����������ʾ��ǩ.
	 */
	private JLabel countLabel = new JLabel(ApplicationConstant.LABEL_TITLE_COUNT);
	
	/**
	 * ���������.
	 */
	private DefaultInputPanel countPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * ��������������ʾ��ǩ.
	 */
	private JLabel orderNumLabel = new JLabel(ApplicationConstant.LABEL_TITLE_ORDERNUM);
	
	/**
	 * ������������.
	 */
	private DefaultInputPanel orderNumPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * �������������.
	 */
	private JLabel bigBoxCodeLabel = new JLabel(ApplicationConstant.LABEL_TITLE_BIGBOXCODE);
	
	/**
	 * ���������������ʾ��ǩ.
	 */
	private DefaultInputPanel bigBoxCodePanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * װ���ά���ı�����ʾ��ǩ.
	 */
	private JLabel qrCodeTextLabel = new JLabel(ApplicationConstant.LABEL_TITLE_QRCODETEXT);
	
	/**
	 * װ���ά���ı���.
	 */
	private JTextArea qrCodeText = new JTextArea();
	
	/**
	 * ��һ�䰴ť.
	 */
	private JButton nextBtn = new JButton(ApplicationConstant.BUTTON_TITLE_NEXTBTN);
	
	/**
	 * ������ť.
	 */
	private JButton finishBtn = new JButton(ApplicationConstant.BUTTON_TITLE_FINISHBTN);
	
	/**
	 * �޲ι��캯��.
	 */
	public QrBoxPanel() 
	{
		initLayout();
	}
	
	/**
	 * ��ʼ����ά��װ��panel.
	 */
	private void initLayout() 
	{
		this.setLayout(null);
		
		// ���������.
		countLabel.setBounds(25, 20, 70, 35);
		countPanel.setBounds(80, 20, 300, 35);
		this.add(countLabel);
		this.add(countPanel);
		
		// �����������.
		orderNumLabel.setBounds(25, 60, 70, 35);
		orderNumPanel.setBounds(80, 60, 300, 35);
		this.add(orderNumLabel);
		this.add(orderNumPanel);
		
		// �����������.
		bigBoxCodeLabel.setBounds(25, 100, 70, 35);
		bigBoxCodePanel.setBounds(80, 100, 300, 35);
		this.add(bigBoxCodeLabel);
		this.add(bigBoxCodePanel);
		
		// ��ά���ı���.
		qrCodeTextLabel.setBounds(25, 140, 745, 30);
		qrCodeText.setBounds(25, 180, 745, 330);
		this.add(qrCodeTextLabel);
		this.add(qrCodeText);
		
		// ��һ�䰴ť.
		nextBtn.setBounds(300, 525, 80, 30);
		this.add(nextBtn);
		
		// ������ť.
		finishBtn.setBounds(390, 525, 80, 30);
		this.add(finishBtn);
	}

	/**
	 * ��ʼ����ά��װ���¼���.
	 */
	protected void initAction() 
	{
		// ��һ�䰴ť.
		nextBtn.addActionListener(new BaseAction());
		
		// ������ť.
		finishBtn.addActionListener(new BaseAction());
	}
	
}
