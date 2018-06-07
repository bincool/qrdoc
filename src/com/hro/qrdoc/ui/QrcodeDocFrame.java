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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import org.apache.log4j.Logger;
import com.hro.qrdoc.constant.ApplicationConstant;
import com.hro.qrdoc.ui.panel.qrbox.QrBoxPanel;


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
	
	/**
	 * ��Ļγ��.
	 */
	private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	
	/**
	 * �޲ι��캯��.
	 */
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
		
		int width = (int)((dimension.getWidth() - 800) / 2);
		int height = (int)((dimension.getHeight() - 600) / 2);
		frame.setBounds(width, height, 800, 600);
		frame.setLayout(new BorderLayout());
		
		QrBoxPanel qrBoxPanel = new QrBoxPanel();
		frame.add(qrBoxPanel, BorderLayout.CENTER);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
}
