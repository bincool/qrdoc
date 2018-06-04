/**
* @FileName: QrcodeDocFrame.java
* @Package: com.hro.qrdoc.ui
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrcodeDocFrame.java: TODO һ�仰�����ļ�������.
* @Author wchy����������(891946049).
* @Date 2018��6��4�� ����12:47:25.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import org.apache.log4j.Logger;

import com.hro.qrdoc.constant.ApplicationConstant;


/**
* @ClassName: QrcodeDocFrame.java
* 
* @Description: 
* <p>
* TODO һ�仰��������������.
* </p>
* <p>
* TODO ��ϸ����.
* </p>
* <p>
* TODO ʾ������.
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
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)(dimension.getWidth()/2 - 750/2);
		int height = (int)(dimension.getHeight()/2 - 750/2);
		frame.setBounds(width, height, 750, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		HorsePanel horsePanel = DomainHelper.getInstance().getHorsePanel();
//		LayoutPanel layoutPanel = new LayoutPanel();
//		layoutPanel.setPreferredSize(new Dimension(150, 20));
		
//		frame.add(horsePanel, BorderLayout.CENTER);
//		frame.add(layoutPanel, BorderLayout.EAST);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
}
