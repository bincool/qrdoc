/**
* @FileName: QrcodeDocFrame.java
* @Package: com.hro.qrdoc.ui
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrcodeDocFrame.java: 二维码扫描装箱计数生成文档.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月4日 下午12:47:25.
* @Content: 新增.
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
* 二维码扫描装箱计数生成文档.
* </p>
* <p>
* 详细描述：二维码扫描装箱计数生成文档.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月4日 下午12:47:25.
* 
*/
public class QrcodeDocFrame 
{
	
	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = Logger.getLogger(QrcodeDocFrame.class);

	/**
	 * 主窗体.
	 */
	private JFrame frame;
	
	public QrcodeDocFrame() 
	{
		LOGGER.info("Begin to init the main frame.");
		initialize();
		LOGGER.info("End to init the main frame.");
	}
	
	/**
	 * 获取frame.
	 * @return
	 *     frame.
	 */
	public JFrame getFrame() 
	{
		return frame;
	}

	/**
	 * 设置frame.
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
		// 主窗体.
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
		
		// 计数输入框.
		DefaultInputPanel countPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		countPanel.setBounds(30, 20, 190, 30);
		
		// 订单输入框.
		DefaultInputPanel orderNumPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		orderNumPanel.setBounds(30, 60, 190, 30);
		
		// 大箱码输入框.
		DefaultInputPanel bigBoxCodePanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		bigBoxCodePanel.setBounds(30, 100, 190, 30);
		
		// 二维码文本域.
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
