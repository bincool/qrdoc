/**
* @FileName: QrcodeDocFrame.java
* @Package: com.hro.qrdoc.ui
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrcodeDocFrame.java: ��ά��ɨ��װ����������ĵ�.
* @Author wchy����������(891946049).
* @Date 2018��6��4�� ����12:47:25.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import org.apache.log4j.Logger;
import com.hro.qrdoc.constant.ApplicationConstant;
import com.hro.qrdoc.ui.panel.base.DefaultInputPanel;


/**
* @ClassName: QrcodeDocFrame.java
* 
* @Description: 
* <p>
* ��ά��ɨ��װ����������ĵ�.
* </p>
* <p>
* ��ϸ��������ά��ɨ��װ����������ĵ�.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��6��4�� ����12:47:25.
* 
*/
public class QrcodeDocFrame 
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(QrcodeDocFrame.class);

	/**
	 * ������.
	 */
	private JFrame frame;
	
	public QrcodeDocFrame() 
	{
		LOGGER.info("Begin to init the main frame.");
		initialize();
		LOGGER.info("End to init the main frame.");
	}
	
	/**
	 * ��ȡframe.
	 * @return
	 *     frame.
	 */
	public JFrame getFrame() 
	{
		return frame;
	}

	/**
	 * ����frame.
	 * @param
	 *     frame.
	 */
	public void setFrame(JFrame frame) 
	{
		this.frame = frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		// ������.
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ApplicationConstant.FRAME_ICON_PATH));
		frame.setTitle(ApplicationConstant.FRAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)(dimension.getWidth()/6);
		int height = (int)(dimension.getHeight()/4);
		frame.setBounds(width, height, 600, 600);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		// ���������.
		DefaultInputPanel countPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		countPanel.setBounds(30, 20, 190, 30);
		
		// ���������.
		DefaultInputPanel orderNumPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		orderNumPanel.setBounds(30, 60, 190, 30);
		
		// �����������.
		DefaultInputPanel bigBoxCodePanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		bigBoxCodePanel.setBounds(30, 100, 190, 30);
		
		// ��ά���ı���.
		JTextArea qrCodeText = new JTextArea();
		qrCodeText.setBounds(30, 150, 535, 330);
		
		frame.add(countPanel);
		frame.add(orderNumPanel);
		frame.add(bigBoxCodePanel);
		frame.add(qrCodeText);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
}
